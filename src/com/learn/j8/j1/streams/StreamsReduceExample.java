package com.learn.j8.j1.streams;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static long performMultiplication(List<Integer> numbers) {
        return numbers.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Student> getHighestGpaStudent() {
        return StudentDatabase.getAllStudents().stream()
                .reduce((student1, student2) -> student1.getGpa() > student2.getGpa() ? student1 : student2);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);
        System.out.println("Final multiplicated no is : " + performMultiplication(numbers));
        Optional<Student> opt = getHighestGpaStudent();
        if (opt.isPresent()) {
            System.out.println(opt.get());
        }
    }
}
