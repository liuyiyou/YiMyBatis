package cn.liuyiyou.mybatis.mapper.chapter05;

import java.util.List;

import cn.liuyiyou.mybatis.domain.chapter05.User;

public interface UserMapper {

	List<User> selectAll();
	
	User selectOne();
	
	User selectById(Integer id);
}
