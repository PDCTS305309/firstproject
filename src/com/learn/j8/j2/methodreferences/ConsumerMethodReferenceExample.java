package com.learn.j8.j2.methodreferences;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> c1 = System.out::println;
    static Consumer<Student> c2 = Student::printAllActivities;

    public static void main(String[] args) {
        StudentDatabase.getAllStudents().forEach(c1);
        StudentDatabase.getAllStudents().forEach(c2);
    }

}
