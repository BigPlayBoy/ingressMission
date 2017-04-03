package com.tjnu.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.DataBase.Jduge;
import com.tjnu.DataBase.Select;
import com.tjnu.DataBase.Selects;
import com.tjnu.DataBase.Subject;
import com.tjnu.service.SubjectService;
import com.tjnu.service.SubjectServiceImpl;

//该Action用来接收试题参数，并调用业务逻辑组件SubjectService来完成试题添加
public class SubjectAddAction extends ActionSupport{

    private String subjectContent;
	private String subjectSelectA;
	private String subjectSelectB;
	private String subjectSelectC;
	private String subjectSelectD;
	private String subjectSelectE;
	private String subjectSelectAnswer;
    private String subjectGrade;
    private String subjectHard;
    private String subjectChapter;

    private SubjectService subjectService = new SubjectServiceImpl();
	

	public String execute() throws Exception {
        System.out.println("增加试题后台页面\n以下是获取到的数据：\n"+
                "题目内容："+subjectContent+
                "\n题目答案："+subjectSelectAnswer);
        boolean flag=false;
        if("T".equals(subjectSelectAnswer)||"F".equals(subjectSelectAnswer)){
//            这是判断题
            Jduge jduge=new Jduge();
            jduge.setSubjectContent(subjectContent);
            jduge.setSubjectGrade(new Integer(subjectGrade));
            jduge.setSubjectHard(new Integer(subjectHard));
            jduge.setSubjectChapter(new Integer(subjectChapter));
            jduge.setJdugeAnswer(subjectSelectAnswer);
            jduge.setSubjectType("1");
            System.out.println(jduge);
            flag=  subjectService.saveSubject(jduge);
        }else if(subjectSelectAnswer.length()>1){
//            这是多选题
            Selects jduge=new Selects();
            jduge.setSubjectContent(subjectContent);
            jduge.setSelectsAnswer(subjectSelectAnswer);
            jduge.setSubjectGrade(new Integer(subjectGrade));
            jduge.setSubjectHard(new Integer(subjectHard));
            jduge.setSubjectChapter(new Integer(subjectChapter));
            jduge.setSelectsA(subjectSelectA);
            jduge.setSelectsB(subjectSelectB);
            jduge.setSelectsC(subjectSelectC);
            jduge.setSelectsD(subjectSelectD);
            jduge.setSelectsE(subjectSelectE);
            jduge.setSubjectType("3");

            System.out.println(jduge);
            flag=   subjectService.saveSubject(jduge);
        }else {
//            这是单选题
            Select jduge=new Select();
            jduge.setSubjectContent(subjectContent);
            jduge.setSelectAnswer(subjectSelectAnswer);
            jduge.setSubjectGrade(new Integer(subjectGrade));
            jduge.setSubjectHard(new Integer(subjectHard));
            jduge.setSubjectChapter(new Integer(subjectChapter));
            jduge.setSelectA(subjectSelectA);
            jduge.setSelectB(subjectSelectB);
            jduge.setSelectC(subjectSelectC);
            jduge.setSelectD(subjectSelectD);
            jduge.setSubjectType("2");

            System.out.println(jduge);
            flag= subjectService.saveSubject(jduge);
        }
        if(flag){
            addActionMessage("添加试题成功！");
		}else {
            this.addActionMessage("该试题已经添加过了，请不要重复添加!");
        }
        return SUCCESS;
	}


    public String getSubjectContent() {
        return subjectContent;
    }

    public void setSubjectContent(String subjectContent) {
        this.subjectContent = subjectContent;
    }

    public String getSubjectSelectA() {
        return subjectSelectA;
    }

    public void setSubjectSelectA(String subjectSelectA) {
        this.subjectSelectA = subjectSelectA;
    }

    public String getSubjectSelectB() {
        return subjectSelectB;
    }

    public void setSubjectSelectB(String subjectSelectB) {
        this.subjectSelectB = subjectSelectB;
    }

    public String getSubjectSelectC() {
        return subjectSelectC;
    }

    public void setSubjectSelectC(String subjectSelectC) {
        this.subjectSelectC = subjectSelectC;
    }

    public String getSubjectSelectD() {
        return subjectSelectD;
    }

    public void setSubjectSelectD(String subjectSelectD) {
        this.subjectSelectD = subjectSelectD;
    }

    public String getSubjectSelectE() {
        return subjectSelectE;
    }

    public void setSubjectSelectE(String subjectSelectE) {
        this.subjectSelectE = subjectSelectE;
    }

    public String getSubjectSelectAnswer() {
        return subjectSelectAnswer;
    }

    public void setSubjectSelectAnswer(String subjectSelectAnswer) {
        this.subjectSelectAnswer = subjectSelectAnswer;
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

    public String getSubjectChapter() {
        return subjectChapter;
    }

    public void setSubjectChapter(String subjectChapter) {
        this.subjectChapter = subjectChapter;
    }
}
