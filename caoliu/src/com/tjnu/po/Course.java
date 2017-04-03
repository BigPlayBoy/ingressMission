package com.tjnu.po;

/**
 * Created by 11517 on 2017/3/14.
 * 课程类，包括课程id，课程名称，课程资源链接,课程备注等
 */
public class Course {
    private int courseId;//课程ID
    private String courseName;//课程名称
    private String courseUrl;//课程资源列表
    private String courseBeizhu;//课程备注

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseUrl='" + courseUrl + '\'' +
                ", courseBeizhu='" + courseBeizhu + '\'' +
                '}';
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseUrl() {
        return courseUrl;
    }

    public void setCourseUrl(String courseUrl) {
        this.courseUrl = courseUrl;
    }

    public String getCourseBeizhu() {
        return courseBeizhu;
    }

    public void setCourseBeizhu(String courseBeizhu) {
        this.courseBeizhu = courseBeizhu;
    }
}
