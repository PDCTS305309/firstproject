/**
 * Q10 : Given a list of integers, sort all the values present in it in descending order using Stream functions?
 **/
package com.learn.j8_problemsolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q10_SortListValuesInDescendingOrder {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        List<Integer> list2 = list1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        list2.forEach(i -> System.out.print(i + " "));
    }
}
