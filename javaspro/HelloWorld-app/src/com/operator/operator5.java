package com.operator;

public class operator5 {
    public static void main(String[] args) {
        //逻辑运算符
        double size = 9.8;
        int storage = 16;
        boolean rs = size >=6.5 & storage >=8;
        // & 前后都是true才是true
        System.out.println(rs);

        boolean rs1 = size >=6.5 | storage >=8;
        System.out.println(rs1);
        // | 只要有一个条件是true就是true
        System.out.println(size >=6.5 | storage >=8);

        System.out.println(!true);
        System.out.println(!(2>1));
        // ! 取反，如果是真就是false

        System.out.println(true ^ true);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println(false ^ true);
        // ^ 前后条件结果一样就是false，前后条件不一样就是true

        int i= 10;
        int j =20;
        System.out.println(i > 100 && ++j > 99);
        System.out.println(j);
        // && 若前面一个条件已是false，直接输出false

        int m = 10;
        int n = 30;
        System.out.println(m > 3 || ++n > 40);
        System.out.println(n);
        // ||若前面一个条件已是true，直接输出true
    }
}
