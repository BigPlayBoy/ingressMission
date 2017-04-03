package com.tjnu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.po.Student;
import com.tjnu.service.StudentService;
import com.tjnu.service.StudentServiceImpl;

public class QueryStudentByName extends ActionSupport{
	private String studentName;
	private StudentService studentService = new StudentServiceImpl();
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Student> students = studentService.getStudentByName(studentName);
		request.setAttribute("students", students);
		return this.SUCCESS;
	}
	
}
