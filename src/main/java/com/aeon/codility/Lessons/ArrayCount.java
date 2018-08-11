package com.aeon.codility.Lessons;

import java.util.Arrays;

/**
 * Created by roshane on 8/11/18.
 */
public class ArrayCount {

    public static void main(String[] args) {
        int[] A = {0, 0, 4, 2, 4, 5};
        System.out.println(Arrays.toString(countElementsPositive(A, 5)));
    }

    static int[] countElementsPositive(int[] A, int m) {
        int[] count = new int[m + 1];
        for (int i : A) {
            count[i] += 1;
        }
        return count;
    }
}
