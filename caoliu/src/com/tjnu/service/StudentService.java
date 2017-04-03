package com.tjnu.service;

import java.util.List;

import com.tjnu.po.Student;

public interface StudentService {
	//判断是否为合法学生，从而决定是否允许登录
	 boolean allowLogin(String studentID,String password);
	//获得学生信息
	 Student getStudentInfo(String studentID);
	//设置学生成绩
	 void setStudentResult(String studentID,int result);
	//根据学生姓名查找学生
	 List<Student> getStudentByName(String studentName);
	//根据班级查找学生
	 List<Student> getStudentByClass(String sclass);
	 //根据学生id查找学生
	 Student getStudentById(String studentId);

	boolean saveStudent(Student student);//保存学生信息
}
