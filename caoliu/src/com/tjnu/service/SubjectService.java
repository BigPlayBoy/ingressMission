package com.tjnu.service;

import java.util.List;

import com.tjnu.DataBase.Jduge;
import com.tjnu.DataBase.Select;
import com.tjnu.DataBase.Subject;
import com.tjnu.util.Page;
import com.tjnu.util.PageResult;

public interface SubjectService {
	// 添加试题，首先判断该试题标题是否已经存在，如果已经则不能添加
	 boolean saveSubject(Subject subject);
	// 按分页信息查询试题
	 PageResult querySubjectByPage(Page page);
	PageResult querySubjectSelectByPage(String tixing,String chapter,String hard,String guanjianzi,Page page);

	// 查看试题详细信息
	 Subject showSubjectParticular(int subjectID);
    // 查看试题详细信息
    Select showSelectParticular(int selectId);
	// 更新试题信息
	 void updateSubject(Subject subject);
	// 删除试题信息
	 void deleteSubject(int subjectID);
	//模糊查询试题信息
	 PageResult likeQueryBySubjectTitle(String subjectTitle,Page page);
	//随机查询试题记录
	 List<Subject> randomFindSubject(int number);

	//随机查询试题记录
	List<Select> randomFindSelect(int number);

	//计算学生得分
	 int accountResult(List<Integer> subjectIDs,List<String> studentAnswers);
}
