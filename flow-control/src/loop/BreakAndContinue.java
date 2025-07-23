package loop;

public class BreakAndContinue {
    public static void main(String[] args) {
        //break 跳出并结束当前循环
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 3) {
                break;
            }
        }
        //continue 结束当前循环本次执行，直接进入下次执行
        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                continue;
            }
            System.out.println("xihuan" + i);
        }
    }
}
