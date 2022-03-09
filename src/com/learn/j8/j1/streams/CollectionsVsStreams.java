package com.learn.j8.j1.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStreams {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Jenny");

        for (String name : names) {
            System.out.println(name);
        }

        for (String name : names) {
            System.out.println(name);
        }
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        //nameStream.forEach(System.out:: println);

        names.remove(0);
        System.out.println(names);

    }
}
