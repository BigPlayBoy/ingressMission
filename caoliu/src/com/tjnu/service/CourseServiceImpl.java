package com.tjnu.service;

import com.tjnu.dao.CourseDao;
import com.tjnu.dao.CourseDaoImpl;
import com.tjnu.po.Course;

import java.util.List;

/**
 * Created by 11517 on 2017/3/14.
 */
public class CourseServiceImpl implements CourseService {
    @Override
    public boolean saveCourse(Course course) {
        CourseDao courseDao=new CourseDaoImpl() ;
        courseDao.saveCourse(course);
        return false;
    }

    @Override
    public List<Course> getCourseByName(String courseName) {
        CourseDao courseDao=new CourseDaoImpl();
        List<Course> list=courseDao.getCourseByName(courseName);
        return list;
    }
}
