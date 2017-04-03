package com.tjnu.service;

import com.tjnu.po.Course;

import java.util.List;

/**
 * Created by 11517 on 2017/3/14.
 * 课程service
 */
public interface CourseService {
    //保存课程信息
    boolean saveCourse(Course course);
    //按课程名称查询课程
    List<Course> getCourseByName(String courseName);
}
