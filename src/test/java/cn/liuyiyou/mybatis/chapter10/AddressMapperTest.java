package cn.liuyiyou.mybatis.chapter10;

import cn.liuyiyou.mybatis.DBUtils;
import cn.liuyiyou.mybatis.QueryTemplate;
import cn.liuyiyou.mybatis.domain.chapter10.Address;
import cn.liuyiyou.mybatis.mapper.chapter10.AddressMapper;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddressMapperTest {


    @BeforeClass
    public static void beforeClass() {
        DBUtils.initHSQLData("chapter-10.sql");
    }

    @Test
    public void selectByIdTest() {
        Address address = QueryTemplate.template(sqlSession -> sqlSession.getMapper(AddressMapper.class).selectById(1));
        System.out.println(address.getCity());
    }

    /**
     * 非关联查询，更新后，缓存自动刷新
     */
    @Test
    public void updateTest() {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-HH-dd: hh:mm:ss");
        String cityName = sd.format(new Date());
        Address address = QueryTemplate.template(sqlSession -> sqlSession.getMapper(AddressMapper.class).selectById(1));
        System.out.println("old:" + address.getCity());
        address.setCity(cityName);
        int result = QueryTemplate.template(sqlSession -> sqlSession.getMapper(AddressMapper.class).updateById(address));
        Assert.assertEquals(1, result);
    }
}

