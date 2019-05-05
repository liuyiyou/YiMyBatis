package cn.liuyiyou.mybatis.domain.chapter20;

import java.io.Serializable;

public class Address implements Serializable {

	private Integer id;
	private String prov;
	private String city;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProv() {
		return prov;
	}
	public void setProv(String prov) {
		this.prov = prov;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
