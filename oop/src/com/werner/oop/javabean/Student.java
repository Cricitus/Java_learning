package com.werner.oop.javabean;

public class Student {
    //1.必须私有成员变量，提供get和set的方法
    private String name;
    private double score;
    //2.必须为类提供公开的无参构造器
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }
}
