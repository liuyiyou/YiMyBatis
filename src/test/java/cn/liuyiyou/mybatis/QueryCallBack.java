package cn.liuyiyou.mybatis;

import org.apache.ibatis.session.SqlSession;

/***
 * @author: liuyiyou
 * @date: 2018/1/24
 */
@FunctionalInterface
public interface QueryCallBack<T> {

    T doQuery(SqlSession sqlSession);
}
