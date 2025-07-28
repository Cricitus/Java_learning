package com.werner.polymorphism;

public class Test {
    public static void main(String[] args) {
        People p1 = new Student();

        if(p1 instanceof Student){
            Student s1 = (Student)p1;
        }else{
            Teacher t1 = (Teacher)p1;
        }
    }
}
