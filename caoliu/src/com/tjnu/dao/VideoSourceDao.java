package com.tjnu.dao;

import com.tjnu.po.VideoSource;

import java.util.List;

/**
 * Created by 11517 on 2017/3/20.
 */
public interface VideoSourceDao {
    List<VideoSource> getVideoSourceByVideoId(int videoId);
}
