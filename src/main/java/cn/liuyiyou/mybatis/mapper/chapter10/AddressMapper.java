package cn.liuyiyou.mybatis.mapper.chapter10;

import cn.liuyiyou.mybatis.domain.chapter10.Address;

public interface AddressMapper {

	
	/**
	 * 根据id查询地址
	 * @param id
	 * @return
	 */
	Address selectById(Integer id);

	/**
	 * 更新地址
	 * @param address
	 * @return
	 */
	int updateById(Address address);
}
