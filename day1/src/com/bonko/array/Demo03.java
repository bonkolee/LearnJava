package com.bonko.array;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 3, 2, 1};
        System.out.println(Arrays.stream(a).max());
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Arrays.fill(a, 2, 4,10);
        System.out.println(Arrays.toString(a));
    }
}
