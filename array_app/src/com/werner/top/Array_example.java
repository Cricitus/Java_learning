package com.werner.top;

import java.util.Scanner;

public class Array_example {
    public static void main(String[] args) {
        double[] scores = new double[6];

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < scores.length; i++) {
            System.out.println("请你输入第" + i +"的分数：");
            double score = sc.nextDouble();
            scores[i] = score;
        }

        double sum = 0;
        for (int i = 1; i < scores.length; i++) {
            sum += scores[i];
        }
        double ave = sum/scores.length;
        System.out.println(sum);
        System.out.println(ave);
    }
}
