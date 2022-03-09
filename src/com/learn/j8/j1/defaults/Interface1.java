package com.learn.j8.j1.defaults;

public interface Interface1 {

    default void methodA() {
        System.out.println("Inside Method A: " + Interface1.class);
    }
}
