package com.cui.dao;

import com.cui.bean.Url;
import com.cui.hibernate.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
}
