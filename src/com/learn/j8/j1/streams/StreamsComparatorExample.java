package com.learn.j8.j1.streams;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName() {
        return StudentDatabase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    public static List<Student> sortStudentsByGpa() {
        return StudentDatabase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("Student sorted by name:");
        sortStudentsByName().forEach(System.out::println);

        System.out.println("Student sorted by gps:");
        sortStudentsByGpa().forEach(System.out::println);
    }
}
