package com.learn.j8.j2.functionalinterfaces;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction = (students) -> {
        Map<String, Double> studentGpaMap = new HashMap<>();
        students.forEach(student -> {
            studentGpaMap.put(student.getName(), student.getGpa());
        });
        return studentGpaMap;
    };

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDatabase.getAllStudents()));
    }
}
