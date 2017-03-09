package com.lql.ssh.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lql.entity.Clazz;
import com.lql.ssh.dao.ClazzDao;
@Repository
public class ClazzDaoImpl implements ClazzDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void deleteByClazz(Clazz clazz) {
		this.getSession().delete(clazz);
	}

	@Override
	public List<Clazz> list() {
		Criteria criteria = getSession().createCriteria(Clazz.class);
		return criteria.list();
	}

	@Override
	public void insertByClazz(Clazz clazz) {
		getSession().save(clazz);
	}

	@Override
	public Clazz getClazzById(Integer id) {
		Clazz clazz = (Clazz) getSession().get(Clazz.class,id);
		return clazz;
	}

	@Override
	public void updateByClazz(Clazz clazz) {
		getSession().update(clazz);
	}

}
