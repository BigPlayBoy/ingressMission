package com.tjnu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.po.Student;
import com.tjnu.service.StudentService;
import com.tjnu.service.StudentServiceImpl;

public class QueryStudentByClass extends ActionSupport{
	private String sclass;
	private StudentService studentService = new StudentServiceImpl();
	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Student> students = studentService.getStudentByClass(sclass);
		request.setAttribute("students", students);
		return this.SUCCESS;
	}
	
}
