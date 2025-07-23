package com.werner.branch;

public class IF {
    public static void main(String[] args) {
        double t = 39.9;
        if (t > 35){
            System.out.println("I am fine");
        }
        double money = 99;
        if (money > 1200){
            System.out.println("rich guy");
        }
        else{
            System.out.println("poor guy");
        }

        int score = 78;
        if (score >=0 && score <60){
            System.out.println("D");
        }
        else if(score >=60 && score < 80){
            System.out.println("C");
        }
        else if (score >=80 && score < 90){
            System.out.println("B");
        }
        else if (score >=90 && score < 100){
            System.out.println("A");
        }
        else{
            System.out.println("工资有问题");
        }
    }
}
