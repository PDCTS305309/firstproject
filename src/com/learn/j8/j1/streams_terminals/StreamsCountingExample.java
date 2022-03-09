package com.learn.j8.j1.streams_terminals;

import com.learn.data.StudentDatabase;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {

    public static long count() {
        return StudentDatabase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .collect(counting());
    }

    public static void main(String[] args) {
        System.out.println("Count is: " + count());
    }
}
