package com.tjnu.dao;

import com.tjnu.hibernate.HibernateSessionFactory;
import com.tjnu.test.Person;
import com.tjnu.test.Students;
import com.tjnu.test.Worker;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Objects;

/**
 * Created by 11517 on 2017/3/26.
 */
public class TableDao {
    //保存学生信息，执行段代码后，student对象的id，name，sex，age会自动保存在person表中，特征属性sid，sno，school会保存在student表中，person表的Id字段和student表的Sid字段是内连接的
    public void saveStu(Students stu){
        Session session=HibernateSessionFactory.getSession();
        Transaction ts=null;
        try{
            ts=session.beginTransaction();
            session.saveOrUpdate(stu);
            ts.commit();
        }catch(Exception ex){
            ts.rollback();
            System.out.println("添加学生信息失败");
        }finally{
            HibernateSessionFactory.closeSession();
        }
    }

    //加载学生信息，过程是参数id与person表内连接，查询person表的公共字段和student表的特征字段
    public Students loadStu(Integer id){
        Session session=HibernateSessionFactory.getSession();
        Transaction ts=null;
        Students stu=null;
        try{
            ts=session.beginTransaction();
            stu=(Students)session.get(Students.class, id);
            ts.commit();
        }catch(Exception ex){
            ts.rollback();
            System.out.println("加载学生信息失败");
        }finally{
            HibernateSessionFactory.closeSession();
        }
        return stu;
    }

    //保存工人信息，执行段代码后，worker对象的id，name，sex，age会自动保存在person表中，特征属性wid，wno，salary会保存在worker表中，person表的Id字段和worker表的Wid字段是内连接的
    public void saveWorker(Worker worker){
        Session session=HibernateSessionFactory.getSession();
        Transaction ts=null;
        try{
            ts=session.beginTransaction();
            session.saveOrUpdate(worker);
            ts.commit();
        }catch(Exception ex){
            ts.rollback();
            System.out.println("添加工人信息失败");
        }finally{
            HibernateSessionFactory.closeSession();
        }
    }
    //加载工人信息，过程是参数id与person表内连接，查询person表的公共字段和woker表的特征字段
    public Worker loadWorker(Integer id){
        Session session= HibernateSessionFactory.getSession();
        Transaction ts=null;
        Worker worker=null;
        try{
            ts=session.beginTransaction();
            worker=(Worker)session.get(Worker.class, id);
            ts.commit();
        }catch(Exception ex){
            ts.rollback();
            System.out.println("加载工人信息失败");
        }finally{
            HibernateSessionFactory.closeSession();
        }
        return worker;
    }
    public List<Worker> getWorker(String name){
        Worker worker=new Worker();
        Session session=HibernateSessionFactory.getSession();//获得session对象
        Query query=session.createQuery("from Worker where name = ?");//查找所有的考试结果
        query.setString(0,name);
        List list=query.list();
        HibernateSessionFactory.closeSession();		//关闭Session对象
        return list;
    }
    public List<Person> getPerson(String name){
        Session session=HibernateSessionFactory.getSession();//获得session对象
        Query query=session.createQuery("from Person where name = ?");//查找所有的考试结果
        query.setString(0,name);
        List list=query.list();
        HibernateSessionFactory.closeSession();		//关闭Session对象
        return list;
    }
    public void saveObject(Person worker){
        Session session=HibernateSessionFactory.getSession();
        Transaction ts=null;
        try{
            ts=session.beginTransaction();
            session.saveOrUpdate(worker);
            ts.commit();
        }catch(Exception ex){
            ts.rollback();
            System.out.println("添加工人信息失败");
        }finally{
            HibernateSessionFactory.closeSession();
        }
    }
}
