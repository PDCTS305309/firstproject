package com.learn.j8.j1.parrallelstream;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequential: " + (endTime - startTime));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDatabase.getAllStudents().parallelStream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in parallel: " + (endTime - startTime));
        return studentActivities;
    }

    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();

    }

}
