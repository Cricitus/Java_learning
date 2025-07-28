package com.werner.polymorphism.abstruct_template;

public abstract class People {
    public final void write(){
        System.out.println("\t\t\t\t《我的爸爸》");
        System.out.print(writeMain());
        System.out.print("我的爸爸好");
    }

    public abstract String writeMain();
}
