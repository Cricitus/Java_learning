package com.werner;

import java.util.Random;
import java.util.Scanner;

public class Hongbao {
    public static void main(String[] args) {
        int[] money = {9, 666, 188, 520, 99999};
        start(money);
    }
    public static void start(int[] moneys){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        for(int i = 0; i < moneys.length; i++){
            System.out.println("请你输入内容抽奖：");
            sc.next();//等待输入内容再向下进行

            while(true){
                int index = rand.nextInt(moneys.length);
                int money = moneys[index];

                if(money != 0){
                    System.out.println("你已经抽中红包" + money);
                    moneys[index] = 0;
                    break;
                }
            }
        }
    System.out.println("活动结束了");
    }
}
