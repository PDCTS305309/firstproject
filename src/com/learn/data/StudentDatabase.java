package com.learn.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDatabase {

    public static Supplier<Student> studentSupplier = () -> {
        Bike bike = new Bike();
        bike.setName("Pulsar");
        bike.setModel("Pulsar150");
        Student student = new Student("Adam", 2, 3.6, "male", Arrays.asList("Swimming", "Basketball", "Volleyball"), 11);
        student.setBike(Optional.ofNullable(bike));
        return student;
    };

    public static List<Student> getAllStudents() {
        Student s1 = new Student("Adam", 2, 3.6, "male", Arrays.asList("Swimming", "Basketball", "Volleyball"), 11);
        Student s2 = new Student("Jenny", 2, 3.8, "female", Arrays.asList("Swimming", "Gymnastics", "Soccer"), 12);

        Student s3 = new Student("Emily", 3, 4.0, "female", Arrays.asList("Swimming", "Gymnastics", "Aerobics"), 10);
        Student s4 = new Student("Dave", 3, 3.9, "male", Arrays.asList("Swimming", "Gymnastics", "Soccer"), 9);

        Student s5 = new Student("Sophia", 4, 3.5, "female", Arrays.asList("Swimming", "Basketball", "Volleyball"), 15);
        Student s6 = new Student("James", 4, 3.9, "male", Arrays.asList("Swimming", "Basketball", "Baseball", "Football"), 14);

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6);
        return students;
    }
}
