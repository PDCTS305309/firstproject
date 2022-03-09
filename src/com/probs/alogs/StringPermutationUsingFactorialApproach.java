package com.probs.alogs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StringPermutationUsingFactorialApproach {

    public static List<String> permutations(String word) {
        int n = word.length();

        List<String> words = new ArrayList<>();
        int f = IntStream.rangeClosed(1, n).reduce(1, (x, y) -> x * y);

        for (int i = 0; i < f; i++) {
            StringBuilder sb1 = new StringBuilder(word), sb2 = new StringBuilder();
            int temp = i;
            for (int j = n; j >= 1; j--) {
                int q = temp / j;
                int r = temp % j;
                sb2.append(sb1.charAt(r));
                sb1.deleteCharAt(r);
            }
            words.add(sb2.toString());
        }
        return words;
    }

    public static void main(String[] args) {
        String word = "ABCD";
        List<String> words = permutations(word);
        System.out.println("Size is: " + words.size());
        words.forEach(System.out::println);
    }
}
