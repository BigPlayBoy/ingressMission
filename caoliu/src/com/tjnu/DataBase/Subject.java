package com.tjnu.DataBase;

/**
 * Created by 11517 on 2017/3/26.
 */
public class Subject {
    private int subjectId;
    private String subjectContent;
    private int subjectChapter;
    private int subjectGrade;//整型
    private int subjectHard;//整型
    private String subjectImg;
    private String subjectBeizhu;
private String subjectType;

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectContent='" + subjectContent + '\'' +
                ", subjectChapter=" + subjectChapter +
                ", subjectGrade=" + subjectGrade +
                ", subjectHard=" + subjectHard +
                ", subjectImg='" + subjectImg + '\'' +
                ", subjectBeizhu='" + subjectBeizhu + '\'' +
                ", subjectType='" + subjectType + '\'' +
                '}';
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectContent() {
        return subjectContent;
    }

    public void setSubjectContent(String subjectContent) {
        this.subjectContent = subjectContent;
    }

    public int getSubjectChapter() {
        return subjectChapter;
    }

    public void setSubjectChapter(int subjectChapter) {
        this.subjectChapter = subjectChapter;
    }

    public int getSubjectGrade() {
        return subjectGrade;
    }

    public void setSubjectGrade(int subjectGrade) {
        this.subjectGrade = subjectGrade;
    }

    public int getSubjectHard() {
        return subjectHard;
    }

    public void setSubjectHard(int subjectHard) {
        this.subjectHard = subjectHard;
    }

    public String getSubjectImg() {
        return subjectImg;
    }

    public void setSubjectImg(String subjectImg) {
        this.subjectImg = subjectImg;
    }

    public String getSubjectBeizhu() {
        return subjectBeizhu;
    }

    public void setSubjectBeizhu(String subjectBeizhu) {
        this.subjectBeizhu = subjectBeizhu;
    }
}
