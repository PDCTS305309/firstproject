package com.probs.practice;

import java.util.Arrays;

public class ShortestWindowString {

    public static int compute(String str) {
        int res = Integer.MAX_VALUE;
        //first array to hold each char's latest index
        int dp0[] = new int[26];
        Arrays.fill(dp0, -1);
        //second array to hold each char's length from latest a
        int dp1[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i) - 'a';
            if (ch == 0) {
                dp0[ch] = i;
                dp1[ch] = 1;
            } else {
                if (dp0[ch - 1] != -1) {
                    dp0[ch] = i;
                    dp1[ch] = i - dp0[ch - 1] + dp1[ch - 1];
                }
                if (dp0[25] != -1) {
                    res = Math.min(res, dp1[25]);
                }
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static void main(String[] args) {
        String str = "zmkibuabcdefghijklmnopqrstuvwxyz";
        System.out.println("Min length of substring halving all alphabets: " + compute(str));
    }
}
