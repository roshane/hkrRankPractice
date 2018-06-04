package com.aeon.hkrnk.str;

import java.util.Arrays;

/**
 * Created by roshane on 6/3/18.
 */
public class Pangrams {

    public static void main(String[] args) {
//        String input = "The quick brown fox jumps over the lazy dog";
        String input = "We promptly judged antique ivory buckles for the next prize";
        System.out.println(pangrams(input));
    }

    // Complete the pangrams function below.
    static String pangrams(String s) {
        String input = toLowerCase(s);
        boolean[] charArrayMap = charArrayMap(input);
        for(int i=0;i<charArrayMap.length;i++){
            if(!charArrayMap[i]){
                return "not pangram";
            }
        }
        return "pangram";
    }

    static boolean[] charArrayMap(String input) {
        boolean[] returnValue = new boolean[26];
        int a = (int) 'a';
        for (char s : input.toCharArray()) {
            if (isAlphabaticChar(s)) {
                returnValue[(s - a)] = true;
            }
        }
        return returnValue;
    }

    static String toLowerCase(String c) {

        StringBuilder sb = new StringBuilder();
        for (char code : c.toCharArray()) {
            if (isAlphabaticChar(code)) {
                sb.append(toLowerCase(code));
            } else {
                sb.append(code);
            }
        }
        return sb.toString();
    }

    static boolean isAlphabaticChar(char c) {
        int value = (int) c;
        int a = 'a';
        int z = 'z';
        int A = 'A';
        int Z = 'Z';

        return (value >= a && value <= z) || (value >= A && value <= Z);
    }

    static char toLowerCase(char c) {
        int Z = 'Z';
        int A = 'A';
        int value = (int) c;

        if (value >= A && value <= Z) {
            return (char) (value + 32);
        }
        return c;
    }
}
