package com.learn.j8.j2.functionalinterfaces;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<Student> studentSupplier = () -> new Student("Adam", 2, 3.6, "male",
            List.of("Swimming", "Basketball", "Volleyball"), 11);

    static Supplier<List<Student>> listSupplier = StudentDatabase::getAllStudents;

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println("Students are:\n" + listSupplier.get());
    }
}
