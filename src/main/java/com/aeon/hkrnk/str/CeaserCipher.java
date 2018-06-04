package com.aeon.hkrnk.str;

/**
 * Created by roshane on 6/3/18.
 */
public class CeaserCipher {

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(caesarCipher(s, 3));
    }

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        StringBuilder sb = new StringBuilder(s.length());
        int kk = k % 26;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isAlphabaticChar(c)) {
                char shifted = isUppserCase(c) ? shiftUppercase(c, kk) : shiftLowercase(c, kk);
                sb.append(shifted);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    static char shiftUppercase(char c, int k) {
        int value = (int) c;
        int A = 'A';
        int Z = 'Z';
        int temp = value + k;
        if (temp > Z) {
            return (char) (A + (temp - Z) - 1);
        }
        return (char) temp;

    }

    static char shiftLowercase(char c, int k) {
        int a = 'a';
        int z = 'z';
        int value = (int) c;
        int temp = value + k;
        if (temp > z) {
            return (char) (a + (temp - z) - 1);
        }
        return (char) temp;
    }

    static boolean isLowerCase(char c) {
        int a = 'a';
        int z = 'z';
        int value = (int) c;
        return value >= a && value <= z;
    }

    static boolean isUppserCase(char c) {
        int A = 'A';
        int Z = 'Z';
        int value = (int) c;
        return value >= A && value <= Z;
    }

    static boolean isAlphabaticChar(char c) {
        return isUppserCase(c) || isLowerCase(c);
    }
}
