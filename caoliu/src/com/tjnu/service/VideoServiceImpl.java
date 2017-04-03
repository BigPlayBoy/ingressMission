package com.tjnu.service;

import com.tjnu.dao.VideoDao;
import com.tjnu.dao.VideoDaoImpl;
import com.tjnu.po.Video;

import java.util.List;

/**
 * Created by 11517 on 2017/3/20.
 */
public class VideoServiceImpl implements VideoService {
    private VideoDao videoDao=new VideoDaoImpl();
    @Override
    public List<Video> getVideo() {
        return videoDao.getVideo();
    }
}
