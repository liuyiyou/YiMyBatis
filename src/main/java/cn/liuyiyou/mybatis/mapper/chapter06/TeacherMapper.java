package cn.liuyiyou.mybatis.mapper.chapter06;

import cn.liuyiyou.mybatis.domain.chapter06.Teacher;

import java.util.List;

public interface TeacherMapper {

    List<Teacher> selectAll();

    Teacher getDetailById(int id);
}
