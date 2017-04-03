package com.tjnu.dao;

import com.tjnu.po.MessageBoard;
import com.tjnu.util.Page;

import java.util.List;

public interface MessageBoardDAO {
 boolean insertMessage(MessageBoard message);
    List<MessageBoard> findMessageByName(String username);
    List<MessageBoard> findMessageByTheme(String theme);
    List<MessageBoard> findAllMessage( );
    int findMessageCount();
List<MessageBoard> findMessageByPage(Page page);
}

