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

public class StudentAction extends ActionSupport implements RequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Autowired
	private StudentService studentService;
	@Autowired
	private ClazzService clazzService;


	private Student student;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String list() {
		request.put("students", studentService.list()); 
		return "list";
	}
	public String delete(){
		studentService.deleteByStudent(student);
		return SUCCESS;
	}
	public String updateP(){
		student = studentService.getStudentById(student.getId());
		List<Clazz> clazzs = clazzService.list();
		request.put("clazzs", clazzs);
		return "updateP";
		
	}
	public String update(){
		studentService.updateByStudent(student);
		return SUCCESS;
		
	}
	public String saveP(){
		List<Clazz> clazzs = clazzService.list();
		request.put("clazzs", clazzs);
		return "saveP";
		
	}
	
	public String save(){
		studentService.insertByStudent(student);
		return SUCCESS;
		
	}
	

	private Map<String, Object> request;
	

	public void setRequest(Map<String, Object> map) {
		this.request = map;
	}
}
