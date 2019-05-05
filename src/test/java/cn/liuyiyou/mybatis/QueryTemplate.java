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

    public static <T> T template(QueryCallBack<T> queryCallBack) {
        SqlSession session = null;
        InputStream inputStream = null;
        T result = null;
        try {
            String resource = "mybatis-config.xml";
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session = sqlSessionFactory.openSession();
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
}
