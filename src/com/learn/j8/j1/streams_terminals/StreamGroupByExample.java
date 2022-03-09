package com.learn.j8.j1.streams_terminals;

import com.learn.data.Student;
import com.learn.data.StudentDatabase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamGroupByExample {

    public static void groupStudentsByGender() {
        Map<String, List<Student>> stringListMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(stringListMap);
    }

    public static void customizedGroupStudentsByGpa() {
        Map<String, List<Student>> stringListMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa() >= 3.8 ? "Outstanding" : "Average"));
        System.out.println(stringListMap);
    }

    public static void twoLevelGrouping_1() {
        Map<Integer, Map<String, List<Student>>> stringListMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, groupingBy(student -> student.getGpa() >= 3.8 ? "Outstanding" : "Average")));
        System.out.println(stringListMap);
    }


    public static void twoLevelGrouping_2() {
        Map<String, Integer> stringListMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, summingInt(Student::getNotebooks)));
        System.out.println(stringListMap);
    }

    public static void threeArgumentsGroupBy() {
        LinkedHashMap<String, Set<Student>> stringSetLinkedHashMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println(stringSetLinkedHashMap);
    }

    public static void calculateMaxGpa() {
        Map<Integer, Optional<Student>> stringOptionalMap =
                StudentDatabase.getAllStudents()
                        .stream()
                        .collect(groupingBy(Student::getGradeLevel, maxBy(Comparator.comparing(Student::getGpa))));
        //System.out.println(stringOptionalMap);

        Map<Integer, Student> stringOptionalMap1 =
                StudentDatabase.getAllStudents()
                        .stream()
                        .collect(groupingBy(Student::getGradeLevel,
                                collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(stringOptionalMap1);

    }

    public static void calculateMinGpa() {
        Map<Integer, Optional<Student>> stringOptionalMap =
                StudentDatabase.getAllStudents()
                        .stream()
                        .collect(groupingBy(Student::getGradeLevel, maxBy(Comparator.comparing(Student::getGpa))));
        //System.out.println(stringOptionalMap);

        Map<Integer, Student> stringOptionalMap1 =
                StudentDatabase.getAllStudents()
                        .stream()
                        .collect(groupingBy(Student::getGradeLevel,
                                collectingAndThen(minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(stringOptionalMap1);

    }

    public static void main(String[] args) {
        calculateMinGpa();
        //threeArgumentsGroupBy();
        //twoLevelGrouping_2();
        //customizedGroupStudentsByGpa();
    }
}
