package cn.liuyiyou.mybatis.chapter06;

import cn.liuyiyou.mybatis.DBUtils;
import cn.liuyiyou.mybatis.domain.chapter06.Student;
import cn.liuyiyou.mybatis.domain.chapter06.Teacher;
import cn.liuyiyou.mybatis.mapper.chapter06.TeacherMapper;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static cn.liuyiyou.mybatis.QueryTemplate.template;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class TeacherMapperTest {


    @BeforeClass
    public static void beforeClass() {
        DBUtils.initHSQLData("chapter-06.sql");
    }


    @Test
    public void finAllTest() {
        Teacher s = template(sqlSession -> sqlSession.getMapper(TeacherMapper.class).getDetailById(1));
        assertNotNull(s);
        System.out.println("id:" + s.getId());
        System.out.println("name:" + s.getName());
    }
}

