package cn.liuyiyou.mybatis.domain.chapter10;

import java.io.Serializable;

import cn.liuyiyou.mybatis.domain.chapter10.Address;

/**
 * 需要序列化，否则无法进行缓存
 * @author liuyiyou
 *
 */
public class User implements Serializable {

	private int id;
	private String name;
	private int age;
	
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "id: " + id + "\tname:" + name;
	}

}
