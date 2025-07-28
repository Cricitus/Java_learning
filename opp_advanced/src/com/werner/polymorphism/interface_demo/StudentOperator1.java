package com.werner.polymorphism.interface_demo;

import java.util.ArrayList;

public class StudentOperator1 implements StudentOperator {
    public void printInfo(ArrayList<Student> students){
        System.out.println("信息如下");
        for(int i=0;i<students.size();i++){
            Student s= students.get(i);
            System.out.println(s.getName() + " " + s.getSex() + " "  +s.getScore());
        }
    }
    public void printAveScore(ArrayList<Student> students){
        System.out.println("平均分");
        double score=0;
        for(int i=0;i<students.size();i++){
            Student s= students.get(i);
            score+=s.getScore();
        }
        double avescore = score/students.size();
        System.out.println(avescore);
    }
}
