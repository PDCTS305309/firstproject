package com.learn.j8.j1.streams_terminals;

import com.learn.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static String joining_1() {
        return StudentDatabase.getAllStudents().stream()
                .map(student -> student.getName())
                .collect(Collectors.joining());
    }

    public static String joining_2() {
        return StudentDatabase.getAllStudents().stream()
                .map(student -> student.getName())
                .collect(Collectors.joining("-"));
    }

    public static String joining_3() {
        return StudentDatabase.getAllStudents().stream()
                .map(student -> student.getName())
                .collect(Collectors.joining("-", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println("joining_1 is:" + joining_1());
        System.out.println("joining_2 is:" + joining_2());
        System.out.println("joining_3 is:" + joining_3());

    }
}
