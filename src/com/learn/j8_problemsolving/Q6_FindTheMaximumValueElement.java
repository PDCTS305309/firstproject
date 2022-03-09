/***
 * Q6 : Given a list of integers, find the maximum value element present in it using Stream functions?
 * **/
package com.learn.j8_problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Q6_FindTheMaximumValueElement {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 98, 45, 78, 95, 62, 14, 65, 7};
        //using intStream
        IntStream.of(arr).max().ifPresent(System.out::println);

        //using list.stream
        List<Integer> list1 = Arrays.asList(5, 6, 7, 8, 98, 45, 78, 95, 62, 14, 65, 7);
        list1.stream().max(Integer::compare).ifPresent(System.out::println);


    }
}
