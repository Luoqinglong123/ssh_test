package com.lql.ssh.dao;

import java.util.List;

import com.lql.entity.Clazz;
import com.lql.entity.Student;

public interface StudentDao {
	/**
	 * 根据id删除Student
	 * 
	 * @param id
	 */
	void deleteByStudent(Student student);

	/**
	 * 返回所有Student集合
	 * 
	 * @return
	 */
	List<Student> list();

	/**
	 * 根据Student对象添加
	 * 
	 * @param Student
	 */
	void insertByStudent(Student student);

	/**
	 * 根据id获取Student对象
	 * 
	 * @param id
	 * @return
	 */
	Student getStudentById(Integer id);

	/**
	 * 根据Student对象更新Student
	 * 
	 * @param Student
	 */
	void updateByStudent(Student student);
	/**
	 * 根据clazzid删除
	 * @param id
	 */
	void deleteByClazzId(Integer id);
}
