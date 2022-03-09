package com.learn.j8.j2.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = String::toUpperCase;
    static Function<String, String> addSomeString = (str) -> str.concat("Default");

    public static void main(String[] args) {
        System.out.println("Result is: " + function.apply("Java"));
        System.out.println("Result is: " + function.andThen(addSomeString).apply("java"));
        System.out.println("Result is: " + function.compose(addSomeString).apply("java"));
    }
}
