package com.tjnu.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.DataBase.Subject;
import com.tjnu.service.SubjectService;
import com.tjnu.service.SubjectServiceImpl;

/*
 * 获得更新试题前的试题
 */
public class SubjectUpdateBefore extends ActionSupport {
	private int subjectID;
	private SubjectService subjectService = new SubjectServiceImpl();
	public int getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}
	public String execute() throws Exception {
		Subject subject = subjectService.showSubjectParticular(subjectID);
		ServletActionContext.getRequest().setAttribute("subject", subject);
		return SUCCESS;
	}
}
