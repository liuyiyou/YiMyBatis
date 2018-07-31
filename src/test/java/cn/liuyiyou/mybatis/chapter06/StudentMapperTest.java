package cn.liuyiyou.mybatis.chapter06;

import cn.liuyiyou.mybatis.DBUtils;
import cn.liuyiyou.mybatis.domain.chapter06.Student;
import cn.liuyiyou.mybatis.mapper.chapter06.StudentMapper;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static cn.liuyiyou.mybatis.QueryTemplate.template;

public class StudentMapperTest {


    @BeforeClass
    public static void beforeClass() {
        DBUtils.initHSQLData("chapter-06.sql");
    }

    @Test
    public void finAllTest() {
        List<Student> students = template(sqlSession -> sqlSession.getMapper(StudentMapper.class).selectAll());
        Assert.assertEquals(5, students.size());
    }

}
