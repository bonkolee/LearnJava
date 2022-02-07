package com.bonko.function;

public class Demo01 {
    public static int add(int x, int y) {
        return x + y;
    }

    public static double add(double x, double y, double z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 1));
        System.out.println(add(1, 1, 1));
    }
}
