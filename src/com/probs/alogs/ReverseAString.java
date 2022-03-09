/***
 * Reverse a String using different ways -
 *  a) appending chars at front chars to a blank string
 *  b) using StringBuilder/Stringbuffer reverse method
 *  c) using chars[] arry or byte array to from new chararay by reading backward.
 * ***/

package com.probs.alogs;

public class ReverseAString {

    //Traverse String & Add each character in front of the existing blank string
    public static String reverse_way1(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = input.charAt(i) + output;
        }
        return output;
    }

    //using String Builder
    public static String reverse_way2(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    //using char array
    public static String reverse_way3(String input) {
        char[] inputChars = input.toCharArray();
        char[] outputChars = new char[inputChars.length];

        for (int i = 0; i < inputChars.length; i++) {
            outputChars[i] = inputChars[inputChars.length - i - 1];
        }
        return new String(outputChars);
    }

    //using byte array
    public static String reverse_way4(String input) {
        byte[] inputBytes = input.getBytes();
        byte[] outputBytes = new byte[inputBytes.length];

        for (int i = 0; i < inputBytes.length; i++) {
            outputBytes[i] = inputBytes[inputBytes.length - i - 1];
        }
        return new String(outputBytes);
    }

    public static void main(String[] args) {
        System.out.println(reverse_way4("SURYA"));
    }
}
