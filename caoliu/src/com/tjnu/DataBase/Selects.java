package com.tjnu.DataBase;

/**
 * Created by 11517 on 2017/3/26.
 */
public class Selects extends Subject{
    private int selectsId;

    @Override
    public String toString() {
        return "Selects{" +
                "selectsId=" + selectsId +
                ", selectsA='" + selectsA + '\'' +
                ", selectsB='" + selectsB + '\'' +
                ", selectsC='" + selectsC + '\'' +
                ", selectsD='" + selectsD + '\'' +
                ", selectsE='" + selectsE + '\'' +
                ", selectsAnswer=" + selectsAnswer +
                "} " + super.toString();
    }

    public int getSelectsId() {
        return selectsId;
    }

    public void setSelectsId(int selectsId) {
        this.selectsId = selectsId;
    }

    private String selectsA;
    private String selectsB;
    private String selectsC;
    private String selectsD;
    private String selectsE;
    private String selectsAnswer;

    public String getSelectsA() {
        return selectsA;
    }

    public void setSelectsA(String selectsA) {
        this.selectsA = selectsA;
    }

    public String getSelectsB() {
        return selectsB;
    }

    public void setSelectsB(String selectsB) {
        this.selectsB = selectsB;
    }

    public String getSelectsC() {
        return selectsC;
    }

    public void setSelectsC(String selectsC) {
        this.selectsC = selectsC;
    }

    public String getSelectsD() {
        return selectsD;
    }

    public void setSelectsD(String selectsD) {
        this.selectsD = selectsD;
    }

    public String getSelectsE() {
        return selectsE;
    }

    public void setSelectsE(String selectsE) {
        this.selectsE = selectsE;
    }

    public String getSelectsAnswer() {
        return selectsAnswer;
    }

    public void setSelectsAnswer(String selectsAnswer) {
        this.selectsAnswer = selectsAnswer;
    }
}
