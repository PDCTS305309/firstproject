package com.learn.j8.j1.streams;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsMapExample {

    public static List<String> getNamesList() {
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toList());
    }

    public static Set<String> getNamesSet() {
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toSet());
    }

    public static void main(String[] args) {
        System.out.println(getNamesList());
        System.out.println(getNamesSet());
    }
}
