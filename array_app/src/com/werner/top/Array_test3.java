package com.werner.top;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//将输入的数组随机打乱排列并输出
public class Array_test3 {
    public static void main(String[] args) {
        int []arr = new int [5];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <= arr.length-1; i++) {
            System.out.print("请你输入第"+ (i+1) +"工号");
            int code = sc.nextInt();
            arr[i] = code;
        }

        Random rand = new Random();
        for(int i = 0; i <= arr.length-1; i++) {
            int index = rand.nextInt(arr.length);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        for(int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
