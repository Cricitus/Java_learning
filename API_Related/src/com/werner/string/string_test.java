package com.werner.string;

import java.util.Scanner;

public class string_test {
    public static void main(String[] args) {
        for(int i  = 0; i < 3; i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入名称 ");
            String name = sc.next();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("请输入密码 ");
            String password = sc1.next();

            boolean flag = verify(name, password);
            if (flag) {
                System.out.println("登陆成功");
                break;
            }
            else{
                System.out.println("登陆失败");
            }
        }
    }

    public static boolean verify(String name, String password) {
        String okname = "werner";
        String okpassword = "123456";

        if (name.equals(okname) && password.equals(okpassword)) {
            return true;
        }else{
            return false;
        }
    }
}
