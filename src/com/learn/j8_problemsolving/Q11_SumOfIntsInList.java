/**
 * https://www.softwaretestinghelp.com/java-8-interview-questions/
 * Write a Java 8 program to get the sum of all numbers present in a list?
 **/
package com.learn.j8_problemsolving;

import java.util.Arrays;
import java.util.List;

public class Q11_SumOfIntsInList {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        //list1.stream().mapToInt(value -> value).collect()
        int sum = list1.stream().mapToInt(value -> value).sum();
        System.out.println("Sum is: " + sum);
    }
}
