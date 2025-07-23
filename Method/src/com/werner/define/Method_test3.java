package com.werner.define;

import java.util.Scanner;

public class Method_test3 {
    public static void main(String[] args) {
        int[] arr2 = {10,20,30,40,50};
        int[] arr3 = null;
        array(arr2);
        array(arr3);
    }
    public static void array(int[] arr){
        if (arr == null){
            System.out.println(arr);
            return;
        }
        System.out.println("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1) {
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i]+" , ");
            }
        }
        System.out.println("]");
    }
}
