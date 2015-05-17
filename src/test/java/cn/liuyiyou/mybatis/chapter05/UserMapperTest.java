package cn.liuyiyou.mybatis.chapter05;

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

import cn.liuyiyou.mybatis.domain.chapter05.User;
import cn.liuyiyou.mybatis.mapper.chapter05.UserMapper;

public class UserMapperTest {

	private static SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception {
		String resource = "chapter05/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	}

	/**
	 * 没有参数
	 */
	@Test
	public void selectAllTest() {
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		try {
			List<User> users = userMapper.selectAll();
			Assert.assertEquals(27, users.size());
			session.commit();
		} finally {
			session.close();
		}
	}
	
	/**
	 * 错误测试：后台返回多个，却用了selectOne来接受，如果使用了接口，就不会产生该错误
	 */
	@Test
	public void selectOneTest() {
		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			User user = session
					.selectOne("cn.liuyiyou.mybatis.mapper.chapter04.UserMapper.selectAll");
			Assert.fail();
			session.commit();
		} finally {
			session.close();
		}
	}

	@Test
	public void selectOneRightTest() {
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		try {
			User user = userMapper.selectOne();
			Assert.assertEquals(1, user.getId());
			
			
			session.commit();
		} finally {
			session.close();
		}
	}

	
	@Test
	public void selectByIdTest() {
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		try {
			User user = userMapper.selectById(10);
			Assert.assertEquals(11, user.getAge());
			session.commit();
		} finally {
			session.close();
		}
	}

}
