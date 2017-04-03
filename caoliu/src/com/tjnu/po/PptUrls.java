package com.tjnu.po;

/**
 * Created by 11517 on 2017/3/16.
 */
public class PptUrls {
    private int pptUrlsId;
    private int pptId;
    private String pptUrl;
    private String pptUrlDetail;

    @Override
    public String toString() {
        return "PptUrls{" +
                "pptUrlsId=" + pptUrlsId +
                ", pptId=" + pptId +
                ", pptUrl='" + pptUrl + '\'' +
                ", pptUrlDetail='" + pptUrlDetail + '\'' +
                '}';
    }

    public int getPptUrlsId() {
        return pptUrlsId;
    }

    public void setPptUrlsId(int pptUrlsId) {
        this.pptUrlsId = pptUrlsId;
    }

    public int getPptId() {
        return pptId;
    }

    public void setPptId(int pptId) {
        this.pptId = pptId;
    }

    public String getPptUrl() {
        return pptUrl;
    }

    public void setPptUrl(String pptUrl) {
        this.pptUrl = pptUrl;
    }

    public String getPptUrlDetail() {
        return pptUrlDetail;
    }

    public void setPptUrlDetail(String pptUrlDetail) {
        this.pptUrlDetail = pptUrlDetail;
    }
}
