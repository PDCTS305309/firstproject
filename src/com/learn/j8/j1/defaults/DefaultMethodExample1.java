package com.learn.j8.j1.defaults;

import java.util.*;

public class DefaultMethodExample1 {

    public static void main(String[] args) {
        /**
         * sort the list names based on alphabetical order.
         * */
        List<String> list1 = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");

        /**
         * prior java8.
         * */
        List<String> stringList1 = new ArrayList<>(list1);
        Collections.sort(stringList1);
        System.out.println("sorted list using collections.sort: " + stringList1);

        /***
         * Java8
         */
        List<String> stringList2 = new ArrayList<>(list1);
        stringList2.sort(Comparator.naturalOrder());
        System.out.println("sorted list using list.sort: " + stringList2);
    }
}
