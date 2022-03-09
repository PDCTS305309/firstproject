package com.learn.j8_problemsolving;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class NetCracker_FindSumOfEmployeeSalary {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList(Arrays.asList(new Employee("ram", 20000), new Employee("Shyam",
                40000)));

        int result = list.stream().map(Employee::getSalary).reduce(0, (i1, i2) -> i1 + i2);

        System.out.println(result);
    }
}
