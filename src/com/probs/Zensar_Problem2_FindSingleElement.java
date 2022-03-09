package com.probs;

import java.util.Arrays;

/**
 * All elements appear thrice and one element appears once. Find that element in O(n) time and O(1) space
 * https://algorithms.tutorialhorizon.com/all-elements-appears-thrice-and-one-element-appears-once-find-that-element-in-on-time-and-o1-space/
 */
public class Zensar_Problem2_FindSingleElement {

    public static void find(int[] arrA) {
        int singleElement = 0;
        for (int i = 0; i < 32; i++) {
            int y = (1 << i);
            int tempSum = 0;
            for (int j = 0; j < arrA.length; j++) {
                if ((arrA[j] & y) >= 1)
                    tempSum = tempSum + 1;
            }
            if ((tempSum % 3) == 1) {
                singleElement = singleElement | y;
            }
        }
        System.out.println("Element appearing once is: " + singleElement);
    }

    public static void main(String[] args) {
        int[] arrA = {4, 4, 5, 5, 6, 7, 7, 7, 4, 5, 2, 2, 2};
        System.out.println(Arrays.toString(arrA));
        find(arrA);
    }

}
