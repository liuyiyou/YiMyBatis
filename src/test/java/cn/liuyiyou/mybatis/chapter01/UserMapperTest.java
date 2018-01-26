package cn.liuyiyou.mybatis.chapter01;

import cn.liuyiyou.mybatis.DBUtils;
import cn.liuyiyou.mybatis.QueryTemplate;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static cn.liuyiyou.mybatis.QueryTemplate.templae;

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
        int result= templae(sqlsession->sqlsession.insert("cn.liuyiyou.mybatis.mapper.chapter01.UserMapper.insertUser"));
        Assert.assertEquals(1, result);

    }


}
