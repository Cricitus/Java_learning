package Random;

import java.util.Random;
import java.util.Scanner;

public class Random_Example {
    public static void main(String[] args) {
        Random random = new Random();
        int LuckyNumber = random.nextInt(100)+1;

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("输入猜测的数字");
            int guessNumber = sc.nextInt();

            if (guessNumber == LuckyNumber){
                System.out.println("你猜对了");
                break;
            }
            else if(guessNumber > LuckyNumber){
                System.out.println("猜大了");
            }
            else{
                System.out.println("猜小了");
            }
        }
    }
}
