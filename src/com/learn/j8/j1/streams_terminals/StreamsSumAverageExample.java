package com.learn.j8.j1.streams_terminals;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAverageExample {

    public static int sumOfNotebooks() {
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNotebooks));
    }

    public static double averageOfNotebooks() {
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNotebooks));
    }

    public static void main(String[] args) {
        System.out.println("Total no of notebooks is: " + sumOfNotebooks());
        System.out.println("Average no of notebooks is: " + averageOfNotebooks());
    }
}
