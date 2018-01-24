package cn.liuyiyou.mybatis;

import org.apache.ibatis.session.SqlSession;

/***
 * @author: liuyiyou
 * @date: 2018/1/24
 */
public interface QueryCallBack<T> {

    T doQuery(SqlSession sqlSession);

//    default <T> T templae(QueryCallBack<T> queryCallBack) {
//        SqlSession session = sqlSessionFactory.openSession();
//        T result = null;
//        try {
//            result = queryCallBack.doQuery(session);
//            session.commit();
//        } finally {
//            session.close();
//        }
//        return result;
//    }
}
