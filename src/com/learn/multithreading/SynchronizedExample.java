package com.learn.multithreading;

public class SynchronizedExample {

    private static final Object obj1 = new Object();
    private static final Object obj2 = new Object();
    public static int counter1 = 0;
    public static int counter2 = 0;

    public static void increment1() {
        synchronized (obj1) {
            counter1++;
        }
    }

    public static void increment2() {
        synchronized (obj2) {
            counter2++;
        }
    }

    public static void process() {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                increment1();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                increment2();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counter1: " + counter1);
        System.out.println("Counter2: " + counter2);
    }

    public static void main(String[] args) {
        process();
    }
}
