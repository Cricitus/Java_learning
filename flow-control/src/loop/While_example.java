package loop;

public class While_example {
    public static void main(String[] args) {
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        int count = 0;

        while (paperThickness < peakHeight){
            paperThickness = paperThickness * 2;
            count++;
        }
        System.out.println("需要的次数"+count);
        System.out.println(paperThickness);
    }
}
