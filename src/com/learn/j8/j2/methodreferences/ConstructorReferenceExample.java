package com.learn.j8.j2.methodreferences;

import com.learn.data.Student;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    static Supplier<Student> studentSupplier = Student::new;
    ;
    static Function<String, Student> function = Student::new;
    static BiFunction<String, String, Student> biFunction = Student::new;

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(function.apply("Java8"));
        System.out.println(biFunction.apply("Mohan", "male"));
    }
}
