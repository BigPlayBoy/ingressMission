package com.tjnu.service;

import java.util.List;

import com.tjnu.DataBase.Jduge;
import com.tjnu.DataBase.Select;
import com.tjnu.dao.SubjectDAO;
import com.tjnu.dao.SubjectDAOImpl;
import com.tjnu.DataBase.Subject;
import com.tjnu.util.Page;
import com.tjnu.util.PageResult;
import com.tjnu.util.PageUtil;

/**
 * 所有与题目相关的服务接口，包括增删改查
 */
public class SubjectServiceImpl implements SubjectService{
	private SubjectDAO subjectDAO =  new SubjectDAOImpl();
	
	public boolean saveSubject(Subject subject) {
		String subjectTile = subject.getSubjectContent();
		if(subjectDAO.findSubjectBySubjectContent(subjectTile) == null){ //如果该试题标题不存在，允许添加
			subjectDAO.addSubject(subject);
			return true;
		}else {
			return false;
		}
	}

	public PageResult querySubjectByPage(Page page) {
		page = PageUtil.createPage(page.getEveryPage(),
				subjectDAO.findSubjectCount(),page.getCurrentPage());//根据总记录数创建分页信息
		List<Subject> list = subjectDAO.findSubjectByPage(page);//通过分页信息取得试题
		PageResult result = new PageResult(page,list);//封装分页信息和记录信息，返回给调用处
		return result;
	}

	@Override
	public PageResult querySubjectSelectByPage(String tixing, String chapter, String hard, String guanjianzi,Page page) {
		page = PageUtil.createPage(page.getEveryPage(),
				subjectDAO.findSubjectCountBySelect(tixing, chapter, hard, guanjianzi),
				page.getCurrentPage());//根据总记录数创建分页信息
		List<Subject> list = subjectDAO.findSubjectSelectByPage(tixing, chapter, hard, guanjianzi,page);//通过分页信息取得试题
		PageResult result = new PageResult(page,list);//封装分页信息和记录信息，返回给调用处
		return result;
	}

	public Subject showSubjectParticular(int subjectID) {
		return subjectDAO.findSubjectByID(subjectID);
	}
    public Select showSelectParticular(int selectId) {
        return subjectDAO.findSelectByID(selectId);
    }
	public void updateSubject(Subject subject) {
		subjectDAO.updateSubject(subject);
	}

	public void deleteSubject(int subjectID) {
		subjectDAO.deleteSubject(subjectID);
	}

	public PageResult likeQueryBySubjectTitle(String subjectTitle, Page page) {
		page = PageUtil.createPage(page.getEveryPage(),
				subjectDAO.findLinkQueryCount(subjectTitle),page.getCurrentPage());//根据总记录数创建分页信息
		List<Subject> list = subjectDAO.likeQueryByTitle(subjectTitle, page);//通过分页信息模糊查询试题
		PageResult result = new PageResult(page,list);//封装分页信息和记录信息，返回给调用处
		return result;
	}

	public List<Subject> randomFindSubject(int number) {
		return subjectDAO.randomFindSubject(number);
	}

	public List<Subject> randomFindJduge(int number) {
		return subjectDAO.randomFindJduge(number);
	}

	public List<Select> randomFindSelect(int number) {
		return subjectDAO.randomFindSelect(number);
	}

	public List<Subject> randomFindSelects(int number) {
		return subjectDAO.randomFindSelects(number);
	}

	public int accountResult(List<Integer> subjectIDs,
			List<String> studentAnswers) {
		int GeneralPoint = 0;//总分
		for(int i = 0; i < subjectIDs.size(); i++) {
			String rightAnswer = subjectDAO.
				getSelect(subjectIDs.get(i)).getSelectAnswer();//得到正确答案，通过试题ID
            System.out.println("正确答案是："+rightAnswer+"我选择的答案是"+studentAnswers.get(i));
            if(rightAnswer.equals(studentAnswers.get(i))) {
				GeneralPoint += 5;//加5分
			}
		}
		return GeneralPoint;
	}
}
