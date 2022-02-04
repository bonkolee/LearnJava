package com.bonko.base;

public class Demo01 {
    public static void main(String[] args) {
        int i = 10;
        int i2 = 010;
        int i3 = 0x10;
        System.out.println(i + " " + i2 + " " + i3);

        char c = '\u0961';
        System.out.println(c);

//        低 -------------------------------------------> 高
//        byte,short,char -> int -> long -> float -> double
        int a = 128;
        byte b = (byte) a;
        System.out.println(b);
        /*
        布尔值不能进行转换
        高转低需要强制转换，低转高不需要
         */
        double d = 1e2;
        System.out.println(d);
    }
}
