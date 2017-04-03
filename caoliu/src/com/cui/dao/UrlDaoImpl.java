package com.cui.dao;

import com.cui.Utils.Page;
import com.cui.bean.Url;
import com.cui.hibernate.HibernateSessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by 11517 on 2017/4/2.
 */
public class UrlDaoImpl implements UrlDao {
    @Override
    public boolean saveUrl(Url url) {
        Session session= HibernateSessionFactory.getSession();//获得session对象
        Transaction transaction = null;//声明一个事务对象
        try{
            transaction = session.beginTransaction();//开启事务
            session.save(url);//更新学生信息
            transaction.commit();//提交事务
        }catch(Exception ex) {
            ex.printStackTrace();
            transaction.rollback();//事务回滚
            return false;
        }
        HibernateSessionFactory.closeSession();
        return true;
    }

    @Override
    public List<Url> getUrlListByPage(Page page) {
        Session session=HibernateSessionFactory.getSession();
        Query query= session.createQuery("from Url");
        query.setFirstResult(page.getBeginIndex());
        query.setMaxResults(page.getEveryPage());
        List list=query.list();
        return list;
    }
}
