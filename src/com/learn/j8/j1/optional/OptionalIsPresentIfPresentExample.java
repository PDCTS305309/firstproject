package com.learn.j8.j1.optional;

import java.util.Optional;

public class OptionalIsPresentIfPresentExample {

    //isPresent
    public static void isPresent() {
        //Optional<String> stringOptional = Optional.ofNullable("Hello World");
        Optional<String> stringOptional = Optional.ofNullable(null);
        System.out.println(stringOptional.isPresent());
        if (stringOptional.isPresent()) {
            System.out.println(stringOptional.get());
        } else {
            System.out.println("no data");
        }
    }

    //ifPresent
    public static void ifPresent() {
        Optional<String> stringOptional = Optional.ofNullable("Hello World");
        //Optional<String> stringOptional = Optional.ofNullable(null);
        stringOptional.ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        ifPresent();
    }
}
