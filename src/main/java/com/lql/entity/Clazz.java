package com.lql.entity;

import java.util.HashSet;
import java.util.Set;

public class Clazz {
	private Integer id;
	private String clazzName;

	private Set<Student> students = new HashSet<>();

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClazzName() {
		return clazzName;
	}

	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}


	public Clazz() {
		super();
	}

	public Clazz(Integer id, String clazzName) {
		super();
		this.id = id;
		this.clazzName = clazzName;
	}

	@Override
	public String toString() {
		return "Clazz [id=" + id + ", clazzName=" + clazzName + ", students=" + students + "]";
	}

}
