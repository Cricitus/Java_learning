package com.werner.staticdemo;

public class Test {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Mark";
        Student student2 = new Student();
        student2.name = "Peter";

        System.out.println(student1.name);

        student1.age = 18;
        System.out.println(student1.age);
        student2.age = 19;
        System.out.println(student2.age);
        System.out.println(Student.number);
    }
}
