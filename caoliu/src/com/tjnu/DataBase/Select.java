package com.tjnu.DataBase;

/**
 * Created by 11517 on 2017/3/26.
 */
public class Select extends Subject{
    private int selectId;

    @Override
    public String toString() {
        return "Select{" +
                "selectId=" + selectId +
                ", selectA='" + selectA + '\'' +
                ", selectB='" + selectB + '\'' +
                ", selectC='" + selectC + '\'' +
                ", selectD='" + selectD + '\'' +
                ", selectAnswer=" + selectAnswer +
                "} " + super.toString();
    }

    public int getSelectId() {
        return selectId;
    }

    public void setSelectId(int selectId) {
        this.selectId = selectId;
    }

    private String selectA;
    private String selectB;
    private String selectC;
    private String selectD;
    private String selectAnswer;

    public String getSelectA() {
        return selectA;
    }

    public void setSelectA(String selectA) {
        this.selectA = selectA;
    }

    public String getSelectB() {
        return selectB;
    }

    public void setSelectB(String selectB) {
        this.selectB = selectB;
    }

    public String getSelectC() {
        return selectC;
    }

    public void setSelectC(String selectC) {
        this.selectC = selectC;
    }

    public String getSelectD() {
        return selectD;
    }

    public void setSelectD(String selectD) {
        this.selectD = selectD;
    }

    public String getSelectAnswer() {
        return selectAnswer;
    }

    public void setSelectAnswer(String selectAnswer) {
        this.selectAnswer = selectAnswer;
    }
}
