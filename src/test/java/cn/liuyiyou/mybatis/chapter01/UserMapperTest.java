package cn.liuyiyou.mybatis.chapter01;

import cn.liuyiyou.mybatis.DBUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class UserMapperTest {

    private static SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {

        DBUtils.initData("chapter-01.sql");
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }

    /**
     * 增加测试
     */
    @Test
    public void testInsertUser() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            int result = session
                    .insert("cn.liuyiyou.mybatis.mapper.chapter01.UserMapper.insertUser");
            Assert.assertEquals(1, result);
            session.commit();
        } finally {
            session.close();
        }
    }


}
