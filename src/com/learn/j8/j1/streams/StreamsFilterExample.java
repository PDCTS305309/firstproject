package com.learn.j8.j1.streams;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class StreamsFilterExample {

    static Predicate<Student> p1 = student -> student.getGender().equalsIgnoreCase("Female");
    static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    public static List<Student> filterStudents() {
        return StudentDatabase.getAllStudents().stream()
                .filter(p1).filter(p2).collect(toList());
    }

    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }
}
