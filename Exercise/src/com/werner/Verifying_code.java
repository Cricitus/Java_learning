package com.werner;

import java.util.Random;

public class Verifying_code {
    public static void main(String[] args) {

        String code1 = codes(5);
        System.out.println(code1);
    }
    public static String codes(int n)
    {
        Random rand = new Random();

        String s="";
        for (int i = 1; i <= n; i++) {
            int type=rand.nextInt(3);
            switch (type){
                case 0:
                    s += rand.nextInt(10);
                    break;
                case 1:
                    char c = (char) (rand.nextInt(26)+65);
                    s += c;
                    break;
                case 2:
                    char c1 = (char) (rand.nextInt(26)+97);
                    s += c1;
                    break;
            }
        }
        return s;
    }
}
