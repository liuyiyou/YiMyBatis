package cn.liuyiyou.mybatis.chapter21;

import cn.liuyiyou.mybatis.domain.User;
import cn.liuyiyou.mybatis.mapper.chapter21.UserMapper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

import java.io.IOException;

import static cn.liuyiyou.mybatis.QueryTemplate.template;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


/**
 * 这样一个实例：
 * <p>
 * <p>
 * xxx service{
 * <p>
 * //addDB       回滚
 * //addRedis  // 回滚不回滚
 * // throw Excetion
 * <p>
 * <p>
 * getReids
 * updateDb
 * update Redis
 * updateDb
 * get redis //拿到的是getRedis 中的内容
 * <p>
 * updateDB  //1
 * <p>
 * getDB  //get 1
 * <p>
 * updatDB // 2
 * <p>
 * getDB  //2
 * }
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:chapter21/spring-config.xml"})
public class UserRedisTest {

    @Autowired
    private UserMapper userMapper;

    Jedis jedis = new Jedis("127.0.0.1");

    @Autowired
    JedisPoolConfig jedisPoolConfig;

    @Test
    public void jedisPing() {
        jedis.ping();
    }

    @Test
    @Transactional
    public void selectAndUpdate() throws IOException {
        Transaction tx = jedis.multi();
        User user = userMapper.selectById(1);
        assertEquals("lyy",user.getName());
        tx.set(User.class.getSimpleName() + user.getId(), JSON.toJSONString(user));
        user.setName("测试");
        userMapper.update(user);
        assertEquals("测试",user.getName());
        tx.set(User.class.getSimpleName()+user.getId(), JSON.toJSONString(user));
        //这里没问题
//        int i = 1/0;
        Response<String> stringResponse = tx.get(User.class.getSimpleName() + user.getId());
        tx.exec();
        int i = 1/0;
        String s = stringResponse.get();
        User cacheUser = JSONObject.parseObject(s,User.class);
        assertEquals(cacheUser.getName(),user.getName());

    }

    @Test
    public void redisTx() throws IOException {
        Transaction tx = jedis.multi();
        User user = userMapper.selectById(1);
        assertEquals("lyy",user.getName());
        tx.set(User.class.getSimpleName()+user.getId(), JSON.toJSONString(user));
        Response<String> stringResponse = tx.get(User.class.getSimpleName() + user.getId());
        //Please close pipeline or multi block before calling this method.
        tx.exec();
        String s = stringResponse.get();
        System.out.println(s);

    }

    @Test(expected = Exception.class)
    public void selectAllTest() {
        User user = template(sqlSession -> sqlSession.getMapper(UserMapper.class).selectById(1));
        assertNotNull(user);
    }
}