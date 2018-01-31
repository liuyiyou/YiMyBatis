package cn.liuyiyou.mybatis.chapter04;

import cn.liuyiyou.mybatis.DBUtils;
import cn.liuyiyou.mybatis.domain.User;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.apache.ibatis.session.RowBounds;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static cn.liuyiyou.mybatis.QueryTemplate.template;


public class SimpleSelectTest {


    @BeforeClass
    public static void beforeClass() throws Exception {
        DBUtils.initHSQLData("chapter-04.sql");
    }

    /**
     * 错误测试：后台返回多个，却用了selectOne来接受
     */
    @Test(expected = TooManyResultsException.class)
    public void selectOneTest() {
        String statment = "cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectListNoParam";
        template(sqlSession -> sqlSession.selectOne(statment));
    }


    @Test
    public void selectOneNoParamTest() {
        String statment = "cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectOneNoParam";
        User user = template(sqlSession -> sqlSession.selectOne(statment));
        Assert.assertNotNull(user);
    }

    @Test
    public void selectOneWithParamTest() {
        String statment = "cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectOneWithParam";
        User user = template(sqlSession -> sqlSession.selectOne(statment, 1));
        Assert.assertNotNull(user);
    }

    /**
     * 没有参数
     */
    @Test
    public void selectAllTest() {
        String statment = "cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectListNoParam";
        List<User> users = template(sqlSession -> sqlSession.selectList(statment));
        Assert.assertEquals(10, users.size());
    }

    /**
     * 一个参数
     */
    @Test
    public void selectByNameTest() {
        String statment = "cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectListWithParam";
        List<User> users = template(sqlSession -> sqlSession.selectList(statment, "test"));
        Assert.assertEquals(2, users.size());
    }

    /**
     * 两个参数
     */
    @Test
    public void selectByNameTestWithRowBounds() {
        String statment = "cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectListWithParamAndRowBounds";
        RowBounds rowBounds = new RowBounds(0, 1);
        List<User> users = template(sqlSession -> sqlSession.selectList(statment, "test", rowBounds));
        Assert.assertEquals(1, users.size());
    }


    /**
     * 返回Map，其中Map的key为指定列的列名
     */
    @Test
    public void selectMapNoParamTest() {
        String statment = "cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectMapNoParam";
        Map<Object, List<User>> userMap = template(sqlSession -> sqlSession.selectMap(statment, "name"));
        Assert.assertEquals(6, userMap.size());
    }

    /**
     * 返回Map，其中Map的key为指定列的列名
     */
    @Test
    public void selectMapWithParamTest() {
        String statment = "cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectMapWithParam";
        Map<Object, List<User>> userMap = template(sqlSession -> sqlSession.selectMap(statment, "lyy", "id"));
        Assert.assertEquals(2, userMap.size());
    }


    @Test
    public void selectMapWithParamAndBoundsTest() {
        RowBounds rowBounds = new RowBounds(0, 1);
        String statment = "cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectMapWithParamAndBounds";
        Map<Object, List<User>> userMap = template(sqlSession -> sqlSession.selectMap(statment, "lyy", "id", rowBounds));
        Assert.assertEquals(1, userMap.size());
    }

    @Test
    public void selectTest() {
        String statment = "cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectWithNoParams";
        template(sqlSession -> {
            sqlSession.select(statment, context -> System.out.println(context.getResultObject()));
            return null;
        });
    }


//    private <T> T template(QueryCallBack<T> queryCallBack) {
//        SqlSession session = sqlSessionFactory.openSession();
//        T result = null;
//        try {
//            result = queryCallBack.doQuery(session);
//            session.commit();
//        } finally {
//            session.close();
//        }
//        return result;
//    }

}
