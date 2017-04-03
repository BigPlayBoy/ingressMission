package com.tjnu.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.po.Student;
import com.tjnu.service.StudentService;
import com.tjnu.service.StudentServiceImpl;
import org.apache.log4j.Logger;

public class RegisterAction extends ActionSupport{
	private static Logger logger = Logger.getLogger(RegisterAction.class);

	private String studentId;//学生学号
	private String studentName; // 接受用户姓名
	private String password; // 接受用户密码
	private StudentService studentService = new StudentServiceImpl();// 学生业务逻辑组件引用

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() throws Exception {
		logger.info("信息获取：学号："+studentId+"\t姓名"+studentName+"\t密码"+password);
		if(studentService.getStudentById(studentId)==null){//不存在该用户
			Student student=new Student();
			student.setStudentId(studentId);
			student.setStudentPassword(password);
			student.setStudentName(studentName);
			studentService.saveStudent(student);
			logger.info("保存用户成功！！");
			return "registerSuccess";
		}else{
			logger.error("该ID已存在，不能注册");
			addActionError("该ID已存在，不能注册!");
			return this.INPUT;
		}
		
	}
}
