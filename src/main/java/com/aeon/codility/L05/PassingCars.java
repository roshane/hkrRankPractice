package com.aeon.codility.L05;

/**
 * Created by roshane on 8/12/18.
 */
public class PassingCars {

    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};
        System.out.println(solution(A));
    }

    static public int solution(int[] A) {
        int maxLen = (int) 1e5 + 1;
        int[] P = new int[maxLen];
        int[] Q = new int[maxLen];
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                P[i] = 1;
            }
            if (A[i] == 1) {
                Q[i] = 1;
            }
        }


        int pairs = 0;

        for (int i = 0; i < maxLen; i++) {
            if (Q[i] == 1) {
                for (int j = 0; j < i; j++) {
                    if (P[j] == 1) {
                        pairs += 1;
                    }
                }
            }
            if (pairs > (int) 1e9) {
                return -1;
            }
        }

        return pairs;
    }
}
