package com.tjnu.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.po.Student;
import com.tjnu.service.StudentService;
import com.tjnu.service.StudentServiceImpl;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class myLoginAction extends ActionSupport {
	private static Logger logger = Logger.getLogger(myLoginAction.class);

	private String StudentId; // 接受用户编号
	private String StudentPassword; // 接受用户密码
	private StudentService studentService = new StudentServiceImpl();// 学生业务逻辑组件引用

	

	public String getStudentId() {
		return StudentId;
	}

	public void setStudentId(String studentId) {
		StudentId = studentId;
	}

	public String getStudentPassword() {
		return StudentPassword;
	}

	public void setStudentPassword(String password) {
		this.StudentPassword = password;
	}

	public String execute() throws Exception {
		logger.info("學生id："+StudentId+"\t學生密碼："+StudentPassword);
		if (studentService.allowLogin(StudentId, StudentPassword)) {
			Student studentInfo = studentService.getStudentInfo(StudentId);
			// 保存学生记录到session范围
			Map session = ActionContext.getContext().getSession();
			session.put("studentInfo", studentInfo);
			logger.info("学生ID："+studentInfo.getStudentId());
			HttpServletRequest request = ServletActionContext.getRequest();
//			System.out.println("输出获取到的留言内容\t"+messageBoards.get(0).getContent());
			request.setAttribute("student", studentInfo);
			return "mysuccess";
		} else {
			addActionError("该学生编号不存在，或者密码不正确!");
			return this.INPUT;
		}
	}

}
