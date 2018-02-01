package cn.liuyiyou.mybatis.chapter20;

import cn.liuyiyou.mybatis.dao.BaseRedis;
import cn.liuyiyou.mybatis.dao.IUserRedis;
import cn.liuyiyou.mybatis.dao.UserRedis;
import cn.liuyiyou.mybatis.domain.User;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:chapter20/spring-config.xml" })
public class UserRedisTest {


    @Autowired
    private BaseRedis<String,String> baseRedis;

    @Autowired
    private IUserRedis<String,User> userRedis;

    Jedis jedis = new Jedis("127.0.0.1");

    @Autowired
    JedisPoolConfig jedisPoolConfig;


    @Test
    public void jedisPing(){

        jedis.ping();
    }

    @Test
    public void jedisSet(){
        User user = new User();
        user.setId(1);
        user.setName("中文");
        user.setAge(18);
        jedis.set(IUserRedis.KEY_PREFIX+"3",JSON.toJSONString(user));
        System.out.println(JSON.toJSONString(user));
    }


    @Test
    public void test(){
        System.out.println(baseRedis.increment("User:001"));
        System.out.println(baseRedis.increment("User:001",2L));

    }

    @Test
    public void keyTest(){
        System.out.println(IUserRedis.KEY_PREFIX+1);
    }

    @Test
    public void setTest(){
        User user = new User();
        user.setId(1);
        user.setName("lyy");
        user.setAge(18);
        userRedis.set(IUserRedis.KEY_PREFIX+"1",user);
    }

    @Test
    public void getTest(){
        //"{\"id\":2,\"name\":null,\"age\":18}"
        User user = new User();
        user.setId(1);
        user.setName("中文");
        user.setAge(18);
        userRedis.set(IUserRedis.KEY_PREFIX+"1",user);
        user = userRedis.get(IUserRedis.KEY_PREFIX + "1");
        System.out.println(JSON.toJSON(user));
    }

    @Test
    public void getJaksonTest(){
        //"{\"@class\":\"cn.liuyiyou.mybatis.domain.User\",\"id\":2,\"name\":null,\"age\":18}"
        User user = new User();
        user.setId(2);
        user.setName(null);
        user.setAge(18);
        userRedis.set(IUserRedis.KEY_PREFIX+"2",user);
        user = userRedis.get(IUserRedis.KEY_PREFIX + "2");
        System.out.println(user);
    }

}

