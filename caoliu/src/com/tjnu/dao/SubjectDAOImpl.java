package com.tjnu.dao;

import java.util.List;
import java.util.Random;

import com.tjnu.DataBase.Jduge;
import com.tjnu.DataBase.Select;
import com.tjnu.DataBase.Selects;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tjnu.hibernate.HibernateSessionFactory;
import com.tjnu.DataBase.Subject;
import com.tjnu.util.Page;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class SubjectDAOImpl implements SubjectDAO{
	public void addSubject(Subject subject){
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.save(subject);//保存试题信息
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象
	}

	public List<Subject> findSubjectSelectByPage(String tixing,String chapter,String hard,String guanjianzi,Page page) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象

		DetachedCriteria detachedCriteria=DetachedCriteria.forClass(Subject.class);
		if(tixing.length()!=0&&!"0".equals(tixing)){
			detachedCriteria.add(Restrictions.eq("subjectType",tixing));
		}
		if(chapter.length()!=0&&!"0".equals(chapter)){
			detachedCriteria.add(Restrictions.eq("subjectChapter",new Integer(chapter)));
		}
		if(hard.length()!=0&&!"0".equals(hard)){
			detachedCriteria.add(Restrictions.eq("subjectHard",new Integer(hard)));
		}
		if(guanjianzi.length()!=0){
			detachedCriteria.add(Restrictions.ilike("subjectContent",guanjianzi));
		}
		List<Subject> list=detachedCriteria.getExecutableCriteria(session)
				.setMaxResults(page.getEveryPage())
				.setFirstResult(page.getBeginIndex())
                .addOrder(Order.asc("subjectId"))
				.list();
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}

	public int findSubjectCount() {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Subject");
		List list = query.list();					//查询结果保存到list中
		int count = list.size();
		HibernateSessionFactory.closeSession();//关闭Session对象
		return count;
	}
	public int findSubjectCountBySelect(String tixing,String chapter,String hard,String guanjianzi) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		DetachedCriteria detachedCriteria=DetachedCriteria.forClass(Subject.class);
		if(tixing.length()!=0&&!"0".equals(tixing)){
			detachedCriteria.add(Restrictions.eq("subjectType",tixing));
		}
		if(chapter.length()!=0&&!"0".equals(chapter)){
			detachedCriteria.add(Restrictions.eq("subjectChapter",new Integer(chapter)));
		}
		if(hard.length()!=0&&!"0".equals(hard)){
			detachedCriteria.add(Restrictions.eq("subjectHard",new Integer(hard)));
		}
		if(guanjianzi.length()!=0){
			detachedCriteria.add(Restrictions.ilike("subjectContent",guanjianzi));
		}
		List list=detachedCriteria.getExecutableCriteria(session).list();
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list.size();
	}

	@Override
	public int findSelectCount() {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Select ");
		List list = query.list();					//查询结果保存到list中
		int count = list.size();
		HibernateSessionFactory.closeSession();//关闭Session对象
		return count;
	}

	@Override
	public int findJdugeCount() {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Jduge ");
		List list = query.list();					//查询结果保存到list中
		int count = list.size();
		HibernateSessionFactory.closeSession();//关闭Session对象
		return count;
	}

	@Override
	public int findSelectsCount() {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Selects ");
		List list = query.list();					//查询结果保存到list中
		int count = list.size();
		HibernateSessionFactory.closeSession();//关闭Session对象
		return count;
	}

	public Subject findSubjectByID(int subjectID) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Subject subject = (Subject) session.get(Subject.class, subjectID);
		HibernateSessionFactory.closeSession();		//关闭Session对象
		return subject;
	}
    public Select findSelectByID(int selectId) {
        Session session = HibernateSessionFactory.getSession();//获得Session对象
        Select select = (Select) session.get(Select.class, selectId);
        HibernateSessionFactory.closeSession();		//关闭Session对象
        return select;
    }

	@Override
	public List<Subject> likeQueryByTitle(String subjectTitle, Page page) {
		return null;
	}

	public void updateSubject(Subject subject) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.update(subject);//更新试题信息
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象
	}

	public void deleteSubject(int subjectID) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Subject subject = (Subject) session.get(Subject.class, subjectID);
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.delete(subject);
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象
	}

	public int findLinkQueryCount(String subjectContent) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Subject as sub where sub.subjectContent like :title ");
		query.setString("title","%"+subjectContent+"%");
		List list = query.list();					//查询结果保存到list中
		int count = list.size();
		HibernateSessionFactory.closeSession();//关闭Session对象
		return count;
	}

	public List<Subject> randomFindSubject(int number) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Subject as sub order by rand()");
//        Random random=new Random();
//        query.setInteger(0,random.nextInt(number));
		query.setMaxResults(number);//设置查询记录数
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}

	@Override
	public List<Subject> randomFindJduge(int number) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Jduge  order by rand()");
//        Random random=new Random();
//		query.setInteger(0,random.nextInt());
		query.setMaxResults(number);//设置查询记录数
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}

	@Override
	public List<Select> randomFindSelect(int number) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Select  order by rand()");
//        Random random=new Random();
//        query.setInteger(0,random.nextInt());
		query.setMaxResults(number);//设置查询记录数
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}

	@Override
	public List<Subject> randomFindSelects(int number) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Selects  order by rand()");
//		query.setInteger(0,number);
		query.setMaxResults(number);//设置查询记录数
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}

	@Override
	public Subject findSubjectBySubjectContent(String subjectContent) {
        Session session = HibernateSessionFactory.getSession();//获得Session对象
        Subject subject=null;
// (Subject) session.get(Subject.class,subjectContent);
        Query query=session.createQuery("from Subject where subjectContent=?");
        query.setString(0,subjectContent);
        if(query.list().size()>0){
            subject=(Subject) query.list().get(0);
        }
        HibernateSessionFactory.closeSession();//关闭Session对象
        return subject;
	}

	@Override
	public List<Subject> findSubjectByPage(Page page) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Subject ");
		query.setMaxResults(page.getEveryPage());//设置查询记录数
		query.setFirstResult(page.getBeginIndex());//设置查询记录起始位置
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}

	@Override
	public Subject getSubject(String subjectId) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Subject subject = (Subject) session.get(Subject.class, subjectId);
		HibernateSessionFactory.closeSession();		//关闭Session对象
		return subject;
	}

	@Override
	public Jduge getJduge(int jdugeId) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Jduge judge = (Jduge) session.get(Jduge.class, jdugeId);
		HibernateSessionFactory.closeSession();		//关闭Session对象
		return judge;
	}



	@Override
	public Select getSelect(int selectId) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Select select = (Select) session.get(Select.class, selectId);
		HibernateSessionFactory.closeSession();		//关闭Session对象
		return select;
	}

	@Override
	public Selects getSleects(String selectsId) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Selects selects = (Selects) session.get(Selects.class, selectsId);
		HibernateSessionFactory.closeSession();		//关闭Session对象
		return selects;
	}

	@Override
	public List<Subject> getSubjectByPage(Page page) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Subject");
		query.setMaxResults(page.getEveryPage());//设置查询记录数
		query.setFirstResult(page.getBeginIndex());//设置查询记录起始位置
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}

	@Override
	public List<Jduge> getJdugeByPage(Page page) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Jduge ");
		query.setMaxResults(page.getEveryPage());//设置查询记录数
		query.setFirstResult(page.getBeginIndex());//设置查询记录起始位置
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}

	@Override
	public List<Select> getSelectByPage(Page page) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Select");
		query.setMaxResults(page.getEveryPage());//设置查询记录数
		query.setFirstResult(page.getBeginIndex());//设置查询记录起始位置
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}

	@Override
	public List<Selects> getSelectsByPage(Page page) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Selects");
		query.setMaxResults(page.getEveryPage());//设置查询记录数
		query.setFirstResult(page.getBeginIndex());//设置查询记录起始位置
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}

}
