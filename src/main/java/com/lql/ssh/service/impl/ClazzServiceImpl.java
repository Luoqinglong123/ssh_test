package com.lql.ssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lql.entity.Clazz;
import com.lql.ssh.dao.ClazzDao;
import com.lql.ssh.service.ClazzService;

@Service
public class ClazzServiceImpl implements ClazzService {
	@Autowired
	private ClazzDao clazzDao;
	private Clazz clazz;
	

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	@Override
	public void deleteByClazz(Clazz clazz) {
		clazzDao.deleteByClazz(clazz);
	}

	@Override
	public List<Clazz> list() {
		return clazzDao.list();
	}

	@Override
	public void insertByClazz(Clazz clazz) {
			clazzDao.insertByClazz(clazz);
	}

	@Override
	public Clazz getClazzById(Integer id) {
		return clazzDao.getClazzById(id);
	}

	@Override
	public void updateByClazz(Clazz clazz) {
		clazzDao.updateByClazz(clazz);
	}


}
