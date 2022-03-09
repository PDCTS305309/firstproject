package com.learn.multithreading;

class VolatileWorker implements Runnable {

    private volatile boolean terminated;

    @Override
    public void run() {
        while (!isTerminated()) {
            System.out.println("Worker class is running.. ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isTerminated() {
        return terminated;
    }

    public void setTerminated(boolean terminated) {
        this.terminated = terminated;
    }
}

public class VolatileDemo {
    public static void main(String[] args) {
        VolatileWorker worker = new VolatileWorker();
        Thread t1 = new Thread(worker);
        t1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        worker.setTerminated(true);
        System.out.println("Algorithm is terminated..");
    }
}
