package cn.liuyiyou.mybatis.chapter04;

import cn.liuyiyou.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class UserMapperTest {

    private static SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        String resource = "chapter04/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }

    /**
     * 没有参数
     */
    @Test
    public void selectAllTest() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<User> users = session
                    .selectList("cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectAll");
            Assert.assertEquals(27, users.size());
            session.commit();
        } finally {
            session.close();
        }
    }

    /**
     * 一个参数
     */
    @Test
    public void selectByNameTest() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<User> users = session
                    .selectList(
                            "cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectByName",
                            "test");
            session.commit();
            Assert.assertEquals(9, users.size());
        } finally {
            session.close();
        }
    }

    /**
     * 两个参数
     */
    @Test
    public void selectByNameTestWithRowBounds() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            RowBounds rowBounds = new RowBounds(0, 5);
            List<User> users = session
                    .selectList(
                            "cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectByName",
                            "test", rowBounds);
            session.commit();
            Assert.assertEquals(5, users.size());
        } finally {
            session.close();
        }
    }

    /**
     * 错误测试：后台返回多个，却用了selectOne来接受
     */
    @Test
    public void selectOneTest() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            User user = session
                    .selectOne("cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectAll");
            Assert.fail();
            session.commit();
        } finally {
            session.close();
        }
    }

    @Test
    public void selectOneRightTest() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            User user = session
                    .selectOne("cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectOne");
            Assert.assertEquals(1, user.getId());

            session.commit();
        } finally {
            session.close();
        }
    }

    @Test
    public void selectByIdTest() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            User user = (User) session
                    .selectOne(
                            "cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectById",
                            10);
            Assert.assertEquals(11, user.getAge());
            session.commit();
        } finally {
            session.close();
        }
    }

}
