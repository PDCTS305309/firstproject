package com.learn.multithreading.executers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
    private int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Task with " + id + " is in work - thread is: "
                + Thread.currentThread().getId());
        long duration = (long) Math.random() * 5;
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SingleThreadExecuter {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i <= 10; i++)
            //service.submit(new Task(i));
            executor.execute(new Task(i));
    }
}
