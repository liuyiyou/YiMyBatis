package cn.liuyiyou.mybatis.chapter06;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import cn.liuyiyou.mybatis.DBUtils;
import junit.framework.Assert;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.liuyiyou.mybatis.domain.chapter06.Course;
import cn.liuyiyou.mybatis.mapper.chapter06.CourseMapper;

import static junit.framework.TestCase.assertEquals;

public class CourseMapperTest {

	private static SqlSessionFactory sqlSessionFactory;

	@BeforeClass
	public static void beforeClass() {
		DBUtils.initHSQLData("chapter-06.sql");
	}

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
			assertEquals(3, courses.size());
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

}
