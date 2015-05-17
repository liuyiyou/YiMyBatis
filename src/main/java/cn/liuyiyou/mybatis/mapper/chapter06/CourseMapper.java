package cn.liuyiyou.mybatis.mapper.chapter06;

import java.util.List;

import cn.liuyiyou.mybatis.domain.chapter06.Course;

public interface CourseMapper {
	
	List<Course> selectAll();
}
