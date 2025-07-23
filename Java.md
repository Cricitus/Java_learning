# Java

详细请见javaspro的代码演示

## JAVA零散知识点

### **Java开发**

用cmd，编写代码（用记事本改后缀为java）——用javac编译（出来.class文件）——运行代码（java）文件名要为代码class的同名称

<img src="C:\Users\Werner\Pictures\Screenshots\屏幕截图 2025-07-22 155709.png" alt="屏幕截图 2025-07-22 155709" style="zoom:80%;" />

### **JDK的组成**

JVM是java虚拟机，运行java程序 核心类库是java自己的程序 JRE是java运行环境

JVM与核心类库（组成JRE）与开发工具（java、javac）

java一次编译可跨平台使用，不同的操作系统只需安装对应的jvm虚拟机，class文件就可被编译

### **Path环境变量**

为了在cmd里可以随意路径里直接执行exe文件，比如java、javac

位置在：我的电脑->属性->高级系统设置->高级->环境变量

### **进制**

![屏幕截图 2025-07-23 103327](C:\Users\Werner\Pictures\Screenshots\屏幕截图 2025-07-23 103327.png)

java里二进制：0b开头 八进制：0开头 十六进制：0x开头

## API

就是java官方的application programming interface

跟python的库很像

## IDEA-Intellij IDea

### 结构![屏幕截图 2025-07-22 163230](C:\Users\Werner\Pictures\Screenshots\屏幕截图 2025-07-22 163230.png)

java开发: 创建project- >module- >package(最好公司域名倒写)->class

### 变量

声明后才能使用 注意数据类型 注意变量使用范围（比如跳出了{}范围后的变量）变量名不要关键字（都这样） 标识符（class和变量名）不用数字开头不用关键字

### 运算符

加号可做连接符

若是++a就是先加后用 a++是先用后加

运算符优先级：括号>算数（乘除>加减）>逻辑（）>赋值(比如 =、+=....)

## 数据类型

1.数据自动转换，从小范围转换给大范围

byte-> short-> int-> long-> float-> double

2.表达式自动类型转换：

byte, short,char-> int-> long-> float-> double

表达式最终结果由最高类型决定 而表达式中前三类直接转换成int计算

3.强制类型转换

int a = 10;
byte b = (byte) a;

## 流程控制

for循环处理知道循环几次 while处理不知道循环几次，别忘了迭代语句否则死循环

do while 限制性后判断 for和while都是先判断后执行，for的变量是只能在循环使用，而while的在循环外可用

补充：

生成随机数：导入：import java.util.Random;之后使用语句，

```
Random random1 = new Random();
random1.nextInt(10);
int data2= random1.nextInt(10) + 1;
```

用以找1-10的随机数，若找65-91，就是改为nextInt(27)+65

