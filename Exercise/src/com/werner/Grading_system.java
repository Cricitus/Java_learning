package com.werner;

import java.util.Scanner;

public class Grading_system {
    public static void main(String[] args) {
        System.out.println(getAverageScore(5));
    }

    public static double getAverageScore(int number){
        int[] score =  new int[number];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<score.length;i++){
            System.out.println("请你输入第" + (i+1) + "评委的分数: ");
            score[i] = sc.nextInt();
        }

        int sum = 0;
        int max = score[0];
        int min = score[0];
        for(int i=0;i<score.length;i++){
            int socre = score[i];
            sum += socre;
            if(socre>max){
                max = socre;
            }

            if(socre<min){
                min = socre;
            }
        }
        double sum1 = (sum-max-min)/(number - 2);
        return sum1;
    }
}
