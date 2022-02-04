package com.bonko.base;

public class Demo02 {
    
//    实例变量 如果不进行初始化，会使用默认值
    String name;
    int age;
//    类变量
    static double salary = 2500;
//    常量 大写
    final double PI = 3.1415;

    public static void main(String[] args) {
//        局部变量
        int i = 10;
        System.out.println(i);

        Demo02 demo02 = new Demo02();
        System.out.println(demo02.age);
        System.out.println(demo02.name);

        System.out.println(Demo02.salary);
        System.out.println(salary);

        System.out.println(demo02.PI);
    }
}
