package com.learn.j8.j2.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p1 = (num) -> num % 2 == 0;
    static Predicate<Integer> p2 = (num) -> num % 5 == 0;

    public static void predicateAnd() {
        System.out.println("Predicate AND: " + p1.and(p2).test(10));
        System.out.println("Predicate AND: " + p1.and(p2).test(8));
    }

    public static void predicateOr() {
        System.out.println("Predicate OR: " + p1.or(p2).test(10));
        System.out.println("Predicate OR: " + p1.or(p2).test(8));
    }

    public static void predicateNegate() {
        System.out.println("Predicate NEGATE: " + p1.negate().test(10));
    }

    public static void main(String[] args) {
        Predicate<Integer> integerPredicate = (num) -> {
            return num % 2 == 0;
        };
        System.out.println(integerPredicate.test(15));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
