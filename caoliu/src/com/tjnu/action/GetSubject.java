package com.tjnu.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.DataBase.Jduge;
import com.tjnu.DataBase.Subject;
import com.tjnu.service.SubjectService;
import com.tjnu.service.SubjectServiceImpl;
import com.tjnu.util.Page;
import com.tjnu.util.PageResult;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 11517 on 2017/3/27.
 */
public class GetSubject extends ActionSupport {
    private String tixing;
    private String chapter;
    private String hard;
    private String guanjianzi;
    private int currentPage;		//当前页

    private SubjectService subjectService=new SubjectServiceImpl();

    public String execute() throws Exception {
        System.out.println("测试");
        Page page = new Page();
        page.setEveryPage(15);//每页显示10条记录
        page.setCurrentPage(currentPage);//设置当前页

        System.out.println(tixing+"\t"+chapter+"\t"+hard+"\t"+guanjianzi);
        PageResult pageResult=subjectService.querySubjectSelectByPage(tixing.replace(" ",""),chapter.replace(" ",""),hard.replace(" ",""),guanjianzi.replace(" ",""),page);
        List<Subject> subjects = pageResult.getList();//获得试题记录
//        for(int i=0;i<subjects.size();i++){
//            System.out.println(subjects.get(i));
//        }
        page=pageResult.getPage();//获得分页信息
//        System.out.println(page);
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("page", page);
        request.setAttribute("subjects", subjects);
        request.setAttribute("tixing", tixing);
        request.setAttribute("chapter", chapter);
        request.setAttribute("hard", hard);
        request.setAttribute("guanjianzi", guanjianzi);
        return SUCCESS;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
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
