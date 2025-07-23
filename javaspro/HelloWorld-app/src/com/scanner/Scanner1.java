package com.scanner;

import java.util.Scanner;

//简单的读取键盘输入信息和输出信息-scanf最简单的一集
public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("请输入名字");
        String name = sc.next();
        System.out.println(name);
    }
}
