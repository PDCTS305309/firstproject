package com.learn.j8.j1.optional;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.Optional;

public class OptionalExample {
    public static String getStudentName() {
        Student student = StudentDatabase.studentSupplier.get();
        if (null != student) {
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional() {
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        if (studentOptional.isPresent()) {
            return studentOptional.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        /*String name = getStudentName();
        System.out.println("length of name string : "+name.length());*/

        Optional<String> stringOptional = getStudentNameOptional();
        if (stringOptional.isPresent()) {
            System.out.println("Length of the name string is: " + stringOptional.get().length());
        } else {
            System.out.println("No Students found !!!");
        }
    }
}
