package com.cui.bean;

/**
 * Created by 11517 on 2017/4/2.
 */
public class Url {
    private int urlId;
    private String urlName;
    private String href;
private String area;

    @Override
    public String toString() {
        return "Url{" +
                "urlId=" + urlId +
                ", urlName='" + urlName + '\'' +
                ", href='" + href + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getUrlId() {
        return urlId;
    }

    public void setUrlId(int urlId) {
        this.urlId = urlId;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
