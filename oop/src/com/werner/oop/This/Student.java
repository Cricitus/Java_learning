package com.werner.oop.This;

public class Student {
    double score;
    public void prinThis() {
        System.out.println(this);
    }
    public void prinPass(double score) {
        if (this.score >= score) {
            System.out.println("Great");
        }else  {
            System.out.println("Not Great");
        }
    }
}
