package cn.liuyiyou.mybatis.chapter11;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cn.liuyiyou.mybatis.domain.chapter10.User;
import cn.liuyiyou.mybatis.mapper.chapter10.UserMapper;

public class UserMapperTest {

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

	
	
	/**
	 * 关联查询后，缓存不刷新，得到的还是之前更新的值
	 */
	@Test
	public void getDetailByIdTest() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = userMapper.getDetailById(7);
			Assert.assertEquals("liuyiyou", user.getName());
			Assert.assertEquals(1+"", user.getAddress().getId()+"");
			System.out.println(user.getAddress().getCity());
			session.commit();
		} finally {
			session.close();
		}
	}
}

