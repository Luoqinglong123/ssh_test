package com.lql.entity;

public class Student {
	private Integer id;
	private String name;
	private String sex;
	private Clazz clazz;

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	public Student(Integer id, String name, String sex, Clazz clazz) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.clazz = clazz;
	}

	public Student(String name, String sex, Clazz clazz) {
		super();
		this.name = name;
		this.sex = sex;
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", clazz=" + clazz + "]";
	}

	public Student() {
		super();
	}

}
