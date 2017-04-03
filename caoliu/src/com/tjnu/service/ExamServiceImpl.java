package com.tjnu.service;

import com.tjnu.dao.ExamDAO;
import com.tjnu.dao.ExamDAOImpl;
import com.tjnu.po.Exam;

public class ExamServiceImpl implements ExamService{

	@Override
	public Boolean saveExam(Exam exam) {
		// TODO Auto-generated method stub
		ExamDAO examDAO=new ExamDAOImpl();
		return examDAO.insertEaxmResult(exam);
	}

}
