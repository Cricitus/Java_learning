package com.werner.oop;

public class Test {
    public static void main(String[] args) {
        //面向对象编程
        //创建学生对象，封装波妞数据
        Student s1 = new Student();
        s1.name = "波妞";
        s1.chinese = 100;
        s1.math = 100;
        s1.printTotalScore();
        //创建学生对象，封装波仔数据
        Student s2 = new Student();
        s2.name= "波仔";
        s2.chinese = 59;
        s2.math = 100;
        s2.printTotalScore();
    }
}
