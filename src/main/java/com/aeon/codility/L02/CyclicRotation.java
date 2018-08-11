package com.aeon.codility.L02;

import java.util.Arrays;
import java.util.List;

/**
 * Created by roshane on 8/11/18.
 */
public class CyclicRotation {

    public static void main(String[] args) {

    }

    public static int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[(i + K) % A.length] = A[i];
        }
        return result;
    }
}
