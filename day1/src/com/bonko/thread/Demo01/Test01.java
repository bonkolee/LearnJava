package com.bonko.thread.Demo01;

class TestThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("TestThread" + i);
        }
    }
}

public class Test01 {
    public static void main(String[] args) {
//      start 同时执行
//      run 顺序执行
        TestThread1 testThread1 = new TestThread1();
        testThread1.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main " + i);
        }
    }
}
