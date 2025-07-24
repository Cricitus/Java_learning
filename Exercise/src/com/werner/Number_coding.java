package com.werner;

public class Number_coding {
    public static void main(String[] args) {
        System.out.println("加密后的结果是："+ codes(1983));

    }
    public static String codes(int number){
        int[] a = split(number);

        for(int i = 0; i < a.length; i++){
            a[i] = (a[i] + 5) % 10;
        }

        reverse(a);

        String data = " ";
        for(int i = 0; i < a.length; i++){
            data += a[i];
        }
        return data;
    }
    //取这四位数的各个数字
    public static int[] split(int number){
        int[] numbers = new int[4];
        numbers[0] = number/1000;
        numbers[1] = (number/100)%10;
        numbers[2] = (number/10)%10;
        numbers[3] = number%10;
        return numbers;
    }
    //反转方法
    public static void reverse(int[] numbers){
        for(int i = 0, j = numbers.length-1; i < j; i++, j--){
            int temp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = temp;
        }
    }
}
