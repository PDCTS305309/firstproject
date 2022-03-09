package com.probs;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageOfEvenNosInArray {

    static int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {

        //4+16+36+64+10 = 220/5 = 44.0
        OptionalDouble average = IntStream.of(arr).filter(value -> value % 2 == 0)
                .map(x -> x * x).average();

        System.out.println(average.getAsDouble());
    }

}
