package com.aeon.ccInterview.arrayNstring;

import java.util.Arrays;

/**
 * Created by roshane on 7/21/18.
 */
public class StringIsUniqueChars {

    public static void main(String[] args) {
        Arrays.asList("abcdefghijkLMNOP",
                "123adad",
                "aA",
                "tyejkdla")
                .forEach(s -> System.out.println(String.format("%-20s is unique %b", s, isUniqueChars(s))));
    }

    static boolean isUniqueChars(String input) {
        boolean[] array = new boolean[128];
        String uppercaseInput = toUppercase(input);
        for (char c : uppercaseInput.toCharArray()) {
            if (array[c]) {
                return false;
            }
            array[c] = true;
        }
        return true;
    }

    static String toUppercase(String input) {
        StringBuilder sb = new StringBuilder(input.length());
        for (char c : input.toCharArray()) {
            sb.append(toUppercase(c));
        }
        return sb.toString();
    }

    static char toUppercase(char c) {
        int a = 'a';
        int z = 'z';
        if (c >= a && c <= z) {
            return (char) (c - ('a' - 'A'));
        }
        return c;
    }
}
