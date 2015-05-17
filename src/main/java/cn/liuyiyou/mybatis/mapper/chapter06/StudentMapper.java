package cn.liuyiyou.mybatis.mapper.chapter06;

import java.util.List;

import cn.liuyiyou.mybatis.domain.chapter06.Student;

public interface StudentMapper {

	List<Student> selectAll();

	Student selectStudentDetailById(int id);
}
