package cn.liuyiyou.mybatis.chapter03;

import cn.liuyiyou.mybatis.DBUtils;
import cn.liuyiyou.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserMapperTest {

    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void beforeClass() throws Exception {
        DBUtils.initHSQLData("chapter-03.sql");
        String resource = "mybatis-config.xml";
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
    public void insertUserTest() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            int result = session.update("cn.liuyiyou.mybatis.mapper.chapter03.UserMapper.insertUser");
            Assert.assertEquals(1, result);
            session.commit();
        } finally {
            session.close();
        }
    }

    /**
     * 参数是实体类型：
     */
    @Test
    public void insertUserEntityTest() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            User user = new User();
            user.setName("insert1");
            user.setAge(1);
            int result = session.update("cn.liuyiyou.mybatis.mapper.chapter03.UserMapper.insertUserEntity", user);
            Assert.assertEquals(1, result);
            session.commit();
        } finally {
            session.close();
        }
    }

    /**
     * 参数是Map类型：
     */
    @Test
    public void insertUserMapTest() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Map<String, Object> user = new HashMap<String, Object>();
            user.put("name", "insert2");
            user.put("age", 2);
            int result = session.update("cn.liuyiyou.mybatis.mapper.chapter03.UserMapper.insertUserMap", user);
            Assert.assertEquals(1, result);
            session.commit();
        } finally {
            session.close();
        }
    }


    /**
     * 批量插入，参数是List<User>数组
     */
    @Test
    public void batchInsertListTest() {
        SqlSession session = sqlSessionFactory.openSession();
        try {

            List<User> users = new ArrayList<User>();
            for (int i = 3; i <= 5; i++) {
                User user = new User();
                user.setName("insert" + i);
                user.setAge(i);
                users.add(user);
            }
            int result = session.update("cn.liuyiyou.mybatis.mapper.chapter03.UserMapper.batchInsertList", users);
            Assert.assertEquals(3, result);
            session.commit();
        } finally {
            session.close();
        }
    }

    /**
     * 批量插入，参数是Map
     */
    @Test
    public void batchInsertMapTest() {
        SqlSession session = sqlSessionFactory.openSession();
        try {

            List<Map<String, Object>> users = new ArrayList<Map<String, Object>>();
            for (int i = 6; i <= 8; i++) {
                Map<String, Object> user = new HashMap<String, Object>();
                user.put("name", "insert" + i);
                user.put("age", i);
                users.add(user);
            }
            int result = session.update("cn.liuyiyou.mybatis.mapper.chapter03.UserMapper.batchInsertMap", users);
            Assert.assertEquals(3, result);
            session.commit();
        } finally {
            session.close();
        }
    }
}
