package loop;

public class For {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println("Hello World");
        }
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
