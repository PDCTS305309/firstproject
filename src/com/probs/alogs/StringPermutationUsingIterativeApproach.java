/**
 * https://www.techiedelight.com/generate-permutations-string-java-recursive-iterative/
 **/

package com.probs.alogs;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationUsingIterativeApproach {

    public static void permutations(String input) {
        List<String> partial = new ArrayList<>();
        partial.add(String.valueOf(input.charAt(0)));

        for (int i = 1; i < input.length(); i++) {
            for (int j = partial.size() - 1; j >= 0; j--) {
                String str = partial.remove(j);
                for (int k = 0; k <= str.length(); k++) {
                    System.out.println("str=" + str + ", i = " + i + ", j = " + j + ", k = " + k);
                    String finalString = str.substring(0, k) + input.charAt(i) + str.substring(k);
                    System.out.println("str.substring(0, k) :" + str.substring(0, k) + " ,input.charAt(i) : " + input.charAt(i) + " ,str.substring(k) : " + str.substring(k));
                    System.out.println(finalString);
                    partial.add(finalString);
                }
                print('j', j, partial);
            }
            print('i', i, partial);
        }

        System.out.println(partial);
    }

    public static void main(String[] args) {
        String s = "ABCD";
        permutations(s);
    }

    public static void print(char c, int i, List<String> list) {
        System.out.println("====== After " + c + " = " + i);
        list.forEach(s1 -> System.out.print(s1 + " "));
        System.out.println();
        System.out.println(" iteration =======");
    }

}
