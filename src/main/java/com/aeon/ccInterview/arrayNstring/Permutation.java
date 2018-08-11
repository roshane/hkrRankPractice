package com.aeon.ccInterview.arrayNstring;

/**
 * Created by roshane on 7/22/18.
 */
public class Permutation {

    public static void main(String[] args) {
        String a = "abcdef";
        String b = "bcdef";
        System.out.println(isPermutation(a,b));
    }

    static boolean isPermutation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int[] buffer = new int[128];
        for (char c : a.toCharArray()) {
            buffer[c] = ++buffer[c];
        }
        for (char c : b.toCharArray()) {
            buffer[c] = --buffer[c];
            if (buffer[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
