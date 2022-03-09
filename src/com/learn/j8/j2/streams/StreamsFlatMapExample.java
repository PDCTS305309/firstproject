package com.learn.j8.j2.streams;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {

        List<String> studentActivities = StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());

    }
}
