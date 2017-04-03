package com.tjnu.dao;

import com.tjnu.hibernate.HibernateSessionFactory;
import com.tjnu.po.Video;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by 11517 on 2017/3/20.
 */
public class VideoDaoImpl implements VideoDao {
    @Override
    public List<Video> getVideo() {
        Session session= HibernateSessionFactory.getSession();//获得session对象
        Query query=session.createQuery("from Video ");//查找所有的考试结果
        List list=query.list();
        HibernateSessionFactory.closeSession();		//关闭Session对象
        return list;
    }
}
