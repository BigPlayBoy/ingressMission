package com.tjnu.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * Created by 11517 on 2017/3/19.
 */
public class CloseAction extends ActionSupport {
    private static Logger logger = Logger.getLogger(jiaocaiAction.class);

    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();

       session.remove("studentInfo");

        return SUCCESS;
    }
}