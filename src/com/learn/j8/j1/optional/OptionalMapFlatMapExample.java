package com.learn.j8.j1.optional;

import com.learn.data.Bike;
import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    //filter
    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        studentOptional.filter(student -> student.getGpa() >= 3.5)
                .ifPresent(System.out::println);
    }

    //map
    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        if (studentOptional.isPresent()) {
            Optional<String> stringOptional = studentOptional.filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName);
            System.out.println(stringOptional.get());
        }
    }

    //flatMap
    //map
    public static void optionalFlatMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        if (studentOptional.isPresent()) {
            Optional<String> stringOptional = studentOptional.filter(student -> student.getGpa() >= 3.5)
                    .flatMap(Student::getBike)
                    .map(Bike::getName);
            stringOptional.ifPresent(System.out::println);
        }
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
