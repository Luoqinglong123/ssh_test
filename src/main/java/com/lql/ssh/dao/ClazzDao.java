package com.lql.ssh.dao;

import java.util.List;

import com.lql.entity.Clazz;

public interface ClazzDao {
	/**
	 * 根据id删除clazz
	 * 
	 * @param id
	 */
	void deleteByClazz(Clazz clazz);

	/**
	 * 返回所有clazz集合
	 * 
	 * @return
	 */
	List<Clazz> list();

	/**
	 * 根据clazz对象添加
	 * 
	 * @param clazz
	 */
	void insertByClazz(Clazz clazz);

	/**
	 * 根据id获取clazz对象
	 * 
	 * @param id
	 * @return
	 */
	Clazz getClazzById(Integer id);

	/**
	 * 根据clazz对象更新clazz
	 * 
	 * @param clazz
	 */
	void updateByClazz(Clazz clazz);
}
