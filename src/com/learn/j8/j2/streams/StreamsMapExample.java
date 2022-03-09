package com.learn.j8.j2.streams;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static void main(String[] args) {

        List<String> nameList = StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        Set<String> nameSet = StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println("List: " + nameList);
        System.out.println("Set: " + nameSet);
    }
}
