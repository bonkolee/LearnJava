package com.bonko.function;

import java.util.Arrays;

public class Demo03 {
    public static int add(int ...x) {
        return Arrays.stream(x).sum();
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 4, 5, 6));
        System.out.println(add(1));
        System.out.println(add());
        System.out.println(add(new int[]{1, 2, 3, 4}));
    }
}
