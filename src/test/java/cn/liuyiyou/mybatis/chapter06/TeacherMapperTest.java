package cn.liuyiyou.mybatis.chapter06;

import cn.liuyiyou.mybatis.DBUtils;
import cn.liuyiyou.mybatis.domain.chapter06.Student;
import cn.liuyiyou.mybatis.domain.chapter06.Teacher;
import cn.liuyiyou.mybatis.mapper.chapter06.TeacherMapper;
import cn.liuyiyou.mybatis.mapper.chapter06.TeacherStudentMapper;
import junit.framework.Assert;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static cn.liuyiyou.mybatis.QueryTemplate.templae;

public class TeacherMapperTest {


    @BeforeClass
    public static void beforeClass() {
        DBUtils.initHSQLData("chapter-06.sql");
    }


    @Test
    public void finAllTest() {
        List<Teacher> teachers = templae(sqlSession -> sqlSession.getMapper(TeacherMapper.class).selectAll());
        for (Teacher t : teachers) {
            System.out.println("teacherId:" + t.getId());
            System.out.println("teacherName:" + t.getName());
            for (Student s : t.getStudents()) {
                System.out.println("id:" + s.getId());
                System.out.println("age:" + s.getAge());
                System.out.println("name:" + s.getName());
            }
        }
        Assert.assertEquals(1, teachers.size());
    }

//    @Test
//    public void getDetailTest() {
//        Teacher teacher = templae(sqlSession -> sqlSession.getMapper(TeacherStudentMapper.class).getDetail(2));
//        Assert.assertNotNull(teacher);
//    }

}
