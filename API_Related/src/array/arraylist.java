package array;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        //创建Arraylist的集合对象
        ArrayList list = new ArrayList();
        ArrayList<String> list2 = new ArrayList<String>();

        list.add("Abd");
        list.add("werner");
        list.add("hfasdf");
        System.out.println(list);

        //指定位置加数组
        list.add(1,"fuck");
        System.out.println(list);

        //索引获得值
        list.get(1);

        //数组元素个数
        list.size();

        //删除指定位置元素并返回
        System.out.println(list.remove(2));

        //修改数据
        list.set(0, "黑马");
        System.out.println(list);
    }
}
