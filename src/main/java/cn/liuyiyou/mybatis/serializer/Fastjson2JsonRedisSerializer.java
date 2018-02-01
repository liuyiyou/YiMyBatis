package cn.liuyiyou.mybatis.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.nio.charset.Charset;

/***
 * @author: liuyiyou
 * @date: 2018/2/1
 */
public class Fastjson2JsonRedisSerializer<T extends Serializable> implements RedisSerializer<T> {

    private Class<T> clazz;

    public Fastjson2JsonRedisSerializer() {
//        if (clazz == null) {
//            clazz =
//                    (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
//        }

    }

    public Fastjson2JsonRedisSerializer(Class<T> clazz) {
        super();
        this.clazz = clazz;
    }

    @Override
    public byte[] serialize(T t) throws SerializationException {
        if (t == null) {
            return new byte[0];
        }
        return JSON.toJSONString(t, SerializerFeature.WriteClassName).getBytes(Charset.defaultCharset());

    }

    @Override
    public T deserialize(byte[] bytes) throws SerializationException {
        if (bytes == null || bytes.length <= 0)
            return null;
        String str = new String(bytes, Charset.defaultCharset());
        return JSON.parseObject(str, clazz);
    }
}
