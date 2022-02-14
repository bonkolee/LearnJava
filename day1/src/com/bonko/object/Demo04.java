package com.bonko.object;

class B {
//    不会重写 静态方法
    public static void test() {
        System.out.println("B => test()");
    }
}

class A extends B {
    public static void test() {
        System.out.println("A => test()");
    }

}


public class Demo04 {
    public static void main(String[] args) {
        A a = new A();
        a.test();
        B b = new A();
        b.test();
//        A => test()
//        B => test()

//        报错
//        A c = (A) new B();
    }
}