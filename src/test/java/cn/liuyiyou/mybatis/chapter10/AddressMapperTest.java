package cn.liuyiyou.mybatis.chapter10;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cn.liuyiyou.mybatis.domain.chapter10.Address;
import cn.liuyiyou.mybatis.mapper.chapter10.AddressMapper;
import cn.liuyiyou.mybatis.mapper.chapter10.UserMapper;

public class AddressMapperTest {

	private static SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception {
		String resource = "chapter10/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	}

	@Test
	public void selectByIdTest() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			AddressMapper addressMapper = session.getMapper(AddressMapper.class);
			Address address = addressMapper.selectById(1);
			//String city = address.getCity()+ new Date();
			
			System.out.println(address.getCity());
			session.commit();
		} finally {
			session.close();
		}
	}
	
	/**
	 * 非关联查询，更新后，缓存自动刷新
	 */
	@Test
	public void updateTest() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			AddressMapper addressMapper = session.getMapper(AddressMapper.class);
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-HH-dd: hh:mm:ss");
			String cityName = sd.format(new Date());
			Address address = addressMapper.selectById(1);
			System.out.println("old:"+ address.getCity());
			address.setCity(cityName);
			int result = addressMapper.updateById(address);
			Assert.assertEquals(1, result);
			session.commit();
		} finally {
			session.close();
		}
	}
}

