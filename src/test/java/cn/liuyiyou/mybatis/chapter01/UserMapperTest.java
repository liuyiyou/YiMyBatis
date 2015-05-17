package cn.liuyiyou.mybatis.chapter01;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserMapperTest {

	private static SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception {
		String resource = "chapter01/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	}

	/**
	 * 增加测试
	 */
	@Test
	public void testInsertUser() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			int result = session
					.insert("cn.liuyiyou.mybatis.mapper.chapter01.UserMapper.insertUser");
			Assert.assertEquals(1, result);
			session.commit();
		} finally {
			session.close();
		}
	}
}
