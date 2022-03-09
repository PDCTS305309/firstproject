package com.probs.practice;

public class StringPalindromeCheck {

    public static boolean isPalindrome(String str) {
        //char[] chars = name.toCharArray();
        //JAHAJ

        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == str.charAt(str.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("JAHAN"));

    }
}
