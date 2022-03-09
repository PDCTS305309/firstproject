package com.learn.j8.j1.optional;

import com.learn.data.Student;

import java.util.Optional;

public class OptionalOrElseExample {

    //orElse
    public static String orElse() {
        // Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElse("Default1");
        return name;
    }

    //orElseGet
    public static String orElseGet() {
        // Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseGet(() -> "Default2");
        return name;
    }

    //OrElseThrow
    public static String orElseThrow() {
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseThrow(
                () -> new RuntimeException("No data available"));
        return name;
    }

    public static void main(String[] args) {
        System.out.println("orElse: " + orElse());
        System.out.println("orElseGet: " + orElseGet());
        System.out.println("orElseThrow: " + orElseThrow());
    }
}
