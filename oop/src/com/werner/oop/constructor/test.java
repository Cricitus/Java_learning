package com.werner.oop.constructor;

public class test {
    public static void main(String[] args) {
        Student s1 =  new Student();
        Student s2 =  new Student("Joan", 99);
        System.out.println(s2.name);
    }
}
