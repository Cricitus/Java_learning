package com.werner.top;

import java.util.Arrays;

public class Array_test2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        // 反转队列数值，需要临时变量存储后一位数据
        for(int i = 0, j = arr.length-1; i<j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
