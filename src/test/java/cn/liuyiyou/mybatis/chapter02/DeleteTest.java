package cn.liuyiyou.mybatis.chapter02;

import cn.liuyiyou.mybatis.DBUtils;
import cn.liuyiyou.mybatis.domain.User;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cn.liuyiyou.mybatis.QueryTemplate.templae;


public class DeleteTest {

    @BeforeClass
    public static void beforeClass() throws Exception {
        DBUtils.initHSQLData("chapter-02.sql");
    }

    /**
     * 删除测试：没有参数
     */
    @Test
    public void deleteUserTest() {
        int result = templae(sqlSession -> sqlSession.delete("cn.liuyiyou.mybatis.mapper.chapter02.UserMapper.deleteUser"));
        Assert.assertEquals(1, result);
    }

    /**
     * 删除测试：根据主键删除用户（一个参数）
     */
    @Test
    public void deleteUserByIdTest() {
        int result = templae(sqlSession -> sqlSession.delete("cn.liuyiyou.mybatis.mapper.chapter02.UserMapper.deleteById",
                2));
        Assert.assertEquals(1, result);
    }

    /**
     * 删除测试：根据非主键删除用户（一个参数）
     */
    @Test
    public void deleteUserByName() {
        int result = templae(sqlSession -> sqlSession.delete("cn.liuyiyou.mybatis.mapper.chapter02.UserMapper.deleteByName",
                "test"));
        Assert.assertEquals(2, result);
    }

    /**
     * 删除测试：根据实体或者Map删除用户（只能传递一个参数，所以放在实体或者Map中）
     */
    @Test
    public void deleteUserByEntity() {

        User user = new User();
        user.setAge(100);
        user.setName("liu");
        int result = templae(sqlSession -> sqlSession.delete("cn.liuyiyou.mybatis.mapper.chapter02.UserMapper.deleteByEntity",
                user));
        Assert.assertEquals(1, result);
    }

    /**
     * 删除测试：根据实体或者Map删除用户（只能传递一个参数，所以放在实体或者Map中）
     */
    @Test
    public void deleteUserByMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "you");
        // 如果是null的话，在映射文件拼出的sql语句则为 xxxx where age = null
        // 这个虽然不报错。但是却无法查询。因为针对null
        // mysql是 xxx where age is null来进行查询的
        map.put("age", 1);
        int result = templae(sqlSession -> sqlSession.delete("cn.liuyiyou.mybatis.mapper.chapter02.UserMapper.deleteByMap",
                map));
        Assert.assertEquals(1, result);
    }

    /**
     * 删除测试：批量删除，参数是数组
     */
    @Test
    public void deleteBatch() {
        int result = templae(sqlSession -> sqlSession.delete("cn.liuyiyou.mybatis.mapper.chapter02.UserMapper.deleteBatch",
                new Integer[]{7, 8}));
        Assert.assertEquals(2, result);
    }

    /**
     * 删除测试：批量删除，参数是List
     */
    @Test
    public void deleteBatch2() {
        List<Integer> list = Arrays.asList(9, 10);
        int result = templae(sqlSession -> sqlSession.delete("cn.liuyiyou.mybatis.mapper.chapter02.UserMapper.deleteBatch2",
                list));
        Assert.assertEquals(2, result);
    }
}
