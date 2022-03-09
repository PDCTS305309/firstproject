package com.learn.j8.j1.streams;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        //print student name and activities in a map
        //students with grade level greater or equal to 3.
        Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
        Predicate<Student> studentGpaPredicate = student -> student.getGpa() >= 3.9;

        Map<String, List<String>> studentAStringListMap = StudentDatabase.getAllStudents().stream()
                .peek(student -> System.out.println(student))
                .filter(studentPredicate)
                .peek(student -> System.out.println("filter1: " + student))
                .filter(studentGpaPredicate)
                .peek(student -> System.out.println("filter2: " + student))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentAStringListMap);
    }
}
