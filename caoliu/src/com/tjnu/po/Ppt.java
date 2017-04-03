package com.tjnu.po;

/**
 * Created by 11517 on 2017/3/16.
 */
public class Ppt {
    private int pptId;
    private String pptName;
    private String pptDetail;
    private String  pptSourceUrl;

    @Override
    public String toString() {
        return "Ppt{" +
                "pptId=" + pptId +
                ", pptName='" + pptName + '\'' +
                ", pptDetail='" + pptDetail + '\'' +
                ", pptSourceUrl='" + pptSourceUrl + '\'' +
                '}';
    }

    public String getPptSourceUrl() {
        return pptSourceUrl;
    }

    public void setPptSourceUrl(String pptSourceUrl) {
        this.pptSourceUrl = pptSourceUrl;
    }

    public int getPptId() {
        return pptId;
    }

    public void setPptId(int pptId) {
        this.pptId = pptId;
    }

    public String getPptName() {
        return pptName;
    }

    public void setPptName(String pptName) {
        this.pptName = pptName;
    }

    public String getPptDetail() {
        return pptDetail;
    }

    public void setPptDetail(String pptDetail) {
        this.pptDetail = pptDetail;
    }
}
