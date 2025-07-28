package com.werner.staticdemo.visis;

public class Z extends F {
    String name = "子类名称";

    public void showName() {
        String name = "局部名称";
        System.out.println(name);
        System.out.println(this.name);
        System.out.print(super.name);
    }
}
