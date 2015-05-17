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

import cn.liuyiyou.mybatis.domain.chapter06.Student;
import cn.liuyiyou.mybatis.mapper.chapter06.StudentMapper;

public class StudentMapperTest {

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
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		try {
			List<Student> students = studentMapper.selectAll();
			System.out.println(students.get(0).getAddress());
			Assert.assertEquals(10, students.size());
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	
	
	@Test
	public void finAllTest2() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		try {
			Student student = studentMapper.selectStudentDetailById(1);
			System.out.println(student.getName());
			System.out.println(student.getAddress().getCity());
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

}
