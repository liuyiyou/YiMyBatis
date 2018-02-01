package cn.liuyiyou.mybatis.dao;


import cn.liuyiyou.mybatis.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

/***
 * @author: liuyiyou
 * @date: 2018/1/31
 */
@Repository
public class UserRedis implements IUserRedis<String, User>, InitializingBean {


    @Autowired
    private RedisTemplate<String, User> redisTemplate;



    @Override
    public User get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public void set(String key, User user) {
        redisTemplate.opsForValue().set(key, user);
    }

    @Override
    public void afterPropertiesSet() {
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(User.class));
//        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
    }
}
