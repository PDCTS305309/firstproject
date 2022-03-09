package com.learn.j8.j2.functionalinterfaces;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    private static final List<Student> students = StudentDatabase.getAllStudents();

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    public static void filterStudentsByGradeLevel() {
        System.out.println("filterStudentsByGradeLevel =====================");
        students.forEach(student -> {
            if (p1.test(student))
                System.out.println(student);
        });
    }

    public static void filterStudentsByGPA() {
        System.out.println("filterStudentsByGPA =====================");
        students.forEach(student -> {
            if (p2.test(student))
                System.out.println(student);
        });
    }

    public static void filterStudents() {
        System.out.println("filterStudents =====================");
        students.forEach(student -> {
            if (p1.and(p2).test(student))
                System.out.println(student);
        });
    }

    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        filterStudentsByGPA();
        filterStudents();
    }
}
