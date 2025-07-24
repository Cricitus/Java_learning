package com.werner.oop.javabean;

public class Test {
    public static void main(String[] args) {
        //实体类
        Student student = new Student();
        student.setName("Joan");
        student.setScore(123.456);
        System.out.println(student.getName());
        System.out.println(student.getScore());
    }
}
