package com.cui.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 11517 on 2017/4/2.
 */
public class SearchMissionAction extends ActionSupport {
    private String missionName;

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String execute() throws Exception {
        System.out.println("查询任务:"+missionName);
        return SUCCESS;
    }
}
