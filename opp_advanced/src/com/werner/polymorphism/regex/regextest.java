package com.werner.polymorphism.regex;

public class regextest {
    public static void main(String[] args) {
        System.out.println(checkQQ(null));
        System.out.println(checkQQ("1234567"));

        System.out.println(checkQQ1("1234567"));
        System.out.println(checkQQ1("1234567S"));
    }


    public static boolean checkQQ1(String qq1) {
        return qq1 != null && qq1.matches("[1-9]\\d{5,19}");
    }

    public static boolean checkQQ(String qq){
        if(qq==null || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20){
            return false;
        }
        for(int i=0;i<qq.length();i++){
            char c = qq.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
}
