package com.variable;

public class Variable3 {
    public static void main(String[] args) {
        // 自动类型转换 类型范围小转化给类型范围大的
        byte a = 12;
        int b = a;
        System.out.println(b);

        int c =100;
        double d = c;
        System.out.println(d);

        char e = 'a';
        int f = e;
        System.out.println(f);
    }
}
