package com.tjnu.dao;

import java.util.List;

import com.tjnu.DataBase.Jduge;
import com.tjnu.DataBase.Select;
import com.tjnu.DataBase.Selects;
import com.tjnu.DataBase.Subject;
import com.tjnu.util.Page;

public interface SubjectDAO {
	 Subject findSubjectBySubjectContent(String subjectName);//根据试题标题查找试题
	 List<Subject> findSubjectByPage(Page page);//分页查询试题
	List<Subject> findSubjectSelectByPage(String tixing,String chapter,String hard,String guanjianzi,Page page);//分页查询试题

	Subject findSubjectByID(int subjectID);//根据试题ID查找试题
    Select findSelectByID(int selectId);//根据试题ID查找试题

    List<Subject> likeQueryByTitle(String subjectTitle,Page page);//根据试题标题模糊查询试题
	 int findLinkQueryCount(String subjectTitle);//查询模糊记录数

	 List<Subject> randomFindSubject(int number);//随时取出记录
	List<Subject> randomFindJduge(int number);//随时取出记录
	List<Select> randomFindSelect(int number);//随时取出记录
	List<Subject> randomFindSelects(int number);//随时取出记录

	/*增加题目
	* 子类可以直接使用父类的方法*/
	void addSubject(Subject subject);//保存方法，用来保存判断题
	/*删除题目*/
	void deleteSubject(int subjectId);//根据试题ID删除试题
	/*更新试题*/
	void updateSubject(Subject subject);//更新试题

	/*查找试题---根据ID*/
	Subject getSubject(String subjectId);//根据id查找题目
	Jduge	getJduge(int jdugeId);//根据id查找题目
	Select	getSelect(int selectId);//根据id查找题目
	Selects getSleects(String selectsId);//根据id查找题目
	/*查找试题--*/
	List<Subject> getSubjectByPage(Page page);//分页查询
	List<Jduge> getJdugeByPage(Page page);//分页查询
	List<Select> getSelectByPage(Page page);//分页查询
	List<Selects> getSelectsByPage(Page page);//分页查询

	int findSubjectCount();//查询试题总量
	int findSubjectCountBySelect(String tixing,String chapter,String hard,String guanjianzi);//按条件查询试题总量查询试题总量

	int findSelectCount();//查询试题总量
	int findJdugeCount();//查询试题总量
	int findSelectsCount();//查询试题总量

}
