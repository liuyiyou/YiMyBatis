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

    Jedis jedis = new Jedis("127.0.0.1");

    @Autowired
    JedisPoolConfig jedisPoolConfig;


    @Test
    public void jedisPing(){
        jedis.ping();
    }



}

