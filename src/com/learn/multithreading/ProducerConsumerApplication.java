package com.learn.multithreading;

import java.util.ArrayList;
import java.util.List;

class Processor {

    private final Object lock = new Object();
    private final int UPPER_LIMIT = 5;
    private final int LOWER_LIMIT = 0;
    private List<Integer> items = new ArrayList<>();
    private int value = 0;

    public void producer() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                if (items.size() == UPPER_LIMIT) {
                    System.out.println("Waiting for removing items...");
                    lock.wait();
                } else {
                    System.out.println("Adding: " + value);
                    items.add(value);
                    value++;
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public void consumer() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                if (items.size() == LOWER_LIMIT) {
                    System.out.println("Waiting for adding items");
                    value = 0;
                    lock.wait();
                } else {
                    System.out.println("Removing: " + items.remove(items.size() - 1));
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }
}

public class ProducerConsumerApplication {

    public static void main(String[] args) {
        Processor processor = new Processor();
        Thread t1 = new Thread(() -> {
            try {
                processor.producer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                processor.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

    }
}
