package com.aeon.codility.L03;

import java.util.Arrays;

/**
 * Created by roshane on 8/11/18.
 */
public class PermMissingElem {

    public static void main(String[] args) {

    }

    public int solution(int[] A) {

        if (A.length == 0) {
            return 0;
        }

        Arrays.sort(A);

        int missing = 1;

        for (int i = 1; i < A.length; i++) {
            if (Math.abs(A[i] - A[i - 1]) != 1) {
                missing = A[i - 1] + 1;
                break;
            }
        }
        return missing;
    }
}
