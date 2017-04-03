package com.tjnu.dao;

import com.tjnu.po.Course;

import java.util.List;

/**
 * Created by 11517 on 2017/3/14.
 */
public interface CourseDao {
    //保存课程到数据库
    boolean saveCourse(Course course);
    //从数据库中按课程名查询课程
    List<Course> getCourseByName(String courseName);
}
