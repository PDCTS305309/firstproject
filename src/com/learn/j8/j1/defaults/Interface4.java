package com.learn.j8.j1.defaults;

public interface Interface4 {

    default void methodA() {
        System.out.println("Inside Method A: " + Interface4.class);
    }
}
