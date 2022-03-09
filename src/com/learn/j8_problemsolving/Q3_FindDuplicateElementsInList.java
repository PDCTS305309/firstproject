/**
 * Q3 : How to find duplicate elements in a given integers list in java using Stream functions?
 **/

package com.learn.j8_problemsolving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Q3_FindDuplicateElementsInList {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 3, 5, 4, 2, 10, 15, 2, 1, 9);

        Set<Integer> set1 = new HashSet<>();
        List<Integer> list2 = list1.stream()
                .filter(i -> !set1.add(i))
                .collect(Collectors.toList());
        list2.forEach(i -> System.out.print(i + " "));
    }
}
