package com.bonko.array;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {

        //        静态初始化
        int[] b = {1, 2, 3, 4};
        System.out.println(Arrays.toString(b));

        int[] a;
//        int b[]; // 不推荐

//        默认值为0
        a = new int[5];
        System.out.println(Arrays.toString(a));
        a = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(a));

        int[][] c;
        c = new int[3][];
        c[1] = new int[3];
        System.out.println(Arrays.deepToString(c));

//        c[0][1] = 0;
//        c[1][9] = 0;
        c = new int[3][4];
        System.out.println(Arrays.deepToString(c));
        c = new int[][]{{1,2}, {3}};

        System.out.println(Arrays.deepToString(c));
        System.out.println(Arrays.toString(c[0]));
    }
}
