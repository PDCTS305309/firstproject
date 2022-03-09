package com.learn.j8.j1.streams;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.Optional;

public class StreamFindAnyFirstExample {

    public static Optional<Student> findFirstStudent() {
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.5)
                .findFirst();
    }

    public static Optional<Student> findAnyStudent() {
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.5)
                .findAny();
    }

    public static void main(String[] args) {
        Optional<Student> findFirstOptional = findFirstStudent();
        if (findFirstOptional.isPresent()) {
            System.out.println("Found the Student: " + findFirstOptional.get());
        } else {
            System.out.println("List is Empty !!");
        }

        Optional<Student> findAnyOptional = findAnyStudent();
        if (findAnyOptional.isPresent()) {
            System.out.println("Found the Student: " + findAnyOptional.get());
        } else {
            System.out.println("List is Empty !!");
        }
    }
}
