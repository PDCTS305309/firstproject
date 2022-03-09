package com.learn.j8.j1.defaults;

public interface Interface2 extends Interface1 {

    default void methodB() {
        System.out.println("Inside Method B: " + Interface2.class);
    }

    default void methodA() {
        System.out.println("Inside Method A: " + Interface2.class);
    }
}
