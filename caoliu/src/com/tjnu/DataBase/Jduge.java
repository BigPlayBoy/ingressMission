package com.tjnu.DataBase;

/**
 * Created by 11517 on 2017/3/26.
 */
public class Jduge extends Subject{
    private int jdugeId;
    private String jdugeAnswer;

    @Override
    public String toString() {
        return "Jduge{" +
                "jdugeId=" + jdugeId +
                ", jdugeAnswer=" + jdugeAnswer +
                "} " + super.toString();
    }

    public int getJdugeId() {
        return jdugeId;
    }

    public void setJdugeId(int jdugeId) {
        this.jdugeId = jdugeId;
    }

    public String getJdugeAnswer() {
        return jdugeAnswer;
    }

    public void setJdugeAnswer(String jdugeAnswer) {
        this.jdugeAnswer = jdugeAnswer;
    }
}
