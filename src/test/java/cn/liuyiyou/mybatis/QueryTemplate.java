package cn.liuyiyou.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/***
 * @author: liuyiyou
 * @date: 2018/1/24
 */
public class QueryTemplate {

    private static SqlSessionFactory sqlSessionFactory;

    public static <T> T templae(QueryCallBack<T> queryCallBack) {
        T result = null;
        SqlSession session = null;
        InputStream inputStream = null;
        try {
            String resource = "mybatis-config.xml";
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session = sqlSessionFactory.openSession();
            //具体调用靠其子类实现
            result = queryCallBack.doQuery(session);
            session.commit();
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

//    public static void templae(QueryNoCallBack callBack) {
//        SqlSession session = null;
//        InputStream inputStream = null;
//        try {
//            String resource = "mybatis-mysql-config.xml";
//            inputStream = Resources.getResourceAsStream(resource);
//            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//            session = sqlSessionFactory.openSession();
//            //具体调用靠其子类实现
//            callBack.doQuery(session);
//            session.commit();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//            try {
//                if (inputStream != null) {
//                    inputStream.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
