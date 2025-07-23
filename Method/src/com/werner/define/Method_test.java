package com.werner.define;

public class Method_test {
    public static void main(String[] args) {
        int result = add(5);
        System.out.println("1-5的和是" + result);
    }
    public static int add(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
