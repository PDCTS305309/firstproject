package com.Z0_808;

public class Q3_StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";
        if (sb.equals(s)) {
            System.out.println("match1");
        } else if (sb.toString().equals(s.toString())) {
            System.out.println("match2");
        } else {
            System.out.println("no match");
        }
    }
}
