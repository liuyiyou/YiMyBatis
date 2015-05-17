package cn.liuyiyou.mybatis.chapter06;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import junit.framework.Assert;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.liuyiyou.mybatis.domain.chapter06.Course;
import cn.liuyiyou.mybatis.mapper.chapter06.CourseMapper;

public class CourseMapperTest {

	private static SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception {
		String resource = "chapter06/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	}

	@Test
	public void finAllTest() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
		try {
			List<Course> courses = courseMapper.selectAll();
			Assert.assertEquals(5, courses.size());
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

}
