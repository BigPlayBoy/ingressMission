package com.tjnu.po;

/**
 * Created by 11517 on 2017/3/20.
 */
public class VideoSource {
    private int videoSourceId;
    private int videoId;
    private String videoName;
    private String videoUrl;
    private String videoDetail;
private String videoImgUrl;


    public String getVideoImgUrl() {
        return videoImgUrl;
    }

    public void setVideoImgUrl(String videoImgUrl) {
        this.videoImgUrl = videoImgUrl;
    }
    @Override
    public String toString() {
        return "VideoSource{" +
                "videoSourceId=" + videoSourceId +
                ", videoId=" + videoId +
                ", videoName='" + videoName + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", videoDetail='" + videoDetail + '\'' +
                ", videoImgUrl='" + videoImgUrl + '\'' +
                '}';
    }

    public int getVideoSourceId() {
        return videoSourceId;
    }

    public void setVideoSourceId(int videoSourceId) {
        this.videoSourceId = videoSourceId;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoDetail() {
        return videoDetail;
    }

    public void setVideoDetail(String videoDetail) {
        this.videoDetail = videoDetail;
    }
}
