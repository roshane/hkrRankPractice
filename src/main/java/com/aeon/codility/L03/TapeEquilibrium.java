package com.aeon.codility.L03;

/**
 * Created by roshane on 8/11/18.
 */
public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        if (A.length == 2) {
            return Math.abs(A[0] - A[1]);
        }
        int[] prefixSum = prefixSum(A);
        int[] suffixSum = suffixSum(A);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < A.length - 1; i++) {
            int diff = Math.abs(prefixSum[i - 1] - suffixSum[i]);
            if (minDiff > diff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }

    static int[] prefixSum(int[] A) {
        int[] result = new int[A.length];
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            result[i] = sum;
        }
        return result;
    }

    static int[] suffixSum(int[] A) {
        int[] result = new int[A.length];
        int sum = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            sum += A[i];
            result[i] = sum;
        }
        return result;
    }
}
