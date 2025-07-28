package com.werner.polymorphism.inner_class;

public class inner_class {
    public static void main(String[] args) {
        //Animal s = new Cat();
        //s.eat();
        Animal a = new Animal(){
            public void cry() {
                System.out.println("cry");
            }
        };
        a.cry();
    }
}


/*class Cat extends Animal{
    public void eat(){
        System.out.println("miao");
    }
}*/

abstract class Animal{
    public abstract void cry();
}