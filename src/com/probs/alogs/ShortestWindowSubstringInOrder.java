package com.probs.alogs;
/**
 * Shortest Window Substring in Order
 * -- Algorithm to find the minimum length of substring having all alphabets
 * https://binarysearch.com/problems/Shortest-Window-Substring-in-Order/solutions/3299593
 * <p>
 * We maintain two array of 26 for our dynamic programming needs.
 * <p>
 * dp0 is to specify the position when this character was last found AND that this character must be the connected with its latest predecessor.
 * dp1 is to specify what's the total length of this total substring, starting from a.
 */

import java.util.Arrays;

public class ShortestWindowSubstringInOrder {

    public static int solve(String s) {
        int[] dp0 = new int[26], dp1 = new int[26]; // position, length
        Arrays.fill(dp0, -1);

        int res = Integer.MAX_VALUE;
        for (int j = 0; j != s.length(); j++) {
            final int ch = s.charAt(j) - 'a';
            if (ch == 0) {
                dp0[ch] = j;
                dp1[ch] = 1;
            } else {
                if (dp0[ch - 1] != -1) {
                    dp0[ch] = j;
                    dp1[ch] = j - dp0[ch - 1] + dp1[ch - 1];
                }
                if (dp0[25] != -1) {
                    res = Math.min(res, dp1[25]);
                }
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static void main(String[] args) {
        String str = "abacdefghijklmnopqrstuvwxyz";
        System.out.println("max length is: " + solve(str));
    }
}