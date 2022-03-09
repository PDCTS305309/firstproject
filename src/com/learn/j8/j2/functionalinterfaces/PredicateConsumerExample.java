package com.learn.j8.j2.functionalinterfaces;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerExample {

    Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;
    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
        System.out.println(name + " : " + activities);
    };

    Consumer<Student> consumer = (student) -> {
        if (biPredicate.test(student.getGradeLevel(), student.getGpa()))
            biConsumer.accept(student.getName(), student.getActivities());
    };

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudents();
        new PredicateConsumerExample().printNameAndActivities(studentList);
    }

    public void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(consumer);
    }
}
