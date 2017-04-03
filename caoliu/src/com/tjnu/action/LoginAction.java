package com.tjnu.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.po.Student;
import com.tjnu.service.StudentService;
import com.tjnu.service.StudentServiceImpl;
import com.tjnu.service.TeacherService;
import com.tjnu.service.TeacherServiceImpl;

public class LoginAction extends ActionSupport {
	private String id; 			// 接受用户编号
	private String password;	// 接受用户密码
	private TeacherService teacherService =
		new TeacherServiceImpl();//教师业务逻辑组件引用

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() throws Exception {
			if(teacherService.allowLogin(id, password)) {
				return "teacherSuccess";
			}else {
				addActionError("该教师编号不存在，或者密码不正确!");
				return this.INPUT;
			}
	}
}
