package com.learn.j8.j1.streams;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.function.Predicate;

public class StreamMatchExample {

    static Predicate<Student> allMatchFalsePredicate = student -> student.getGpa() >= 3.9;
    static Predicate<Student> allMatchTruePredicate = student -> student.getGpa() >= 3.5;

    static Predicate<Student> anyMatchFalsePredicate = student -> student.getGpa() >= 4.1;
    static Predicate<Student> anyMatchTruePredicate = student -> student.getGpa() >= 4.0;

    static Predicate<Student> noneMatchFalsePredicate = student -> student.getGpa() >= 4.0;
    static Predicate<Student> noneMatchTruePredicate = student -> student.getGpa() >= 4.1;

    public static boolean allMatch() {
        return StudentDatabase.getAllStudents().stream()
                .allMatch(allMatchFalsePredicate);
    }

    public static boolean anyMatch() {
        return StudentDatabase.getAllStudents().stream()
                .anyMatch(anyMatchFalsePredicate);
    }

    public static boolean noneMatch() {
        return StudentDatabase.getAllStudents().stream()
                .noneMatch(noneMatchFalsePredicate);
    }

    public static void main(String[] args) {
        System.out.println("All Match :" + allMatch());
        System.out.println("Any Match :" + anyMatch());
        System.out.println("None Match :" + noneMatch());
    }
}
