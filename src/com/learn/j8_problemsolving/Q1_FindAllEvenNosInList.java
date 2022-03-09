package com.learn.j8_problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1_FindAllEvenNosInList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 6, 7, 8, 98, 45, 78, 95, 62, 14, 65, 7);

        List<Integer> list1 = list.stream().filter(i -> i % 2 == 0).distinct().collect(Collectors.toList());
        list1.forEach(i -> System.out.println(i));
    }
}
