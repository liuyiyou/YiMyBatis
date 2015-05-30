package cn.liuyiyou.mybatis.mapper.chapter06;

import java.util.List;

import cn.liuyiyou.mybatis.domain.chapter06.Teacher;

public interface TeacherMapper {

	List<Teacher> selectAll();
	
	
	Teacher getDetailById(int id);
}
