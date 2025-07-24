package com.werner;

public class Copying_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] arr2 = copy(arr);
        printArray(arr2);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(i == arr.length-1 ? arr[i] : arr[i]+",");
        }
        System.out.println("]");
    }

    public static int[] copy(int[] arr){
        int[] arr2 =  new int[arr.length];
        //需要注意的是，arr2的长度等于或大于arr1时才会生效
        System.arraycopy(arr,0,arr2,0,arr.length);
        return arr2;
    }
}
