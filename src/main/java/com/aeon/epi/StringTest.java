package com.aeon.epi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by roshane on 6/15/18.
 */
public class StringTest {

    private static Consumer<String> consumer = s -> System.out.println("Consumer consumes: " + s);
    private static BiFunction<String, String, Integer> countOccurences = (str, key) -> {
        int count = 0;
        int pos = 0;
        int offset = key.length();
        while ((pos = str.indexOf(key, pos)) != -1) {
            count++;
            pos = pos + offset;
        }
        return count;
    };

    public static void main(String[] args) {
//        String a = "<p> hello world</p>";
//        String b = "<p> hello world <span></span></p>";
//        String c = ",,123 < Roshane Perera > >";
//        removeHTMLTage(a);
//        removeHTMLTage(b);
//        removeHTMLTage(c);
//        int[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(Arrays.toString(ia));
//        reaArrangeArray(ia);
//        String name = "abcdefghijklmnopqrstuvwxyz123456789";
//        StringBuilder sb = new StringBuilder();
//        for (char c : name.toCharArray()) {
//            sb.append(toLowercase(c));
//        }
//        System.out.println(String.format("Original [%s]\nConverted [%s]", name, sb.toString()));
//        System.out.println(String.format("Is Unique Chars [%s] > %b", name, isUniquechars(name)));
//        String input = "roshane madusanka";
//        String key = "sak";
//        System.out.println(countOccurences.apply(input, key));
        Map<String, Object> map = new HashMap<>();
        map.put(null, "hello");
        map.put(null, "world");
        map.put("str", "hello world");
        System.out.println(map);

    }

    private static boolean isUniquechars(String input) {
        boolean[] charVisitTable = new boolean[127];
        for (char c : input.toCharArray()) {
            if (charVisitTable[c]) {
                return false;
            }
            charVisitTable[c] = true;
        }
        return true;
    }

    private static void removeHTMLTage(String input) {
        char open = '<';
        char close = '>';
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c == open) {
                stack.push(c);
            } else if (!stack.empty() && c != close) {
                stack.push(c);
            } else if (c == close) {
                if (stack.isEmpty()) {
                    sb.append(c);
                } else {
                    stack.clear();
                }
            } else {
                sb.append(c);
            }
        }
        System.out.println(input);
        System.out.println(sb.toString());
    }

    private static void reaArrangeArray(int[] input) {
        if (input.length > 2) {
            for (int i = 1; i + 1 < input.length; i += 2) {
                swapArray(input, i, i + 1);
            }
        }
        System.out.println(Arrays.toString(input));
    }

    private static void swapArray(int[] input, int a, int b) {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }

    static char toLowercase(char c) {
        int a = 'a';
        int A = 'A';
        if (isUppercase(c)) {
            return (char) (c + (a - A));
        }
        return c;
    }

    static boolean isUppercase(char c) {
        int A = 'A';
        int Z = 'Z';
        return (c >= A && c <= Z);
    }
}
