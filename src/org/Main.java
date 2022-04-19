package org;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {

    private static int getSum(int temp){
        List<Integer> list= Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(temp)
                .map(t -> t[0])
                .collect(Collectors.toList());
        int sum =list.stream().filter(x-> x%2==0).reduce(0, (i1, i2) -> i1+i2);
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(getSum(10000));
    }
}
