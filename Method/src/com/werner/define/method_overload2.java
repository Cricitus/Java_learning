package com.werner.define;

public class method_overload2 {
    public static void main(String[] args) {
        fire();
        fire("America");
        fire("Russia",999);
    }
    public static void fire(){
        System.out.println("fire on main target");
    }
    public static void fire(String country){
        System.out.println("fire on target " + country);
    }
    public static void fire(String country, int number){
        System.out.println("fire on target " + country + " with " + number + " nuclear bomb");
    }
}
