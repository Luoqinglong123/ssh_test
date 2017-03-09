package com.lql.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lql.entity.Student;
import com.lql.ssh.dao.StudentDao;
import com.lql.ssh.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public void deleteByStudent(Student student) {
		studentDao.deleteByStudent(student);
	}

	@Override
	public List<Student> list() {
		return studentDao.list();
	}

	@Override
	public void insertByStudent(Student student) {
		studentDao.insertByStudent(student);

	}

	@Override
	public Student getStudentById(Integer id) {
		return studentDao.getStudentById(id);
	}

	@Override
	public void updateByStudent(Student student) {
		studentDao.updateByStudent(student);
	}

	@Override
	public void deleteByClazzId(Integer id) {
		studentDao.deleteByClazzId(id);
	}

}
