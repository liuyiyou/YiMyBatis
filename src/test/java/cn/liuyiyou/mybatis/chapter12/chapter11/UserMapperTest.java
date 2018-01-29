package cn.liuyiyou.mybatis.chapter12.chapter11;

import cn.liuyiyou.mybatis.DBUtils;
import cn.liuyiyou.mybatis.mapper.chapter12.UserMapper;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static cn.liuyiyou.mybatis.QueryTemplate.templae;

public class UserMapperTest {

    @BeforeClass
    public static void beforeClass() throws Exception {
        DBUtils.initHSQLData("chapter-04.sql");
    }

    /**
     * #和$的区别
     */
    @Test
    public void selectUserByNameOrderByIdTest() {
        Map<String, Object> params = new HashMap<>();
        params.put("name", "lyy");
        params.put("orderBy", "id");
        templae(sqlSession -> sqlSession.getMapper(UserMapper.class).selectUserByNameOrderById(params));
    }
}

