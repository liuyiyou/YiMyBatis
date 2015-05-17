package cn.liuyiyou.mybatis.chapter02;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cn.liuyiyou.mybatis.domain.chapter02.User;

public class UserMapperTest {

	private static SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception {
		String resource = "chapter02/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	}

	/**
	 * 删除测试：没有参数
	 */
	@Test
	public void deleteUserTest() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			int result = session
					.delete("cn.liuyiyou.mybatis.mapper.chapter02.UserMapper.deleteUser");
			Assert.assertEquals(1, result);
			session.commit();
		} finally {
			session.close();
		}
	}

	/**
	 * 删除测试：根据主键删除用户（一个参数）
	 */
	@Test
	public void deleteUserByIdTest() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			int result = session
					.delete("cn.liuyiyou.mybatis.mapper.chapter02.UserMapper.deleteById",
							34);
			Assert.assertEquals(1, result);
			session.commit();
		} finally {
			session.close();
		}
	}

	/**
	 * 删除测试：根据非主键删除用户（一个参数）
	 */
	@Test
	public void deleteUserByName() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			int result = session
					.delete("cn.liuyiyou.mybatis.mapper.chapter02.UserMapper.deleteByName",
							"1");
			Assert.assertEquals(5, result);
			session.commit();
		} finally {
			session.close();
		}
	}

	/**
	 * 删除测试：根据实体或者Map删除用户（只能传递一个参数，所以放在实体或者Map中）
	 */
	@Test
	public void deleteUserByEntity() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			User user = new User();
			user.setAge(100);
			user.setName("liu");
			int result = session
					.delete("cn.liuyiyou.mybatis.mapper.chapter02.UserMapper.deleteByEntity",
							user);
			Assert.assertEquals(0, result);
			session.commit();
		} finally {
			session.close();
		}
	}

	/**
	 * 删除测试：根据实体或者Map删除用户（只能传递一个参数，所以放在实体或者Map中）
	 */
	@Test
	public void deleteUserByMap() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", "");
			// 如果是null的话，在映射文件拼出的sql语句则为 xxxx where age = null
			// 这个虽然不报错。但是却无法查询。因为针对null
			// mysql是 xxx where age is null来进行查询的
			map.put("age", 1);
			int result = session
					.delete("cn.liuyiyou.mybatis.mapper.chapter02.UserMapper.deleteByMap",
							map);
			Assert.assertEquals(1, result);
			session.commit();
		} finally {
			session.close();
		}
	}

	/**
	 * 删除测试：批量删除，参数是数组
	 */
	@Test
	public void deleteBatch() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			int result = session
					.delete("cn.liuyiyou.mybatis.mapper.chapter02.UserMapper.deleteBatch",
							new Integer[] { 33, 34 });
			Assert.assertEquals(1, result);
			session.commit();
		} finally {
			session.close();
		}
	}

	/**
	 * 删除测试：批量删除，参数是List
	 */
	@Test
	public void deleteBatch2() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			List<Integer> list = new ArrayList<Integer>();
			list.add(new Integer(33));
			list.add(new Integer(34));
			int result = session
					.delete("cn.liuyiyou.mybatis.mapper.chapter02.UserMapper.deleteBatch2",
							list);
			Assert.assertEquals(2, result);
			session.commit();
		} finally {
			session.close();
		}
	}
}