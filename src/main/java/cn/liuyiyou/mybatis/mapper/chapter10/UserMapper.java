package cn.liuyiyou.mybatis.mapper.chapter10;

import cn.liuyiyou.mybatis.domain.chapter10.User;

public interface UserMapper {

	
	/**
	 * 得到用户详细信息：包括用户信息和用户Address信息
	 * @param id
	 * @return
	 */
	User getDetailById(Integer id);

	
	
}
