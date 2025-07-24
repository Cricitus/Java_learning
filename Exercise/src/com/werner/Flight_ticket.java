package com.werner;

public class Flight_ticket {
    public static void main(String[] args) {
        double a = calculate(1000,8,"经济舱");
        System.out.println("请输入价钱、机票月份和机票种类" + a);

    }
    public static double calculate(double price, int month, String type){
        if(month>=5 && month<=10){
            switch (type){
                case "头等舱":
                    price = price * 0.9;
                    break;
                case "经济舱":
                    price = price * 0.85;
                    break;
            }
        }
        else{
            switch (type){
                case "头等舱":
                    price = price * 0.7;
                    break;
                case "经济舱":
                    price = price * 0.65;
                    break;
        }
        }
    return price;
    }
}
