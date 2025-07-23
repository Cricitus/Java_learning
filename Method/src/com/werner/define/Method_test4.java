package com.werner.define;

public class Method_test4 {
    public static void main(String[] args) {

        int[] arr1 = null;
        int[] arr2 = null;
        int[] arr3 = {1,2,3};
        int[] arr4 = {1,2,3};
        System.out.println(test1(arr1,arr2));
        System.out.println(test1(arr1,arr3));
        System.out.println(test1(arr3,arr4));

    }
    public static boolean test1(int[] arr1, int[] arr2){
        //判断arr1和arr2是否都为空
        if(arr1 == null && arr2 == null){
            return true;
        }
        //判断是否有一个是空
        if(arr1 == null || arr2 == null){
            return false;
        }
        //判断是否长度一样
        if(arr1.length != arr2.length){
            return false;
        }

        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
