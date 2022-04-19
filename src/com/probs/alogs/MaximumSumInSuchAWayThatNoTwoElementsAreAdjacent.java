package com.probs.alogs;

import java.util.Arrays;

public class MaximumSumInSuchAWayThatNoTwoElementsAreAdjacent {

    // Driver program to test above functions
    public static void main(String[] args) {
        int[] arr = new int[]{5, 5, 10, 100, 10, 5};
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
        System.out.println();
        System.out.println(findMaxSum(arr, arr.length));
    }

    /*Function to return max sum such that no two elements
      are adjacent */
    static int findMaxSum(int[] arr, int n) {
        int incl = arr[0];
        int excl = 0;
        int excl_new;
        int i=0;
        System.out.println("i:"+i+",element:"+arr[i]+",excl:"+excl+",incl:"+incl);
        for (i = 1; i < n; i++) {
            /* current max excluding i */
            excl_new = Math.max(incl, excl);
            /* current max including i */
            incl = excl + arr[i];
            excl = excl_new;
            System.out.println("i:"+i+",element:"+arr[i]+",excl:"+excl+",incl:"+incl);
        }
        /* return max of incl and excl */
        return Math.max(incl, excl);
    }
}
