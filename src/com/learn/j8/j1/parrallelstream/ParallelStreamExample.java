package com.learn.j8.j1.parrallelstream;

import java.util.function.Supplier;
import java.util.stream.LongStream;

public class ParallelStreamExample {

    public static long sumSequentialStream() {
        long sum = LongStream.rangeClosed(1, 1000000000).sum();
        return sum;
    }

    public static long sumParallelStream() {
        long sum = LongStream.rangeClosed(1, 1000000000).parallel().sum();
        return sum;
    }

    public static long checkPerformance1(Supplier<Long> supplier, int noOfTimes) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < noOfTimes; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    public static void checkPerformance2(int noOfTimes) {
        long startTime1 = System.currentTimeMillis();
        long result1 = sumSequentialStream();
        long endTime1 = System.currentTimeMillis();
        System.out.println("Result1: " + result1 + ", time taken: " + (endTime1 - startTime1));

        long startTime2 = System.currentTimeMillis();
        long result2 = sumParallelStream();
        long endTime2 = System.currentTimeMillis();
        System.out.println("Result2: " + result2 + ", time taken: " + (endTime2 - startTime2));
    }

    public static void main(String[] args) {
        System.out.println("Available Processors:" + Runtime.getRuntime().availableProcessors());

        System.out.println("Sequential Stream Result: " + checkPerformance1(ParallelStreamExample::sumSequentialStream, 20));
        System.out.println("Parallel Stream Result: " + checkPerformance1(ParallelStreamExample::sumParallelStream, 20));
    }
}
