package com.learn.j8.j2;

import java.util.function.Function;
import java.util.stream.IntStream;

class Functions {

    public void append(Function<String, String> function) {
        System.out.println(function.apply("Hello"));
    }
}

public class Main {

    public static void main(String[] args) {

        Functions fun = new Functions();
        fun.append(getFormedFunction());

        //perform summation of 1-100 numbers
        int sum = IntStream.rangeClosed(0, 100)
                .parallel()
                .sum();
        // IntStream.rangeClosed(0,100).filter(value -> {value%})
        System.out.println(sum);
    }

    public static Function<String, String> getFormedFunction() {
        Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("_DEFAULT");
        return addSomeString;
    }
}
