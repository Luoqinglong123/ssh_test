package com.lql.ssh.actions;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.lql.entity.Clazz;
import com.lql.entity.Student;
import com.lql.ssh.service.ClazzService;
import com.lql.ssh.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class ClazzAction extends ActionSupport implements RequestAware {

	/**
	 * 
	 */
	@Autowired
	private ClazzService clazzService;
	@Autowired
	private StudentService studentService;
	private Clazz clazz;
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}


	public String list() {
		request.put("clazzs", clazzService.list()); 
		return "list";
	}
	public String delete(){
		Integer id = clazz.getId();
		studentService.deleteByClazzId(id);
		clazzService.deleteByClazz(clazz);
		return SUCCESS;
	}
	
	public String updateP(){
		 clazz = clazzService.getClazzById(clazz.getId());
		return "updateP";
		
	}
	public String update(){
		clazzService.updateByClazz(clazz);
		return SUCCESS;
		
	}
	public String saveP(){
		return "saveP";
		
	}
	public String save(){
		clazzService.insertByClazz(clazz);
		return SUCCESS;
		
	}
	private Map<String, Object> request;

	public void setRequest(Map<String, Object> map) {
		this.request = map;
	}
}
