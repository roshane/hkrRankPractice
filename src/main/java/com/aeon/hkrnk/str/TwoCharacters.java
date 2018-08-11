package com.aeon.hkrnk.str;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by roshane on 6/3/2018.
 */
public class TwoCharacters {
//
//    public static void main(String[] args) {
//
//    }
//
//    // Complete the twoCharaters function below.
//    static int twoCharaters(String s) {
//
//
//    }

    public static void main(String[] args) {
        char[] chars = {'i',
                's',
                'c',
                'c',
                'c',
                'c',
                'c',
                'c',
                'c',
                'c',
                'c',
                'd',
                'e',
                'i',
                'i',
                'l',
                'l',
                'l',
                'n',
                'n',
                'n',
                'o',
                'p',
                'p',
                'p',
                'p',
                'r',
                's',
                's',
                's',
                's',
                't',
                't',
                't',
                'u',
                'u',
                'v',
                'w',};
        for (char c : chars) {
            System.out.println(toUppercase(c));
        }
    }

    static char toUppercase(char i) {
        int a = 'a';
        int A = 'A';
        return (char) (i - (a - A));
    }
}
