package com.tjnu.dao;

import com.tjnu.hibernate.HibernateSessionFactory;
import com.tjnu.po.Ppt;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by 11517 on 2017/3/17.
 */
public class PptDaoImpl implements PptDao {
    private static Logger logger = Logger.getLogger(PptDaoImpl.class);

    @Override
    public boolean savePpt(Ppt ppt) {
        Session session= HibernateSessionFactory.getSession();//获得session对象
        Transaction transaction = null;//声明一个事务对象
        try{
            transaction = session.beginTransaction();//开启事务
            session.save(ppt);//更新学生信息
            transaction.commit();//提交事务
        }catch(Exception ex) {
            ex.printStackTrace();
            transaction.rollback();//事务回滚
            logger.error("保存考試信息失败");
            return false;
        }
        logger.info("保存考試信息成功");
        HibernateSessionFactory.closeSession();
        return true;
    }

    @Override
    public List<Ppt> getPpt() {
        Session session=HibernateSessionFactory.getSession();//获得session对象
        Query query=session.createQuery("from Ppt ");//查找所有的考试结果
        List list=query.list();
        HibernateSessionFactory.closeSession();		//关闭Session对象
        return list;
    }
}
