package com.tjnu.dao;

import com.tjnu.po.Teacher;

public interface TeacherDAO {
	public Teacher findByTeacherID(String teacherID);//查询方法，根据教师ID查询
}
