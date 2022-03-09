/**
 * Move all zeros to end in a Array
 **/

package com.probs.alogs;

import java.util.Arrays;

public class ArraysMoveAllZerosAtEnd {

    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 0, 5, 0, 6, 0, 8, 7};
        int[] farr = new int[arr.length];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                farr[j] = arr[i];
                j++;
            }
        }
        Arrays.stream(farr).forEach((x) -> {
            System.out.print(x + " ");
        });
    }
}
