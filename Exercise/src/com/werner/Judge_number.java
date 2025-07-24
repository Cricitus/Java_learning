package com.werner;

public class Judge_number {
    public static void main(String[] args) {
        System.out.println("寻找的素数个数有： " + judge(101,200));
    }

    public static int judge(int start, int end){
        int count = 0;
        for(int i = start; i <= end; i++){

            boolean flag = true;

            for(int j = 2; j <= i/2; j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
                count++;
            }
        }
    return count;
    }
}
