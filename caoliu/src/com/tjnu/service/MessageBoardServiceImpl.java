package com.tjnu.service;

import com.tjnu.dao.MessageBoardDAO;
import com.tjnu.dao.MessageBoardDAOImpl;
import com.tjnu.po.MessageBoard;
import com.tjnu.util.Page;
import com.tjnu.util.PageResult;
import com.tjnu.util.PageUtil;
import org.apache.log4j.Logger;

import java.util.List;

public class MessageBoardServiceImpl implements MessageBoardService{
    private static Logger logger = Logger.getLogger(MessageBoardServiceImpl.class);

    private MessageBoardDAO messageBoardDAO=new MessageBoardDAOImpl();

    @Override
    public boolean saveMessage(MessageBoard messageBoard) {
        messageBoardDAO.insertMessage(messageBoard);
        logger.info("保存成功");
        return false;
    }

    @Override
    public PageResult queryMessageByPage(Page page) {
        page= PageUtil.createPage(page.getEveryPage(),messageBoardDAO.findMessageCount(),page.getCurrentPage());//根据总记录数创建分页信息
        List<MessageBoard> list =messageBoardDAO.findMessageByPage(page);//通过分页信息取得试题
        PageResult result=new PageResult(page,list);//封装分页信息和记录信息，返回给调用处
        return result;
    }
}
