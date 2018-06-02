package com.aeon.hkrnk.str;

/**
 * Created by roshane on 6/2/2018.
 */
public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }

    // Complete the camelcase function below.
    static int camelcase(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (isUpperCase(s.charAt(i)))
                count++;
        }
        return count;
    }

    static boolean isUpperCase(char c) {
        int A = 'A';
        int Z = 'Z';
        return c >= A && c <= Z;
    }
}
