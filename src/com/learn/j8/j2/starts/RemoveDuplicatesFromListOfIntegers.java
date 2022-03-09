package com.learn.j8.j2.starts;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromListOfIntegers {

    public static void main(String[] args) {
        //List<Integer> list = Arrays.asList(1,2,100,2,5,100,6,90,20,2,15,16,17,5,100);
        List<Integer> list = List.of(1, 2, 100, 2, 5, 100, 6, 90, 20, 2, 15, 16, 17, 5, 100);

        System.out.println(list);

        List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);
    }


}
