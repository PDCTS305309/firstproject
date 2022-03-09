package com.learn.j8.j1.streams_terminals;

import com.learn.data.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class StreamsMappingExample {

    public static void main(String[] args) {

        List<String> studentNames = StudentDatabase.getAllStudents()
                .stream()
                .collect(mapping(student -> student.getName(), toList()));
        System.out.println(studentNames);
    }
}
