package loop;

public class LoopNested {
    public static void main(String[] args) {
        for(int j=1;j<=3;j++){
            for(int k=0;k<=4;k++){
                System.out.println("我爱你"+j);
            }
            System.out.println("-----------------");
        }
    }
}
