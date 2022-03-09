package com.learn.j8.j1.defaults;

import java.util.List;

public interface Multiplier {

    static boolean isEmpty(List<Integer> integerList) {
        return integerList != null && integerList.size() > 0;
    }

    int multiply(List<Integer> integerList);

    default int size(List<Integer> integerList) {
        System.out.println("Inside multiplier Interface");
        return integerList.size();
    }
}
