package com.tjnu.service;

import com.tjnu.po.MessageBoard;
import com.tjnu.util.Page;
import com.tjnu.util.PageResult;

public interface MessageBoardService {
boolean saveMessage(MessageBoard messageBoard);
    PageResult queryMessageByPage(Page page);
}
