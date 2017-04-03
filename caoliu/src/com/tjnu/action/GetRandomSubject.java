package com.tjnu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.tjnu.DataBase.Jduge;
import com.tjnu.DataBase.Select;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.DataBase.Subject;
import com.tjnu.service.SubjectService;
import com.tjnu.service.SubjectServiceImpl;

/*
 *获得随机试题
 */
public class GetRandomSubject extends ActionSupport{
	private SubjectService subjectService = new SubjectServiceImpl();
	public String execute() throws Exception {
		List<Select> subjects = subjectService.randomFindSelect(20);//获得试题记录
		HttpServletRequest request = ServletActionContext.getRequest();

		request.setAttribute("subjects", subjects);
		System.out.println(subjects.get(0));
		return SUCCESS;
	}
}
