package com.tjnu.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.dao.PptUrlDao;
import com.tjnu.dao.PptUrlDaoImpl;
import com.tjnu.po.Ppt;
import com.tjnu.po.PptUrls;
import com.tjnu.po.Student;
import com.tjnu.service.PptService;
import com.tjnu.service.PptServiceImpl;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by 11517 on 2017/3/17.
 */
public class jiaocaiAction extends ActionSupport {
    private static Logger logger = Logger.getLogger(jiaocaiAction.class);
private PptService pptService=new PptServiceImpl();
private PptUrlDao pptUrlDao=new PptUrlDaoImpl();
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();

        Student student = (Student)session.get("studentInfo");
        if(student==null){
            logger.info("没有登陆，不能访问");
            addActionError("请先登陆！");
            return "notLogin";
        }
        List<Ppt> ppts=pptService.getPpt();
        System.out.println(ppts);
        List<PptUrls> pptUrlsList=null;
        for (int i=0;i<ppts.size();i++){
            if(i==0){
                pptUrlsList=pptUrlDao.getPptUrlsByPptId(ppts.get(i).getPptId());
            }else {
                List<PptUrls> pptUrlsList1=pptUrlDao.getPptUrlsByPptId(ppts.get(i).getPptId());
                if(pptUrlsList1!=null){
                    pptUrlsList.addAll(0,pptUrlsList1);
                }
                System.out.println(pptUrlsList1);
            }
        }
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("ppts", ppts);
        request.setAttribute("pptUrls", pptUrlsList);
        return SUCCESS;
    }
}
