package com.werner.oop.constructor;

public class Student {
    double score;
    String name;
    //无参构造器
    public Student(){
        System.out.println("无参构造器触发");
    }
    //有参构造器
    public Student(String name, double score){
        System.out.println("有参构造器触发");
        this.name = name;
        this.score = score;
    }
}
