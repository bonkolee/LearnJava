package com.bonko.control;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        int count = 0;
        while (scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
            count++;
        }
        if (count != 0) {
            System.out.println("Average: " + sum / count);
        }
        scanner.close();
    }
}
