package com.tjnu.test;

/**
 * Created by 11517 on 2017/3/26.
 */
public class Students extends Person {
    private Integer sid;   //学生标识，与父类person内连接
    private String sno;    //学号
    private String school;  //学校

    public Integer getSid() {
        return sid;
    }
    public void setSid(Integer sid) {
        this.sid = sid;
    }
    public String getSno() {
        return sno;
    }
    public void setSno(String sno) {
        this.sno = sno;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }

}
