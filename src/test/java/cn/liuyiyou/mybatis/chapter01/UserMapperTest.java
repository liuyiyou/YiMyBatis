package cn.liuyiyou.mybatis.chapter01;

import cn.liuyiyou.mybatis.DBUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static cn.liuyiyou.mybatis.QueryTemplate.template;

public class UserMapperTest {

    @Before
    public void setUp() {
        DBUtils.initHSQLData("chapter-01.sql");
    }

    /**
     * 增加测试
     */
    @Test
    public void testInsertUser() {
        int result= template(sqlsession->sqlsession.insert("cn.liuyiyou.mybatis.mapper.chapter01.UserMapper.insertUser"));
        Assert.assertEquals(1, result);

    }


}
