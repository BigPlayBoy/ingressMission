package com.tjnu.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.po.MessageBoard;
import com.tjnu.service.MessageBoardService;
import com.tjnu.service.MessageBoardServiceImpl;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by jarvis on 2017/2/20.
 * 留言版
 */
public class LiuYan extends ActionSupport {
    private static Logger logger = Logger.getLogger(LiuYan.class);

    private String UserName;
    private String Theme;
    private String Content;
    private String Time;
private MessageBoardService messageBoardService=new MessageBoardServiceImpl();

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getTheme() {
        return Theme;
    }

    public void setTheme(String theme) {
        Theme = theme;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String execute() throws Exception {
//        String time=new
        Time=new Date().toString();
        System.out.println(UserName+"\t"+Theme+"\t"+Content+"\t"+Time);
        MessageBoard messageBoard=new MessageBoard();
        messageBoard.setContent(Content);
        messageBoard.setUserName(UserName);
        messageBoard.setTheme(Theme);
        messageBoard.setTime(Time);
        messageBoardService.saveMessage(messageBoard);
        logger.info("留言保存成功！");
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("isFirst",1);//记录是否是第一次打开
        return "msuccess";
        }
}
