package com.learn.j8.j1.streams;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {
        List<String> studentActivities = StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        return studentActivities;
    }

    public static long getStudentActivitiesCount() {
        long count = StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        return count;
    }

    public static void main(String[] args) {
        System.out.println("total no of different student activities are:" + getStudentActivitiesCount());
        System.out.println("printStudentActivities" + printStudentActivities());
    }
}
