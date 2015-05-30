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
import cn.liuyiyou.mybatis.domain.chapter06.Teacher;
import cn.liuyiyou.mybatis.mapper.chapter06.TeacherMapper;
import cn.liuyiyou.mybatis.mapper.chapter06.TeacherStudentMapper;

public class TeacherMapperTest {

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
		TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
		try {
			List<Teacher> teachers = teacherMapper.selectAll();
			for(Teacher t: teachers){
				System.out.println("teacherId:"+ t.getId());
				System.out.println("teacherName:"+ t.getName());
				for(Student s : t.getStudents()){
					System.out.println("id:"+ s.getId());
					System.out.println("age:"+ s.getAge());
					System.out.println("name:"+ s.getName());
				}
			}
			Assert.assertEquals(5, teachers.size());
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	@Test
	public void getDetailTest() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		TeacherStudentMapper teacherMapper = sqlSession
				.getMapper(TeacherStudentMapper.class);
		try {
			Teacher teacher = teacherMapper.getDetail(2);
//			System.out.println(teacher.getStudents().get(0).getAddress().getCity());
			// System.out.println(teacher.getStudent().size());
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

}
