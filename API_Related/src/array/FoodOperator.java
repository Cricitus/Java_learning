package array;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    private ArrayList<Food> foodlists = new ArrayList<>();

    public void addFood() {
        Food food = new Food();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入菜品名称 ");
        String name = sc.next();
        food.setName(name);

        System.out.println("请输入菜品价格 ");
        double price = sc.nextDouble();
        food.setPrice(price);

        System.out.println("请输入菜品简介 ");
        String info = sc.next();
        food.setInfo(info);


        foodlists.add(food);
        System.out.println("上架成功");
    }
    public void showAlldishes(){
        for(int i = 0; i < foodlists.size(); i++){
            System.out.println(foodlists.get(i).getName());
            System.out.println(foodlists.get(i).getPrice());
            System.out.println(foodlists.get(i).getInfo());
            System.out.println("--------------");
        }
    }

    public void start(){
        while (true) {
            System.out.println("请选择功能 ");
            System.out.println("1,上架菜品");
            System.out.println("2，展示菜品");

            Scanner sc = new Scanner(System.in);
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    addFood();
                    break;
                case 2:
                    showAlldishes();
                    break;
                default:
                    System.out.println("你输入的命令不存在 ");
            }
        }
    }
}


