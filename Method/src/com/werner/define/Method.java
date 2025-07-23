package com.werner.define;

public class Method {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int rs = sum(a, b);
        System.out.println("和是" + rs );
    }
    // Method 方法 其实就是 Python里的函数，定义了之后可以用
    public static int sum(int a, int b){
        return a+b;
    }
}
