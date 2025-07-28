package com.werner.staticdemo;

public class Student {
    //类变量，就是基于Student
    static String name;
    //成员变量
    int age;

    public static int number;
    public Student() {
        number++;
    }
}
