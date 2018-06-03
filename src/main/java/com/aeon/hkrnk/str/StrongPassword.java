package com.aeon.hkrnk.str;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by roshane on 6/2/2018.
 */
public class StrongPassword {

    private static Set<Character> numbers;
    private static Set<Character> specialChars;

    static {
        numbers = IntStream.range(0, 10)
                .boxed()
                .map(i -> Character.forDigit(i, 10))
                .collect(Collectors.toSet());

        String s = "!@#$%^&*()-+";
        specialChars = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            specialChars.add(c);
        }
    }

    public static void main(String[] args) {
//        String s = "Ab1";
        String s = "4700";
        System.out.println(minimumNumber(s.length(), s));
    }

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {

        Map<String, Integer> countMap = new HashMap<>();
        countMap.put("NUM", 0);
        countMap.put("SC", 0);
        countMap.put("UC", 0);
        countMap.put("LC", 0);

        for (int i = 0; i < n; i++) {
            char c = password.charAt(i);
            if (isNumber(c)) {
                countMap.put("NUM", countMap.get("NUM") + 1);
            } else if (isSpecialChar(c)) {
                countMap.put("SC", countMap.get("SC") + 1);
            } else if (isUpperCase(c)) {
                countMap.put("UC", countMap.get("UC") + 1);
            } else if (isLowerCase(c)) {
                countMap.put("LC", countMap.get("LC") + 1);
            }
        }
        Set<Map.Entry<String, Integer>> emptyEntrySet = countMap.entrySet()
                .stream()
                .filter(e -> e.getValue() == 0)
                .collect(Collectors.toSet());
        System.out.println(emptyEntrySet);
        System.out.println("emptyEntrySet.size() " + emptyEntrySet.size());

        if (n > 5 && emptyEntrySet.isEmpty()) {
            return 0;
        } else {
            return n + emptyEntrySet.size() < 6
                    ? (6 - (n + emptyEntrySet.size())) + emptyEntrySet.size()
                    : emptyEntrySet.size();
        }
    }

    static boolean isUpperCase(char c) {
        int A = 'A';
        int Z = 'Z';
        return c >= A && c <= Z;
    }

    static boolean isLowerCase(char c) {
        int a = 'a';
        int z = 'z';
        return c >= a && c <= z;
    }

    static boolean isNumber(char c) {
        return numbers.contains(c);
    }

    static boolean isSpecialChar(char c) {
        return specialChars.contains(c);
    }
}
