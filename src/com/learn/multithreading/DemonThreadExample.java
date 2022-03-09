package com.learn.multithreading;

class DemonWorker implements Runnable {

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Demaon Thread is running");
        }
    }
}

class NormalWorker implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Normal Thread finishes the execution");
    }
}

public class DemonThreadExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(new DemonWorker());
        Thread t2 = new Thread(new NormalWorker());

        t1.setDaemon(true);

        t1.start();
        t2.start();
    }
}
