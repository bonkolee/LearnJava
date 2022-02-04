package com.bonko.control;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        以回车为结束符
        System.out.println("使用nextLine");
        String str = null;
        if (scanner.hasNextLine()) {
            str = scanner.nextLine();
        }
        System.out.println(str);

        scanner.close();
    }
}
