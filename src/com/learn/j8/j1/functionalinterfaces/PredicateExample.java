package com.learn.j8.j1.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p = (i) -> {
            return i % 2 == 0;
        };
        System.out.println(p.test(4));

        Predicate<Integer> p1 = (i) -> i % 2 == 0;
        System.out.println(p1.test(4));
    }

}
