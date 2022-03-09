package com.learn.j8.j2.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> binaryOperator1 = (a, b) -> a * b;
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    static BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
    static BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);

    public static void main(String[] args) {
        System.out.println(binaryOperator1.apply(10, 15));

        System.out.println("Result of maxBy is :" + maxBy.apply(10, 15));
        System.out.println("Result of minBy is :" + minBy.apply(10, 15));
    }
}
