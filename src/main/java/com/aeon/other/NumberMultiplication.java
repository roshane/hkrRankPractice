package com.aeon.other;

/**
 * Created by roshane on 6/21/18.
 */
public class NumberMultiplication {

    public static void main(String[] args) {

        System.out.println(multiplyNumbers(12, 2));
        System.out.println(multiplyNumbers(2, 13));
        System.out.println(multiplyNumbers(50, 3 ));
        System.out.println(multiplyNumbers(13, 2 ));

    }

    private static int multiplyNumbers(int a, int b) {
        int result = 0, location = 0, x;

        while (a != 0) {
            x = a & 1;
            if (x == 1) {
                result += (b << location);
            }
            location++;
            a >>>= 1;
        }

        return result;
    }
}
