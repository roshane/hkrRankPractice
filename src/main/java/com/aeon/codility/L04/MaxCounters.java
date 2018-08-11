package com.aeon.codility.L04;

import java.util.Arrays;

/**
 * Created by roshane on 8/11/18.
 */
public class MaxCounters {

    public static void main(String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        solution(5, A);
    }

    static public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counters = new int[N];
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > N) {
                toMax(counters, max);
            } else {
                counters[A[i] - 1] += 1;
                if (counters[A[i] - 1] > max) {
                    max = counters[A[i] - 1];
                }
            }
            System.out.println(Arrays.toString(counters));
        }
        return counters;
    }

    static void toMax(int[] counters, int max) {
        for (int i = 0; i < counters.length; i++) {
            counters[i] = max;
        }
    }
}
