package com.probs.alogs;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationUsingRecursionApproach {

    private static List<String> permutations = new ArrayList<>();

    public static void permute(String input, int l, int r) {

        if (l == r) {
            permutations.add(input);
        } else {
            for (int i = l; i < r; i++) {
                String str = swap(input, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String str, int left, int right) {
        char[] input = str.toCharArray();
        char c = input[left];
        input[left] = input[right];
        input[right] = c;
        return new String(input);
    }

    public static void main(String[] args) {

        permute("ABB", 0, 3);
        permutations.stream().distinct().forEach(System.out::println);

    }
}
