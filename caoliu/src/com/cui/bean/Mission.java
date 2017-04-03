package com.cui.bean;

/**
 * Created by 11517 on 2017/4/3.
 */
public class Mission extends Url{
    private int missionId;
    private String designer;
    private String missionNo;
    private String portalNo;
    private String position;
    private String start;
    private String end;
    private String missionProperty;
    private String requiredTime;
    private String suggestedTrans;
    private String notice;
    private String missionImg;

    @Override
    public String toString() {
        return "Mission{" +
                "missionId=" + missionId +
                ", designer='" + designer + '\'' +
                ", missionNo='" + missionNo + '\'' +
                ", portalNo='" + portalNo + '\'' +
                ", position='" + position + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", missionProperty='" + missionProperty + '\'' +
                ", requiredTime='" + requiredTime + '\'' +
                ", suggestedTrans='" + suggestedTrans + '\'' +
                ", notice='" + notice + '\'' +
                ", missionImg='" + missionImg + '\'' +
                "} " + super.toString();
    }

    public String getMissionImg() {
        return missionImg;
    }

    public void setMissionImg(String missionImg) {
        this.missionImg = missionImg;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public int getMissionId() {
        return missionId;
    }

    public void setMissionId(int missionId) {
        this.missionId = missionId;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getMissionNo() {
        return missionNo;
    }

    public void setMissionNo(String missionNo) {
        this.missionNo = missionNo;
    }

    public String getPortalNo() {
        return portalNo;
    }

    public void setPortalNo(String portalNo) {
        this.portalNo = portalNo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getMissionProperty() {
        return missionProperty;
    }

    public void setMissionProperty(String missionProperty) {
        this.missionProperty = missionProperty;
    }

    public String getRequiredTime() {
        return requiredTime;
    }

    public void setRequiredTime(String requiredTime) {
        this.requiredTime = requiredTime;
    }

    public String getSuggestedTrans() {
        return suggestedTrans;
    }

    public void setSuggestedTrans(String suggestedTrans) {
        this.suggestedTrans = suggestedTrans;
    }
}
