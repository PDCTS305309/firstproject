package com.learn.j8.j1.optional;

import java.util.Optional;

public class OptionalOfEmptyOfNullableExample {

    public static Optional<String> ofNullable() {
        Optional<String> stringOptional = Optional.ofNullable(null);
        return stringOptional;
    }

    public static Optional<String> of() {
        Optional<String> stringOptional = Optional.of("Hello");
        return stringOptional;
    }

    public static void main(String[] args) {
        System.out.println("ofNullable: " + ofNullable().isPresent());
        System.out.println("of: " + of().isPresent());
    }
}
