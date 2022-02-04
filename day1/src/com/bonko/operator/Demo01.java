package com.bonko.operator;
//javadoc -encoding UTF-8 -charset UTF-8 -d doc -subpackages com.bonko.control.operator

/**
 * @author Bonko
 * @version 1.0
 * @since 1.8
 */

public class Demo01 {

    /**
     * xxxix
     * @param o xxxx
     * @return xxxx
     */
    public static String getType(Object o) {
        return o.getClass().toString();
    }

    /**
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        long a = 123123123123123L;
        int b = 123;
        short c = 10;
        byte d = 8;

        System.out.println(a + b + c + d + getType(a + b + c + d));
        System.out.println(b + c + d + getType(b + c + d));
        System.out.println(c + d + getType(c + d));

        System.out.println(Math.pow(2, 3));
    }
}
