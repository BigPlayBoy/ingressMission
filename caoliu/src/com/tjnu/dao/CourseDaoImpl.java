package com.tjnu.dao;

import com.tjnu.hibernate.HibernateSessionFactory;
import com.tjnu.po.Course;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by 11517 on 2017/3/14.
 * 课程DAO
 */
public class CourseDaoImpl implements CourseDao {
    private static Logger logger = Logger.getLogger(CourseDaoImpl.class);

    @Override
    public boolean saveCourse(Course course) {
        Session session= HibernateSessionFactory.getSession();//获得session对象
        Transaction transaction = null;//声明一个事务对象
        try{
            transaction = session.beginTransaction();//开启事务
            session.save(course);//更新学生信息
            transaction.commit();//提交事务
        }catch(Exception ex) {
            ex.printStackTrace();
            transaction.rollback();//事务回滚
            return false;
        }
//        session.cl
        HibernateSessionFactory.closeSession();
        logger.info("保存课程信息成功");
        return true;
    }

    @Override
    public List<Course> getCourseByName(String courseName) {
        Session session=HibernateSessionFactory.getSession();//获得session对象
        Query query=session.createQuery("from Course as cou where Cou.courseName=?");//按课程名称查询课程结果
        query.setString(0,courseName);
        List list=query.list();
        HibernateSessionFactory.closeSession();		//关闭Session对象
        return list;
    }
}
