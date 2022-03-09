package com.learn.j8.j2.streams;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctExample {

    public static List<String> printDistinctStudentActivities() {

        List<String> studentActivities = StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static List<String> printDistinctSortedStudentActivities() {

        List<String> studentActivities = StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static long getDistinctStudentActivitiesCount() {

        long count = StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct().count();
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Distinct activities are: " + printDistinctStudentActivities());
        System.out.println("Distinct Sorted activities are: " + printDistinctSortedStudentActivities());
        System.out.println("Total no of distinct activities are : " + getDistinctStudentActivitiesCount());
    }
}
