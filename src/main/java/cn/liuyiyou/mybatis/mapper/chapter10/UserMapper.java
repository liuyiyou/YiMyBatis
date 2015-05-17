package cn.liuyiyou.mybatis.mapper.chapter10;

import java.util.List;

import cn.liuyiyou.mybatis.domain.chapter10.User;

public interface UserMapper {

	List<User> selectAll();
	
	User selectOne();
	
	User selectById(Integer id);

	int updateById(int i);
}
