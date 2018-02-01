package cn.liuyiyou.mybatis.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.stereotype.Repository;

import java.lang.reflect.ParameterizedType;

/***
 *
 * redisTemplate.opsForValue();//操作字符串
 * redisTemplate.opsForHash();//操作hash
 * redisTemplate.opsForList();//操作list
 * redisTemplate.opsForSet();//操作set
 * redisTemplate.opsForZSet();//操作有序set
 * @author: liuyiyou
 * @date: 2018/1/31
 */
@Repository
public class BaseRedis<String, V> implements InitializingBean {

    private Class clazz = Object.class;

    @Autowired
    private RedisTemplate<String, V> redisTemplate;

    /**
     * 键自增+1
     *
     * @param key
     * @return
     */
    public Long increment(final String key) {
        return increment(key, null);
    }

    /**
     * 键自增+step
     *
     * @param key  键
     * @param step 自增步长
     * @return
     */
    public Long increment(final String key, Long step) {
        if (step == null) {
            step = 1L;
        }
        return redisTemplate.opsForValue().increment(key, step);
    }


    /**
     * 通过键得到值
     *
     * @param key
     * @return
     */
    public V get(final String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(clazz));
    }
}
