package com.tjnu.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.service.SubjectService;
import com.tjnu.service.SubjectServiceImpl;
import org.apache.struts2.ServletActionContext;

public class SubjectDeleteAction extends ActionSupport{
	private int subjectId;
	private String tixing;
	private String chapter;
	private String hard;
	private String guanjianzi;
	private SubjectService subjectService = new SubjectServiceImpl();
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String execute() throws Exception {

		subjectService.deleteSubject(subjectId);
		addActionMessage("删除试题成功");
        ServletActionContext.getRequest().removeAttribute("subjectId");
        return SUCCESS;
	}

    public String getTixing() {
        return tixing;
    }

    public void setTixing(String tixing) {
        this.tixing = tixing;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getHard() {
        return hard;
    }

    public void setHard(String hard) {
        this.hard = hard;
    }

    public String getGuanjianzi() {
        return guanjianzi;
    }

    public void setGuanjianzi(String guanjianzi) {
        this.guanjianzi = guanjianzi;
    }
}
