package com.bonko.array;

import java.util.Arrays;

public class Demo02 {
    public static int[] reverse(int[] temp) {
        int[] result = new int[temp.length];
        for (int i = 0, j = temp.length - 1; i < temp.length; i++, j--) {
            result[j] = temp[i];
        }
        return result;
    }

    public static void reverseItself(int[] temp) {
        int[] result = new int[temp.length];
        for (int i = 0, j = temp.length - 1; i < temp.length; i++, j--) {
            result[j] = temp[i];
        }
        System.arraycopy(result, 0, temp, 0, temp.length);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        a = reverse(a);
        System.out.println(Arrays.toString(a));
        reverseItself(a);
        System.out.println(Arrays.toString(a));
    }
}
