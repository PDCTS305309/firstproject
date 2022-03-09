/**
 * Swap 2 Strings without using 3rd variable
 **/

package com.probs.alogs;

public class SwapTwoStringWithoutThirdVariable {

    public static void main(String[] args) {
        String str1 = "ram", str2 = "shyam";

        str1 = str1 + str2;
        str2 = str1.substring(0, (str1.length() - str2.length()));
        str1 = str1.substring(str2.length());

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
    }
}
