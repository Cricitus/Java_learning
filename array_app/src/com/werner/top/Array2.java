package com.werner.top;

public class Array2 {
    public static void main(String[] args) {
        int ages[] = {12,24,36};
        int sum = 0;
        //数组遍历
        for(int i=0;i<ages.length;i++){
            System.out.println(ages[i]);
            sum += ages[i];
        }
        System.out.println(sum);
    }
}
