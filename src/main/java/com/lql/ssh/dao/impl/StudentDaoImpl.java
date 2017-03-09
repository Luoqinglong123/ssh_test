package com.lql.ssh.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lql.entity.Student;
import com.lql.ssh.dao.StudentDao;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void deleteByStudent(Student student) {
		getSession().delete(student);
	}

	@Override
	public List<Student> list() {
		Criteria criteria = getSession().createCriteria(Student.class);
		// 迫切左外链接
		// String hql = "FROM Student e LEFT JOIN FETCH e.clazz";
		return criteria.list();
	}

	@Override
	public void insertByStudent(Student student) {
		getSession().save(student);
	}

	@Override
	public Student getStudentById(Integer id) {
		Student student = (Student) getSession().get(Student.class, id);
		return student;
	}

	@Override
	public void updateByStudent(Student student) {
		getSession().update(student);
	}

	@Override
	public void deleteByClazzId(Integer id) {
		String hql = "delete from Student s where s.clazz.id=?";
		Query query = getSession().createQuery(hql);
		query.setParameter(0, id);
		query.executeUpdate();
	}

}
