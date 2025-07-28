package com.werner.polymorphism.interface_demo;

import java.util.ArrayList;

public class ClassManage {
    private ArrayList<Student> students =  new ArrayList<>();
    private StudentOperator studentOperator = new StudentOperator2() {};

    public ClassManage() {
        students.add(new  Student("joan",'男',99 ));
        students.add(new  Student("mary",'女',68 ));
        students.add(new  Student("john",'男',94));
        students.add(new  Student("kerry",'男',39 ));
    }

    public void printInfo(){
        studentOperator.printInfo(students);
    }

    public void printScore(){
        studentOperator.printAveScore(students);
    }
}
