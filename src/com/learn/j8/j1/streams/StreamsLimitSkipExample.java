package com.learn.j8.j1.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limitSum(List<Integer> numbers, int limit) {
        return numbers.stream()
                .limit(limit)
                .reduce((integer1, integer2) -> integer1 + integer2);
    }

    public static Optional<Integer> skipSum(List<Integer> numbers, int skip) {
        return numbers.stream()
                .skip(skip)
                .reduce((integer1, integer2) -> integer1 + integer2);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6, 7, 8, 9, 10);
        int limit = 2, skip = 3;
        // sum using limit
        Optional<Integer> limitSum = limitSum(numbers, limit);
        if (limitSum.isPresent()) {
            System.out.println("sum of first " + limit + " digits is: " + limitSum.get());
        } else {
            System.out.println("List is empty.");
        }

        // sum using skip
        Optional<Integer> skipSum = skipSum(numbers, skip);
        if (limitSum.isPresent()) {
            System.out.println("sum after skipping first " + skip + " digits is: " + skipSum.get());
        } else {
            System.out.println("List is empty.");
        }
    }
}
