package com.werner.string;

public class stringdemo1 {
    public static void main(String[] args) {
        String name = "ithema";

        String sr = new String();
        System.out.println(sr);

        String sr1 = new String("GGbond");
        System.out.println(sr1);

        char[] chars ={'a','王', 'b'};
        String sr2 = new String(chars);
        System.out.println(sr2);

        byte[] bytes = {97, 98, 99};
        String sr3 = new String(bytes);
        System.out.println(sr3);
    }
}
