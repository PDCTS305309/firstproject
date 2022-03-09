package com.learn.j8.j1.concepts;

// Java code to explain double check locking
public class ThreadSafeSingletonClassExample {

    // private instance, so that it can be accessed by only by getInstance() method
    private static ThreadSafeSingletonClassExample instance;

    private ThreadSafeSingletonClassExample() {
        // private constructor
    }

    public static ThreadSafeSingletonClassExample getInstance() {
        if (instance == null) {
            //synchronized block to remove overhead
            synchronized (ThreadSafeSingletonClassExample.class) {
                if (instance == null) {
                    // if instance is null, initialize
                    instance = new ThreadSafeSingletonClassExample();
                }

            }
        }
        return instance;
    }
}
