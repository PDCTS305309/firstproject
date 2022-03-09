package com.learn.data;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Student {
    String name;
    int gradeLevel;
    double gpa;
    String gender;
    List<String> activities;
    int notebooks;
    private Optional<Bike> bike = Optional.empty();

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int notebooks) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
        this.notebooks = notebooks;
    }

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public void printAllActivities() {
        System.out.println(activities);
    }

    public int getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(int notebooks) {
        this.notebooks = notebooks;
    }

    public Optional<Bike> getBike() {
        return bike;
    }

    public void setBike(Optional<Bike> bike) {
        this.bike = bike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return gradeLevel == student.gradeLevel && Double.compare(student.gpa, gpa) == 0 && notebooks == student.notebooks && Objects.equals(name, student.name) && Objects.equals(gender, student.gender) && Objects.equals(activities, student.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gradeLevel, gpa, gender, activities, notebooks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activities=" + activities +
                ", notebooks=" + notebooks +
                ", bike=" + bike +
                '}';
    }
}
