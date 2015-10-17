package com.cs5890;

import java.util.ArrayList;

/**
 * Created by IVYBRIDGE on 10/17/2015.
 */
public class StudentAnswerCollection {
    private ArrayList<String> answers;

    StudentAnswerCollection(ArrayList<String> answers){
        this.answers = answers;
    }

    StudentAnswerCollection(){
        this.answers = new ArrayList<String>();
    }

    void addAnswer(String answer){
        this.answers.add(answer);
    }

    void removeAnswer(int idx){
        this.answers.remove(idx);
    }

    String getNextAnswer(){
        int len = answers.size();
        String temp = this.answers.get(len-1);
        removeAnswer(len-1);

        return temp;
    }
}
