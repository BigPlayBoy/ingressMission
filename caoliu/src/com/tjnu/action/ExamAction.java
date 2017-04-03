package com.tjnu.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.DataBase.Jduge;
import com.tjnu.DataBase.Select;
import com.tjnu.po.Student;
import com.tjnu.service.SubjectService;
import com.tjnu.service.SubjectServiceImpl;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by 11517 on 2017/3/17.
 */
public class ExamAction  extends ActionSupport {
    private static Logger logger = Logger.getLogger(jiaocaiAction.class);
    SubjectService subjectService=new SubjectServiceImpl();
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();

        Student student = (Student)session.get("studentInfo");
        if(student==null){
            logger.info("没有登陆，不能访问");
            addActionError("请先登陆！");
            return "notLogin";
        }
        List<Select> subjects =subjectService.randomFindSelect(20);//获得试题记录
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("subjects", subjects);
        return "studentSuccess";
    }
}