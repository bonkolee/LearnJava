package com.bonko.control;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        next 不能得到带有空格的字符串
        System.out.println("使用next");
        String str = null;
        if (scanner.hasNext()) {
            str = scanner.next();
        }
        System.out.println(str);
        scanner.close();
    }
}
