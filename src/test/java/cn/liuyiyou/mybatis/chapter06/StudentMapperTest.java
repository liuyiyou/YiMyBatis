package cn.liuyiyou.mybatis.chapter06;

import cn.liuyiyou.mybatis.DBUtils;
import cn.liuyiyou.mybatis.domain.chapter06.Student;
import cn.liuyiyou.mybatis.mapper.chapter06.StudentMapper;
import junit.framework.Assert;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static cn.liuyiyou.mybatis.QueryTemplate.templae;

public class StudentMapperTest {

    private static SqlSessionFactory sqlSessionFactory;


    @BeforeClass
    public static void beforeClass() {
        DBUtils.initHSQLData("chapter-06.sql");
    }

    @Test
    public void finAllTest() {
        List<Student> students = templae(sqlSession -> sqlSession.getMapper(StudentMapper.class).selectAll());
        Assert.assertEquals(10, students.size());
    }


    @Test
    public void finAllTest2() {
        Student student = templae(sqlSession -> sqlSession.getMapper(StudentMapper.class).selectStudentDetailById(1));//studentMapper.selectStudentDetailById(1);
        System.out.println(student.getName());
        System.out.println(student.getAddress().getCity());
    }

}
