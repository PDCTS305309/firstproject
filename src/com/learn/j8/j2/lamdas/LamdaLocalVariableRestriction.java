package com.learn.j8.j2.lamdas;

import java.util.function.Consumer;

public class LamdaLocalVariableRestriction {

    public static void main(String[] args) {
        int i = 0;
        //can not use i here as it is already defined
        //Consumer<Integer> c1 = (i) -> System.out.println(i);

        int value = 4;
        Consumer<Integer> c1 = (j) -> {
            //can't modify the value of local variable
            //value =5;
            System.out.println(value + j);
        };
        c1.accept(20);
    }
}
