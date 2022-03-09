package com.learn.j8.j1.defaults;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {

    static Consumer<Student> studentConsumer = System.out::println;

    static Comparator<Student> nameComparator = Comparator.nullsFirst(Comparator.comparing(Student::getName));
    static Comparator<Student> gpaComparator = Comparator.nullsFirst(Comparator.comparingDouble(Student::getGpa));
    static Comparator<Student> gradeComparator = Comparator.nullsFirst(Comparator.comparingInt(Student::getGradeLevel));

    public static void sortByName(List<Student> studentList) {
        System.out.println("====After sort Result =======");
        Comparator<Student> studentComparator = Comparator.comparing(Student::getName);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullValue(List<Student> studentList) {
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudents();
        System.out.println("====Before sort Result =======");
        studentList.forEach(System.out::println);

        System.out.println("====After sort Result =======");
        //studentList.sort(Comparator.comparing(Student::getName));
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        //sortWithNullValue(studentList);
        studentList.forEach(System.out::println);
    }
}
