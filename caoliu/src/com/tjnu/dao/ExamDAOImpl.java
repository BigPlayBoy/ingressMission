package com.tjnu.dao;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tjnu.hibernate.HibernateSessionFactory;
import com.tjnu.po.Exam;

import java.util.List;

public class ExamDAOImpl implements ExamDAO{
	private static Logger logger = Logger.getLogger(ExamDAOImpl.class);
	@Override
	public Boolean insertEaxmResult(Exam exam) {
				Session session=HibernateSessionFactory.getSession();//获得session对象
				Transaction  transaction = null;//声明一个事务对象
				try{
					transaction = session.beginTransaction();//开启事务
					session.save(exam);//更新学生信息
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
	public List<Exam> findAllExam() {
		Session session=HibernateSessionFactory.getSession();//获得session对象
		Query query=session.createQuery("from Exam ");//查找所有的考试结果
		List list=query.list();
		HibernateSessionFactory.closeSession();		//关闭Session对象
		return list;
	}

	@Override
	public List<Exam> findExamById(String id) {
		Session session=HibernateSessionFactory.getSession();//获得session对象
		Query query=session.createQuery("from Exam where StudentId=?");//查找所有的考试结果
		query.setString(0,id);
		List list=query.list();
		HibernateSessionFactory.closeSession();		//关闭Session对象
		return list;
	}

}
