package com.tjnu.po;

/**
 * Created by 11517 on 2017/3/20.
 */
public class Video {
    private int videoId;
    private String videoName;
    private String videoDetail;

    @Override
    public String toString() {
        return "Video{" +
                "videoId=" + videoId +
                ", videoMame='" + videoName + '\'' +
                ", videoDetail='" + videoDetail + '\'' +
                '}';
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

    public void setVideoName(String videoMame) {
        this.videoName = videoMame;
    }

    public String getVideoDetail() {
        return videoDetail;
    }

    public void setVideoDetail(String videoDetail) {
        this.videoDetail = videoDetail;
    }
}
