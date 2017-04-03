package com.tjnu.test;

/**
 * Created by 11517 on 2017/3/26.
 */
public class Worker extends Person {
    public Integer wid;      //工人标识，与父类person内连接
    public String wno;      //工号
    public Double salary;   //工资

    public Integer getWid() {
        return wid;
    }
    public void setWid(Integer wid) {
        this.wid = wid;
    }
    public String getWno() {
        return wno;
    }
    public void setWno(String wno) {
        this.wno = wno;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
