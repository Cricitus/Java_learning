package com.werner.top;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        // 数据类型[] 名称 = {元素1，元素2....}
        // 数据类型[] 名称 = new 数据类型[]{元素1，元素2....}
        int[] ages = new int[]{12,24,35};
        // 数组ages存储的是在内存中的地址信息
        System.out.println(ages);
        // 索引访问数据
        System.out.println(ages[0]);

        //修改数组数据
        ages[0] = 1;
        ages[1] = 29;
        System.out.println(ages[0]);
        System.out.println(ages[1]);

        //数组元素个数
        System.out.println(ages.length);

        //最大索引
        System.out.println(ages.length - 1);
        //只有数组中有数据才行
    }
}
