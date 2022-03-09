package com.learn.j8.j2.functionalinterfaces;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    static final List<Student> students = StudentDatabase.getAllStudents();

    public static void printNameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + activities);
        students.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a: " + a + ", b:" + b);
        };

        biConsumer.accept("Ram", "Shyam");

        BiConsumer<Integer, Integer> biConsumer1 = (a, b) -> {
            System.out.println(a + "*" + b + " = " + a * b);
        };
        BiConsumer<Integer, Integer> biConsumer2 = (a, b) -> {
            System.out.println(a + "/" + b + " = " + a / b);
        };
        biConsumer1.andThen(biConsumer2).accept(150, 10);

        printNameAndActivities();
    }
}
