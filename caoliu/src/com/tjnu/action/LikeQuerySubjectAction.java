package com.tjnu.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.tjnu.DataBase.Subject;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.service.SubjectService;
import com.tjnu.service.SubjectServiceImpl;
import com.tjnu.util.Page;
import com.tjnu.util.PageResult;

public class LikeQuerySubjectAction extends ActionSupport {
	private String subjectTitle;	//试题标题
	private int currentPage;		//当前页
	private SubjectService subjectService = new SubjectServiceImpl();

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public String getSubjectTitle() {
		return subjectTitle;
	}

	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}

	public String execute() throws Exception {
		Page page = new Page();
		page.setEveryPage(10);//每页显示10条记录
		page.setCurrentPage(currentPage);//设置当前页
		PageResult pageResult = subjectService.likeQueryBySubjectTitle(subjectTitle, page);
		List<Subject> subjects = pageResult.getList();//获得试题记录
		List<Subject> newSubjects = new ArrayList<Subject>();//新的记录
		//给关键字标红
		for(Subject subject : subjects) {
			String newTitle = subject.getSubjectContent().replaceAll(subjectTitle,
						"<font color='red'>" + subjectTitle + "</font>");
			subject.setSubjectContent(newTitle);
			newSubjects.add(subject);
		}
		
		page = pageResult.getPage();//获得分页信息
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("subjects", newSubjects);
		request.setAttribute("page", page);
		return SUCCESS;
	}
}
