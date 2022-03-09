package com.learn.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockWorker {
    private static Lock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();

    public void produce() throws InterruptedException {
        lock.lock();
        System.out.println("Producer method... ");
        condition.await();
        System.out.println("Again the Producer method... ");
        lock.unlock();
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        lock.lock();
        System.out.println("Consumer method... ");
        Thread.sleep(3000);
        condition.signal();
        lock.unlock();
    }
}

public class ProducerConsumerWithLocks {

    public static void main(String[] args) {
        LockWorker lockWorker = new LockWorker();
        Thread t1 = new Thread(() -> {
            try {
                lockWorker.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                lockWorker.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
