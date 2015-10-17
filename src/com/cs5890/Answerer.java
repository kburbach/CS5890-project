/**
 * This class stores the golden, or accepted, answer to a question and the question itself. It provides basic getter and
 * setter methods to access and modify these properties
 */
package com.cs5890;

class Answerer{

    private String golden_answer;
    private String question;

    //Can create an Answerer object with a question and a golden_answer, or neither
    Answerer(String question, String golden_answer){
        this.question = question;
        this.golden_answer = golden_answer;
    }

    Answerer(){
        this.question = null;
        this.golden_answer = null;
    }

    //For adding a question if the object was created without one
    void addQuestion(String question){
        this.question = question;
    }

    //For adding a golden_answer if the object was created without one
    void addGoldenAnswer(String answer){
        this.golden_answer = answer;
    }

    //For changing a golden_answer after the object was created
    void changeGoldenAnswer(String answer){
        addGoldenAnswer(answer);
    }

    //For changing a question after the object was created
    void changeQuestion(String question){
        addQuestion(question);
    }

    //return the golden_answer
    String getGoldenAnswer(){
        return this.golden_answer;
    }

    //return the question
    String getQuestion(){
        return this.question;
    }
}