package com.werner.polymorphism.abstruct_template;

public class Test {
    public static void main(String[] args) {
        People s1 = new Teacher();
        People s2 = new Student();

        s1.write();
        s2.write();
    }
}
