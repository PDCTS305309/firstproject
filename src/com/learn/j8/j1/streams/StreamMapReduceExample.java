package com.learn.j8.j1.streams;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

public class StreamMapReduceExample {

    public static int getTotalNoOfNotebooks() {
        return StudentDatabase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .filter(student -> student.getGender().equalsIgnoreCase("Female"))
                .map(Student::getNotebooks)
                //.reduce(0,(a,b) -> a+b);
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("Total no of notebooks:" + getTotalNoOfNotebooks());
    }
}
