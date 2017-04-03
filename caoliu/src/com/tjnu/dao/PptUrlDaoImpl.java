package com.tjnu.dao;

import com.tjnu.hibernate.HibernateSessionFactory;
import com.tjnu.po.PptUrls;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by 11517 on 2017/3/17.
 */
public class PptUrlDaoImpl implements PptUrlDao {
    private static Logger logger = Logger.getLogger(PptUrlDaoImpl.class);

    @Override
    public List<PptUrls> getPptUrlsByPptId(int pptId) {
        Session session= HibernateSessionFactory.getSession();//获得session对象
        Query query=session.createQuery("from PptUrls where pptId=?");//查找所有的考试结果
        query.setInteger(0,pptId);
        List list=query.list();
        HibernateSessionFactory.closeSession();		//关闭Session对象
        return list;
    }
}
