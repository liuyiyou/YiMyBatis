package cn.liuyiyou.mybatis.dao;

import cn.liuyiyou.mybatis.domain.User;

/***
 * @author: liuyiyou
 * @date: 2018/1/31
 */
public interface IUserRedis<String,User> {


    java.lang.String KEY_PREFIX = cn.liuyiyou.mybatis.domain.User.class.getSimpleName()+":";

    /**
     * 得到用户
     *
     * @param key
     * @return
     */
    User get(String key);


    void set(String key,User user);
}
