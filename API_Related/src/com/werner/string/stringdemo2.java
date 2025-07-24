package com.werner.string;

public class stringdemo2 {
    public static void main(String[] args) {
        String s = "Werner";
        //字符串长度
        s.length();
        System.out.println(s.length());
        //提取字符串
        char c = s.charAt(0);
        System.out.println(c);
        //转换为字符数组
        char[] ch =  s.toCharArray();
        System.out.println(ch[0]);
        //判断字符串内容是否一样
        String s1=  new String("we");
        String s2=  new String("we");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        //忽略大小写的判断
        System.out.println(s1.equalsIgnoreCase(s2));
        //截取字符串的(包前不包后)
        String s3 = new String("JAVA");
        String rs = s3.substring(0,2);
        System.out.println(rs);
        //截取从头到尾
        String rs1 = s3.substring(2);
        System.out.println(rs1);
        //替换某个内容
        String s4 = "你是傻逼";
        String rs2 = s4.replace("傻逼", "**");
        System.out.println(rs2);
        //判断字符串是否有关键字
        System.out.println(s4.contains("傻逼"));
        //判断字符串是否以什么开头
        System.out.println(s4.startsWith("你"));
        //字符串分割
        String rs5 = "王者,人身,傻逼,你爹";
        String[] names = rs5.split(",");
        for (int  i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
