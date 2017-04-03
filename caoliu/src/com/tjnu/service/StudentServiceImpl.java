package com.tjnu.service;

import java.util.List;

import com.tjnu.dao.StudentDAO;
import com.tjnu.dao.StudentDAOImpl;
import com.tjnu.po.Student;
import org.apache.log4j.Logger;

public class StudentServiceImpl implements StudentService{
	private static Logger logger = Logger.getLogger(StudentServiceImpl.class);

	private StudentDAO studentDAO = new StudentDAOImpl();
	
	public boolean allowLogin(String studentId, String password) {
		Student student = studentDAO.findByStudentId(studentId);
		if(student == null) {//判断是否存在该ID的学生
			logger.error("不存在该学生！");
			return false;
		}else {
			if(password.equals(student.getStudentPassword())) {//判断密码是否相同
				logger.info("存在该学生，且密码正确！");
				return true;
			}else{
				logger.error("存在该学生，但密码不正确！");
				return false;
			}
			
		}
	}

	public Student getStudentInfo(String studentId) {
		return studentDAO.findByStudentId(studentId);
	}

	public void setStudentResult(String studentId, int result) {
		Student student = studentDAO.findByStudentId(studentId);//根据ID查找到该学生
		studentDAO.updateStudent(student);//更新学生信息
	}

	public List<Student> getStudentByName(String studentName) {
		return studentDAO.findByStudentName(studentName);
	}

	public List<Student> getStudentByClass(String sclass) {
		return studentDAO.findByStudentClass(sclass);
	}

	@Override
	public Student getStudentById(String studentId) {
		return studentDAO.findByStudentId(studentId);
	}

	public boolean saveStudent(Student student){
		return studentDAO.updateStudent(student);
	}
}
