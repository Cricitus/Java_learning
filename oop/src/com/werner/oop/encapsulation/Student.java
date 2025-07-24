package com.werner.oop.encapsulation;

public class Student {
    private String name;

    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    private void printPass(){
        System.out.println("what？");
    }
}
