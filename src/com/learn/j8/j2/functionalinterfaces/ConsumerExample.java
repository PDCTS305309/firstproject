package com.learn.j8.j2.functionalinterfaces;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static final List<Student> students = StudentDatabase.getAllStudents();
    static Consumer<String> c1 = (str) -> System.out.println(str.toUpperCase());
    static Consumer<Student> c2 = (s) -> System.out.println(s);
    static Consumer<Student> c3 = (s) -> System.out.print(s.getName());
    static Consumer<Student> c4 = (s) -> System.out.println(s.getActivities());

    public static void printName() {
        students.forEach(c2);
    }

    public static void printNameAndActivities() {
        //consumer chaining
        students.forEach(c3.andThen(c4));
    }

    public static void printNameAndActivitiesUsingCondition() {
        students.forEach(student -> {
            if (student.getGradeLevel() >= 3)
                c3.andThen(c4).accept(student);
        });
    }

    public static void main(String[] args) {
        //c1.accept("java8");
        //printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
