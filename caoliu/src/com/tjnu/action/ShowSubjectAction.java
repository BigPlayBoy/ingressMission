package com.tjnu.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.DataBase.Jduge;
import com.tjnu.DataBase.Select;
import com.tjnu.DataBase.Selects;
import com.tjnu.DataBase.Subject;
import com.tjnu.service.SubjectService;
import com.tjnu.service.SubjectServiceImpl;
import com.tjnu.util.Page;
import com.tjnu.util.PageResult;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 11517 on 2017/3/28.
 * 根据传递进来的subjectId,去获取试题
 */
public class ShowSubjectAction extends ActionSupport {
    private String subjectId;
    private SubjectService subjectService=new SubjectServiceImpl();

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();

        subjectId=request.getParameter("subjectId");
        System.out.println("测试"+subjectId+"\tqwerr");
//        System.out.println(subjectId);
        Subject subject=subjectService.showSubjectParticular(new Integer(subjectId));
        System.out.println(subject);
        Jduge jduge=new Jduge();
        Select select=new Select();
        Selects selects=new Selects();
        if("1".equals(subject.getSubjectType())){
            jduge=(Jduge)subject;
            System.out.println(jduge.getJdugeAnswer());
            System.out.println(jduge.getSubjectContent());
            request.setAttribute("subject", jduge);
        }else if("2".equals(subject.getSubjectType())){
            select=(Select) subject;
            System.out.println(select.getSelectAnswer());
            System.out.println(select.getSubjectContent());
            request.setAttribute("subject", select);
        }else if("3".equals(subject.getSubjectType())){
            selects=(Selects)subject;
            System.out.println(selects.getSelectsAnswer());
            System.out.println(selects.getSubjectContent());
            request.setAttribute("subject", selects);
        }
        return SUCCESS;
    }

}
