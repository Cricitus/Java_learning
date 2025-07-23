package Random;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int data = random.nextInt(10);
            System.out.println(data);
        }
        System.out.println("-----------------");
        Random random1 = new Random();
        random1.nextInt(10);
        int data2= random1.nextInt(10) + 1;
        System.out.println(data2);
    }
}
