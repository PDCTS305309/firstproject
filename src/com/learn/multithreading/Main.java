package com.learn.multithreading;

class Runner1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

class Runner2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        //timeslicing processing
        Thread runner1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                }
            }
        });
        Thread runner2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        });

        runner1.start();
        runner2.start();

        try {
            runner1.join();
            runner2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finished with threads... ");
    }
}
