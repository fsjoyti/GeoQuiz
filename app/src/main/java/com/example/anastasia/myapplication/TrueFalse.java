package com.example.anastasia.myapplication;

/**
 * Created by Anastasia on 5/13/2016.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;
    public TrueFalse(int question,boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;

    }
    public int getQuestion(){
        return mQuestion;
    }
    public void setQuestion(boolean trueQuestion){
        mTrueQuestion = trueQuestion;

    }
    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }
    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
}
