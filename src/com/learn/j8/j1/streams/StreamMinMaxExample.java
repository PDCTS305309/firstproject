package com.learn.j8.j1.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static Optional<Integer> findMaxValue(List<Integer> numbers) {
        return numbers.stream()
                .reduce(Integer::max);
    }

    public static Optional<Integer> findMinValue(List<Integer> numbers) {
        return numbers.stream()
                .reduce(Integer::min);
    }

    public static void main(String[] args) {
        //List<Integer>  numbers = Arrays.asList(1,8,7,5,6);
        List<Integer> numbers = new ArrayList<>();

        Optional<Integer> maxValue = findMaxValue(numbers);
        System.out.println("max optional is: " + maxValue);
        if (maxValue.isPresent())
            System.out.println("Max value is :" + maxValue.get());
        else
            System.out.println("Input list is Empty.");

        Optional<Integer> minValue = findMinValue(numbers);
        System.out.println("min optional is: " + minValue);
        if (minValue.isPresent())
            System.out.println("Min value is :" + minValue.get());
        else
            System.out.println("Input list is Empty.");
    }
}
