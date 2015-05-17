package cn.liuyiyou.mybatis.domain.chapter06;

import java.util.List;

public class Teacher {

	private Integer id;
	private String name;

	// 非持久化字段
	// 一个老师有多个学生
	private List<Student> students;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudent(List<Student> students) {
		this.students = students;
	}

}
