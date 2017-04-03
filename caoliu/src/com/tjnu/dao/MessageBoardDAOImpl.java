package com.tjnu.dao;


import com.tjnu.hibernate.HibernateSessionFactory;
import com.tjnu.po.MessageBoard;
import com.tjnu.util.Page;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class MessageBoardDAOImpl implements MessageBoardDAO {

    @Override
    public boolean insertMessage(MessageBoard message) {
        Session session = HibernateSessionFactory.getSession();//获得Session对象
        Transaction transaction = null;//声明一个事务对象
        try{
            transaction = session.beginTransaction();//开启事务
            session.save(message);//更新留言信息
            transaction.commit();//提交事务
        }catch(Exception ex) {
            ex.printStackTrace();
            transaction.rollback();//事务回滚
        }
        HibernateSessionFactory.closeSession();//关闭Session对象
        return true;
    }

    @Override
    public List<MessageBoard> findMessageByName(String username) {//根据留言人得姓名查找留言
        Session session = HibernateSessionFactory.getSession();//获得Session对象
        Query query=session.createQuery("from MessageBoard as message where message.UserName =? ");
        query.setString(0,username);
        List list = query.list();					//查询结果保存到list中
        HibernateSessionFactory.closeSession();		//关闭Session对象
        return list;
    }

    @Override
    public List<MessageBoard> findMessageByTheme(String theme) {//根据留言主题寻找留言
        Session session = HibernateSessionFactory.getSession();//获得Session对象
        Query query=session.createQuery("from MessageBoard as message where message.Theme =? ");
        query.setString(0,theme);
        List list = query.list();					//查询结果保存到list中
        HibernateSessionFactory.closeSession();		//关闭Session对象
        return list;
    }

    @Override
    public List<MessageBoard> findAllMessage() {//查找所有的留言
        Session session = HibernateSessionFactory.getSession();//获得Session对象
        Query query=session.createQuery("from MessageBoard as message  ");
        List list = query.list();					//查询结果保存到list中
        HibernateSessionFactory.closeSession();		//关闭Session对象
        return list;
    }

    @Override
    public int findMessageCount() {
        Session session = HibernateSessionFactory.getSession();//获得Session对象
        Query query = session.createQuery("from MessageBoard ");
        List list = query.list();					//查询结果保存到list中
        int count = list.size();
        HibernateSessionFactory.closeSession();//关闭Session对象
        return count;
    }

    @Override
    public List<MessageBoard> findMessageByPage(Page page) {
        Session session = HibernateSessionFactory.getSession();//获得Session对象
        Query query = session.createQuery("from MessageBoard ");
        query.setMaxResults(page.getEveryPage());//设置查询记录数
        query.setFirstResult(page.getBeginIndex());//设置查询记录起始位置
        List list = query.list();					//查询结果保存到list中
        HibernateSessionFactory.closeSession();//关闭Session对象
        return list;
    }
}
