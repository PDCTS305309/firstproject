package com.learn.j8_problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://javahungry.blogspot.com/2020/05/java-8-coding-and-programming-interview-questions.html
public class Q2_FindAllNosStartingWith1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 6, 7, 8, 98, 45, 78, 95, 62, 14, 65, 7);

        List<String> list1 = list.stream().map(i -> i + "")
                .filter(s -> s.startsWith("1")).collect(Collectors.toList());

        list1.forEach(s -> {
            System.out.print(s + " ");
        });

    }
}
