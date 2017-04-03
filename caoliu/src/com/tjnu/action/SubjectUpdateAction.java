package com.tjnu.action;

import com.tjnu.DataBase.Jduge;
import com.tjnu.DataBase.Select;
import com.tjnu.DataBase.Selects;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.DataBase.Subject;
import com.tjnu.service.SubjectService;
import com.tjnu.service.SubjectServiceImpl;

public class SubjectUpdateAction extends ActionSupport{
	/*基础属性*/
	private String subjectId;
	private String subjectType;
	private String subjectChapter;
	private String subjectGrade;
	private String subjectHard;
	private String subjectContent;
	/*多选题的属性*/
	private String selectsA;
	private String selectsB;
	private String selectsC;
	private String selectsD;
	private String selectsE;
	private String selectsAnswer;
	/*单选题的属性*/
	private String selectA;
	private String selectB;
	private String selectC;
	private String selectD;
	private String selectAnswer;
	/*判断题的属性*/
	private String jdugeAnswer;

	private SubjectService subjectService = new SubjectServiceImpl();

	public String execute() throws Exception {
		Subject subject = new Subject();
        System.out.println("这是修改题目的的后台");
        if ("1".equals(subjectType)){
			//判断题
            System.out.println("这里是判断题");
            Jduge	jduge=new Jduge();
			jduge.setJdugeAnswer(jdugeAnswer);
            jduge.setSubjectId(new Integer(subjectId));
            jduge.setSubjectType(subjectType);
            jduge.setSubjectChapter(new Integer(subjectChapter));
            jduge.setSubjectGrade(new Integer(subjectGrade));
            jduge.setSubjectHard(new Integer(subjectHard));
            jduge.setSubjectContent(subjectContent);
            subjectService.updateSubject(jduge);
            System.out.println(jduge);
            ServletActionContext.getRequest().setAttribute("subject", jduge);

        }
		if ("2".equals(subjectType)){
			//单选题
            System.out.println("这里是单选题");
            Select select=new Select();
            select.setSelectA(selectA);
            select.setSelectB(selectB);
            select.setSelectC(selectC);
            select.setSelectD(selectD);
            select.setSelectAnswer(selectAnswer);
            select.setSubjectId(new Integer(subjectId));
            select.setSubjectType(subjectType);
            select.setSubjectChapter(new Integer(subjectChapter));
            select.setSubjectGrade(new Integer(subjectGrade));
            select.setSubjectHard(new Integer(subjectHard));
            select.setSubjectContent(subjectContent);
            subjectService.updateSubject(select);
            System.out.println(select);
            ServletActionContext.getRequest().setAttribute("subject", select);

        }
		if ("3".equals(subjectType)){
			//多选题
            System.out.println("这里是多选题");
            Selects selects=new Selects();
            selects.setSelectsA(selectsA);
            selects.setSelectsB(selectsB);
            selects.setSelectsC(selectsC);
            selects.setSelectsD(selectsD);
            selects.setSelectsE(selectsE);
            selects.setSelectsAnswer(selectsAnswer);
            selects.setSubjectId(new Integer(subjectId));
            selects.setSubjectType(subjectType);
            selects.setSubjectChapter(new Integer(subjectChapter));
            selects.setSubjectGrade(new Integer(subjectGrade));
            selects.setSubjectHard(new Integer(subjectHard));
            selects.setSubjectContent(subjectContent);
            subjectService.updateSubject(selects);
            System.out.println(selects);
            ServletActionContext.getRequest().setAttribute("subject", selects);

        }

		this.addActionMessage("修改成功");
		return SUCCESS;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public String getSubjectChapter() {
		return subjectChapter;
	}

	public void setSubjectChapter(String subjectChapter) {
		this.subjectChapter = subjectChapter;
	}

	public String getSubjectGrade() {
		return subjectGrade;
	}

	public void setSubjectGrade(String subjectGrade) {
		this.subjectGrade = subjectGrade;
	}

	public String getSubjectHard() {
		return subjectHard;
	}

	public void setSubjectHard(String subjectHard) {
		this.subjectHard = subjectHard;
	}

	public String getSubjectContent() {
		return subjectContent;
	}

	public void setSubjectContent(String subjectContent) {
		this.subjectContent = subjectContent;
	}

	public String getSelectsA() {
		return selectsA;
	}

	public void setSelectsA(String selectsA) {
		this.selectsA = selectsA;
	}

	public String getSelectsB() {
		return selectsB;
	}

	public void setSelectsB(String selectsB) {
		this.selectsB = selectsB;
	}

	public String getSelectsC() {
		return selectsC;
	}

	public void setSelectsC(String selectsC) {
		this.selectsC = selectsC;
	}

	public String getSelectsD() {
		return selectsD;
	}

	public void setSelectsD(String selectsD) {
		this.selectsD = selectsD;
	}

	public String getSelectsE() {
		return selectsE;
	}

	public void setSelectsE(String selectsE) {
		this.selectsE = selectsE;
	}

	public String getSelectsAnswer() {
		return selectsAnswer;
	}

	public void setSelectsAnswer(String selectsAnswer) {
		this.selectsAnswer = selectsAnswer;
	}

	public String getSelectA() {
		return selectA;
	}

	public void setSelectA(String selectA) {
		this.selectA = selectA;
	}

	public String getSelectB() {
		return selectB;
	}

	public void setSelectB(String selectB) {
		this.selectB = selectB;
	}

	public String getSelectC() {
		return selectC;
	}

	public void setSelectC(String selectC) {
		this.selectC = selectC;
	}

	public String getSelectD() {
		return selectD;
	}

	public void setSelectD(String selectD) {
		this.selectD = selectD;
	}

	public String getSelectAnswer() {
		return selectAnswer;
	}

	public void setSelectAnswer(String selectAnswer) {
		this.selectAnswer = selectAnswer;
	}

	public String getJdugeAnswer() {
		return jdugeAnswer;
	}

	public void setJdugeAnswer(String jdugeAnswer) {
		this.jdugeAnswer = jdugeAnswer;
	}

	public SubjectService getSubjectService() {
		return subjectService;
	}

	public void setSubjectService(SubjectService subjectService) {
		this.subjectService = subjectService;
	}



}
