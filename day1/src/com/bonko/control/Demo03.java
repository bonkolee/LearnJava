package com.bonko.control;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        float f = 0.0f;
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
        } else if (scanner.hasNextFloat()) {
            f = scanner.nextFloat();
        }
        System.out.println("Output:" + i + ", " + f);

        scanner.close();
    }
}
