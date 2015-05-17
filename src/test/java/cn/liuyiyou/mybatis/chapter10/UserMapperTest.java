package cn.liuyiyou.mybatis.chapter10;

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

	@Test
	public void selectAllTest() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			List<User> users = userMapper.selectAll();
			System.out.println(users.size());
			
			List<User> users2 = userMapper.selectAll();
			System.out.println(users2.size());
			
			
			session.commit();
		} finally {
			session.close();
		}
	}
	
	@Test
	public void insertUserTest() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			int result = userMapper.updateById(49);
			Assert.assertEquals(1, result);
			session.commit();
		} finally {
			session.close();
		}
	}
}

