package com.github.hcsp.encapsulation;

public class Student {
    // 请按照Main类的要求，补全本类
    /**
     * 姓名
     */
    private String name;

    /**
     * 是否重考。true为重考，false为非重考。
     */
    private boolean retakingExam;

    /**
     * 分数
     */
    private int score;

    /**
     * 是否挂科，true为挂科，false为没挂科。
     */
    private boolean fail;

    public boolean isFail() {
        return fail;
    }

    private void setFail(boolean fail) {
        this.fail = fail;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRetakingExam() {
        return retakingExam;
    }

    public void setRetakingExam(boolean retakingExam) {
        this.retakingExam = retakingExam;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        this.setFail(score < 60);
    }
}
