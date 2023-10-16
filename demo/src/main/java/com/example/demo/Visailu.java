package com.example.demo;

public class Visailu {
    private String question;
    private String answer;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;



    public Visailu(String question, String answer, String choiceA, String choiceB, String choiceC, String choiceD) {
        this.question = question;
        this.answer = answer;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.choiceD = choiceD;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getChoiceA() {
        return this.choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA;
    }

    public String getChoiceB() {
        return this.choiceB;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB;
    }

    public String getChoiceC() {
        return this.choiceC;
    }

    public void setChoiceC(String choiceC) {
        this.choiceC = choiceC;
    }

    public String getChoiceD() {
        return this.choiceD;
    }

    public void setChoiceD(String choiceD) {
        this.choiceD = choiceD;
    }




}
