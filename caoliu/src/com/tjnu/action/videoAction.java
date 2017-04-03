package com.tjnu.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.po.Student;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * Created by 11517 on 2017/3/17.
 */
public class videoAction extends ActionSupport {
    private static Logger logger = Logger.getLogger(jiaocaiAction.class);

    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();

        Student student = (Student)session.get("studentInfo");
        if(student==null){
            logger.info("没有登陆，不能访问");
            addActionError("请先登陆！");
            return "notLogin";
        }
//        List<Subject> subjects = subjectService.randomFindSubject(20);//获得试题记录
//        HttpServletRequest request = ServletActionContext.getRequest();
//        request.setAttribute("subjects", subjects);
        return SUCCESS;
    }
}
