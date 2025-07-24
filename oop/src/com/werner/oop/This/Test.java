package com.werner.oop.This;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        s1.prinThis();

        Student s2 = new Student();
        System.out.println(s2);
        s2.prinThis();

        Student s3 = new Student();
        s3.score = 325;
        s3.prinPass(250);
    }
}
