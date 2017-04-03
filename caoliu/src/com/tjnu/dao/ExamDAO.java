package com.tjnu.dao;

import com.tjnu.po.Exam;

import java.util.List;

public interface ExamDAO {
//增删改查
	 Boolean insertEaxmResult(Exam exam);//增加考试结果
	List<Exam> findAllExam();//显示所有的考试结果
	List<Exam> findExamById(String id);

	
}
