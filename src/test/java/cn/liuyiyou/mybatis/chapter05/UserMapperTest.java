package cn.liuyiyou.mybatis.chapter05;

import cn.liuyiyou.mybatis.DBUtils;
import cn.liuyiyou.mybatis.domain.User;
import cn.liuyiyou.mybatis.mapper.chapter05.UserMapper;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static cn.liuyiyou.mybatis.QueryTemplate.templae;

public class UserMapperTest {


    @BeforeClass
    public static void beforeClass() {
        DBUtils.initHSQLData("chapter-05.sql");
    }

    /**
     * 没有参数
     */
    @Test
    public void selectAllTest() {
        List<User> users = templae(sqlSession -> sqlSession.getMapper(UserMapper.class).selectAll());
        Assert.assertEquals(10, users.size());
    }


}
