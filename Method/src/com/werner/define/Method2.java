package com.werner.define;

public class Method2 {
    public static void main(String[] args) {
        method1(3);
        System.out.println("------------");
        method1(4);
    }
    public static int method1(int n){
        for(int i=0;i<n;i++){
            System.out.println("Hello World");
        }
        return 0;
    }
    public static void method2(){
        for(int i=0;i<3;i++){
            System.out.println("Hello World");
        }
    }
}