package com.tjnu.dao;

import com.tjnu.hibernate.HibernateSessionFactory;
import com.tjnu.po.VideoSource;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by 11517 on 2017/3/20.
 */
public class VideoSourceDaoImpl implements VideoSourceDao {
    @Override
    public List<VideoSource> getVideoSourceByVideoId(int videoId) {
        Session session= HibernateSessionFactory.getSession();//获得session对象
        Query query=session.createQuery("from VideoSource where videoId=?");//按视频编号查询资源
        query.setInteger(0,videoId);
        List list=query.list();
        HibernateSessionFactory.closeSession();		//关闭Session对象
        return list;

    }
}
