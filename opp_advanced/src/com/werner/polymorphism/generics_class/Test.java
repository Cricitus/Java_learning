package com.werner.polymorphism.generics_class;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        String ele =  list.get(0);
        System.out.println(ele);
    }
}
