package com;

public class ASCII {
    public static void main(String[] args) {
        // 字符在ASCII里存储实例
        System.out.println("a" + 1); //字符串不行
        System.out.println('a' + 2); //字符行 97 + 2
        System.out.println('A' + 3); // 65 + 3

        int a=0b011000001;
        System.out.println(a);//二进制
        int b=0141;
        System.out.println(b);//八进制
        int c=0xFA;
        System.out.println(c);//十六进制
    }
}
