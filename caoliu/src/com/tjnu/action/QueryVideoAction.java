package com.tjnu.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.dao.VideoSourceDao;
import com.tjnu.dao.VideoSourceDaoImpl;
import com.tjnu.po.Student;
import com.tjnu.po.Video;
import com.tjnu.po.VideoSource;
import com.tjnu.service.VideoService;
import com.tjnu.service.VideoServiceImpl;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by 11517 on 2017/3/20.
 */
public class QueryVideoAction extends ActionSupport {
    private static Logger logger = Logger.getLogger(QueryVideoAction.class);
private VideoService videoService=new VideoServiceImpl();
private VideoSourceDao videoSourceDao=new VideoSourceDaoImpl();
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();

        Student student = (Student)session.get("studentInfo");
        if(student==null){
            logger.info("没有登陆，不能访问");
            addActionError("请先登陆！");
            return "notLogin";
        }
        List<Video> videoList=videoService.getVideo();
        List<VideoSource> videoSourceList=null;
        for(int i=0;i<videoList.size();i++){
            if(i!=0){
                List<VideoSource> videoSourceList1=videoSourceDao.getVideoSourceByVideoId(videoList.get(i).getVideoId());
                if(videoSourceList1!=null)  videoSourceList.addAll(videoSourceList1);
            }else {
                videoSourceList=videoSourceDao.getVideoSourceByVideoId(videoList.get(i).getVideoId());
            }
        }

//        List<Subject> subjects = subjectService.randomFindSubject(20);//获得试题记录
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("videoList", videoList);
        request.setAttribute("videoSourceList", videoSourceList);
        return SUCCESS;
    }
}
