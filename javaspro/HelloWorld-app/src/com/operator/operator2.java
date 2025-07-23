package com.operator;

public class operator2 {
    public static void main(String[] args) {
        // 自增自减符号
        int a =1;
        a++;//2
        ++a;//3
        System.out.println(a);

        a--;//2
        --a;//1
        System.out.println(a);

        int b = 10;
        int c = 10;
        int rs = ++b;
        System.out.println(rs);
        int rs1=c++;
        System.out.println(rs1);
    }
}
