package com.learn.j8_problemsolving;
//https://javabypatel.blogspot.com/2018/06/java-8-stream-practice-problems.html

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 1. Get student with exact match name "jayesh"
 * 2. Get student with matching address "1235"
 * 3. Get all student having mobile numbers 3333.
 * 4. Get all student having mobile number 1233 and 1234
 * 5. Create a List<Student> from the List<TempStudent>
 * 6. Convert List<Student> to List<String> of student name
 * 7. Convert List<students> to String
 * 8. Change the case of List<String>
 * 9. Sort List<String>
 * 10. Conditionally apply Filter condition, say if flag is enabled then.
 **/

public class Q12_Java_8_Stream_Practice_Problems {

    public static void main(String[] args) {
        //1. Get student with exact match name "jayesh"
        Optional<Student> optionalStudent1 = getStudents().stream()
                .filter(student -> student.getName().equals("Jayesh"))
                .collect(Collectors.toList()).stream().findFirst();
        optionalStudent1.ifPresent(student -> System.out.println(" 1. Get student with exact match name \"jayesh\": " + student));

        //2. Get student with matching address "1235"
        Optional<Student> optionalStudent2 = getStudents().stream().
                filter(student -> student.getAddress().getZipcode().equals("1235"))
                .findFirst();
        optionalStudent2.ifPresent(student -> System.out.println("2. Get student with matching address \"1235\": " + student));

        //3. Get all student having mobile numbers 3333.
        List<Student> stud2 = getStudents().stream()
                .filter(student111 -> student111.getMobileNumbers().stream().anyMatch(x -> Objects.equals(x.getNumber(), "3333")))
                .collect(Collectors.toList());
        String result1 = stud2.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));
        System.out.println("3. Get all student having mobile numbers \"3333\" : " + result1);

        //4. Get all student having mobile number 1233 and 1234
        List<Student> stud3 = getStudents().stream().filter(
                student -> student.getMobileNumbers().stream().anyMatch(
                        mobileNumber -> mobileNumber.getNumber().equals("1233") || mobileNumber.getNumber().equals("1234"))
        ).collect(Collectors.toList());
        String result2 = stud3.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));
        System.out.println("4. Get all student having mobile numbers \"1233\" and \"1234\": " + result2);

        //5. Create a List<Student> from the List<TempStudent>
        TempStudent tmpStud1 = new TempStudent(
                "Jayesh1",
                201,
                new Address("12341"),
                List.of(new MobileNumber("12331"), new MobileNumber("12341")));
        TempStudent tmpStud2 = new TempStudent(
                "Khyati1",
                202,
                new Address("12351"),
                List.of(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));
        List<TempStudent> tmpStudents = List.of(tmpStud1, tmpStud2);

        List<Student> studentList = tmpStudents.stream().map(tempStudent -> new Student(tempStudent.name, tempStudent.age, tempStudent.address, tempStudent.mobileNumbers))
                .collect(Collectors.toList());
        System.out.println("5. Create a List<Student> from the List<TempStudent>");
        studentList.forEach(System.out::println);

        //6. Convert List<Student> to List<String> of student name
        List<String> nameList = getStudents().stream().map(Student::getName).collect(Collectors.toList());
        System.out.println("6. Convert List<Student> to List<String> of student name");
        nameList.forEach(System.out::println);

        //7. Change the case of List<String>
        List<String> nameList1 =
                List.of("Jayesh", "Dany", "Khyati", "Hello", "Mango");
        System.out.println("7. Change the case of List<String>");
        nameList1.stream().map(String::toUpperCase).forEach(System.out::println);

        //8.Sort List<String>
        List<String> nameList2 =
                List.of("Jayesh", "Dany", "Khyati", "Hello", "Mango");
        System.out.println("8.Sort List<String>");
        nameList2.stream().sorted().forEach(System.out::println);

    }

    public static List<Student> getStudents() {
        Student student1 = new Student(
                "Jayesh",
                20,
                new Address("1234"),
                List.of(new MobileNumber("1233"), new MobileNumber("1234")));

        Student student2 = new Student(
                "Khyati",
                20,
                new Address("1235"),
                List.of(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

        Student student3 = new Student(
                "Jason",
                20,
                new Address("1236"),
                List.of(new MobileNumber("3333"), new MobileNumber("4444")));

        return List.of(student1, student2, student3);
    }
}

class TempStudent {
    public String name;
    public int age;
    public Address address;
    public List<MobileNumber> mobileNumbers;

    public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }
}

class Student {
    private String name;
    private int age;
    private Address address;
    private List<MobileNumber> mobileNumbers;

    public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<MobileNumber> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", mobileNumbers=" + mobileNumbers +
                '}';
    }
}

class Address {
    private String zipcode;

    public Address(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}

class MobileNumber {
    private String number;

    public MobileNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}