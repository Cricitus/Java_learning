package com.werner.top;

public class Array_test {
    public static void main(String[] args) {
        int[] arr= {15,9000,10000,20000,9500,-5};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
