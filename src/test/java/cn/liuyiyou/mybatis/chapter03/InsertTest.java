package cn.liuyiyou.mybatis.chapter03;

import cn.liuyiyou.mybatis.DBUtils;
import cn.liuyiyou.mybatis.domain.User;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cn.liuyiyou.mybatis.QueryTemplate.template;

public class InsertTest {

    @BeforeClass
    public static void beforeClass() {
        DBUtils.initHSQLData("chapter-03.sql");
    }

    /**
     * 没有参数
     */
    @Test
    public void insertUserTest() {
        String statment = "cn.liuyiyou.mybatis.mapper.chapter03.UserMapper.insertUser";
        int result = template(sqlSession -> sqlSession.insert(statment));
        Assert.assertEquals(1, result);
    }



    /**
     * 参数是实体类型：
     */
    @Test
    public void insertUserEntityTest() {
        String statment = "cn.liuyiyou.mybatis.mapper.chapter03.UserMapper.insertUserEntity";
        User user = new User();
        user.setName("insert1");
        user.setAge(1);
        int result = template(sqlSession -> sqlSession.insert(statment, user));
        Assert.assertEquals(1, result);
    }

    /**
     * 参数是Map类型：
     */
    @Test
    public void insertUserMapTest() {
        String statment = "cn.liuyiyou.mybatis.mapper.chapter03.UserMapper.insertUserMap";
        Map<String, Object> user = new HashMap<String, Object>();
        user.put("name", "insert2");
        user.put("age", 2);
        int result = template(sqlSession -> sqlSession.insert(statment, user));
        Assert.assertEquals(1, result);
    }


    /**
     * 批量插入，参数是List<User>数组
     */
    @Test
    public void batchInsertListTest() {
        String statment = "cn.liuyiyou.mybatis.mapper.chapter03.UserMapper.batchInsertList";
        List<User> users = new ArrayList<User>();
        for (int i = 3; i <= 5; i++) {
            User user = new User();
            user.setName("insert" + i);
            user.setAge(i);
            users.add(user);
        }
        int result = template(sqlSession -> sqlSession.insert(statment, users));
        Assert.assertEquals(3, result);
    }

    /**
     * 批量插入，参数是Map
     */
    @Test
    public void batchInsertMapTest() {
        String statment = "cn.liuyiyou.mybatis.mapper.chapter03.UserMapper.batchInsertMap";
        List<Map<String, Object>> users = new ArrayList<Map<String, Object>>();
        for (int i = 6; i <= 8; i++) {
            Map<String, Object> user = new HashMap<String, Object>();
            user.put("name", "insert" + i);
            user.put("age", i);
            users.add(user);
        }
        int result = template(sqlSession -> sqlSession.insert(statment, users));
        Assert.assertEquals(3, result);
    }

    /**
     * 返回主键
     */
    @Test
    public void insertAndRestunKey1Test() {
        User user = new User();
        user.setName("insert1");
        user.setAge(1);
        String statment = "cn.liuyiyou.mybatis.mapper.chapter03.UserMapper.insertReturnId";
        int result = template(sqlSession -> sqlSession.insert(statment,user));
        Assert.assertEquals(1, result);
        Assert.assertTrue(user.getId() > 1);
    }

    /**
     * 返回主键2
     */
    @Test
    public void insertAndRestunKey2Test() {
        User user = new User();
        user.setName("insert1");
        user.setAge(1);
        String statment = "cn.liuyiyou.mybatis.mapper.chapter03.UserMapper.insertReturnId2";
        int result = template(sqlSession -> sqlSession.insert(statment, user));
        Assert.assertTrue(user.getId() > 1);
        Assert.assertEquals(1, result);
    }

}
