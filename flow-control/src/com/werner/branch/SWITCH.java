package com.werner.branch;

public class SWITCH {
    public static void main(String[] args) {

        String week = "shit";
        switch (week){
            case "周一":
                System.out.println("1");
                break;
            case "周二":
                System.out.println("2");
                break;
            case "周三":
                System.out.println("3");
                break;
            case "周四":
                System.out.println("4");
                break;
            case "周五":
                System.out.println("5");
                break;
            case "周六":
                System.out.println("6");
                break;
            case "周七":
                System.out.println("7");
                break;
            default:
                System.out.println("something went wrong");
        }
    }
}
