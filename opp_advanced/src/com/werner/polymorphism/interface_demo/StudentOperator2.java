package com.werner.polymorphism.interface_demo;

import java.util.ArrayList;

public class StudentOperator2 implements StudentOperator {
    public void printInfo(ArrayList<Student> students){
        System.out.println("信息如下");
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<students.size();i++){
            Student s= students.get(i);
            System.out.println(s.getName() + " " + s.getSex() + " "  +s.getScore());
            if(s.getSex() == '男'){
                count1++;
            }
            else {
                count2++;
            }
        }
        System.out.println("男生有" + count1 + " " + "女生有" + count2);
    }
    public void printAveScore(ArrayList<Student> students){
        System.out.println("平均分");
        double score=0;
        double max= students.get(0).getScore();
        double min= students.get(0).getScore();
        for(int i=0;i<students.size();i++){
            if(students.get(i).getScore()>max){
                max=students.get(i).getScore();
            }
            else if(students.get(i).getScore()<min){
                min=students.get(i).getScore();
            }
            Student s= students.get(i);
            score+=s.getScore();
        }
        double avescore = (score - max - min)/(students.size()-2);
        System.out.println(avescore);
    }
}
