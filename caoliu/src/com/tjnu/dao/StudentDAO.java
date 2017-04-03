package com.tjnu.dao;

import java.util.List;

import com.tjnu.po.Student;

public interface StudentDAO {
	 Student findByStudentId(String studentId);//查询方法，根据学生ID查询
	 boolean updateStudent(Student student);//更新学生信息
	 List<Student> findByStudentName(String studentName);//根据学生姓名查找学生
	 List<Student> findByStudentClass(String sclass);//根据班级查找学生

}
