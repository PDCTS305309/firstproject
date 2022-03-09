package com.learn.j8.j1.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Adam", "Dan", "Julie");
        stringStream.forEach(s -> System.out.println(s));

        Stream.iterate(1, x -> x * 2)
                .limit(10)
                .forEach(System.out::println);

        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(5)
                .forEach(System.out::println);
    }
}
