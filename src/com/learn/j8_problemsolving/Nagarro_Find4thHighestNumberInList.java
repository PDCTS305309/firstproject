package com.learn.j8_problemsolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//find 4th highest number in an array
//https://stackoverflow.com/questions/51606628/how-can-i-call-second-largest-number-from-arraylist-using-collections
public class Nagarro_Find4thHighestNumberInList {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 3, 5, 4, 2, 10, 15, 2, 1, 9);

        int num = list1.stream().sorted(Collections.reverseOrder()).distinct().limit(4).skip(3).findFirst().get();
        System.out.println(num);
    }
}
