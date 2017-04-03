package com.tjnu.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tjnu.po.MessageBoard;
import com.tjnu.po.Student;
import com.tjnu.service.MessageBoardService;
import com.tjnu.service.MessageBoardServiceImpl;
import com.tjnu.util.Page;
import com.tjnu.util.PageResult;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by jarvis on 2017/2/21.
 *
 */
public class QueryMessageAction extends ActionSupport {
    private static Logger logger = Logger.getLogger(QueryMessageAction.class);

    private int currentPage;		//当前页
    private int isFirst;//是否第一次打开页面
private MessageBoardService messageBoardService=new MessageBoardServiceImpl();
    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(int isFirst) {
        this.isFirst = isFirst;
    }

    public String execute() throws Exception {
        logger.info("获取留言信息");
        //这里要先判断是不是登陆了
        Map session = ActionContext.getContext().getSession();
        Student student = (Student)session.get("studentInfo");
        if(student==null){
            logger.info("没有登陆，不能访问");
            addActionError("请先登陆！");
            return "notLogin";
        }
        Page page = new Page();
        page.setEveryPage(3);//每页显示3条记录
        page.setCurrentPage(currentPage);//设置当前页
        PageResult pageResult = messageBoardService.queryMessageByPage(page);
        List<MessageBoard> messageBoards = pageResult.getList();//获得试题记录
        page = pageResult.getPage();//获得分页信息

        HttpServletRequest request = ServletActionContext.getRequest();
        logger.info("输出获取到的留言内容\t"+messageBoards.get(0));
        request.setAttribute("messageBoards", messageBoards);
        request.setAttribute("page", page);
        request.setAttribute("isFirst",isFirst);//记录是否是第一次打开
        return "isSuccess";
    }
}
