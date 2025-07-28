package com.werner.polymorphism.interface_test2;

import com.werner.polymorphism.interface_test.B;

public class Test {
    public static void main(String[] args) {
        Driver s = new A();
        s.drive();
    }
}

class A extends Student implements Driver, Singer{
    @Override
    public void drive() {
    }
    @Override
    public void sing() {
    }
}
class Student { }
interface Driver{
    void drive();
}
interface Singer{
    void sing();
}