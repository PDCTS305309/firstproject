package com.learn.j8.j1.streams_terminals;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningByExample {

    public static void partitioning_by1() {
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean, List<Student>> listMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate));
        System.out.println(listMap);
    }

    public static void partitioning_by2() {
        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;

        Map<Boolean, Set<Student>> listMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate, toSet()));
        System.out.println(listMap);
    }

    public static void main(String[] args) {
        partitioning_by2();
    }
}
