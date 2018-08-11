package com.aeon.codility.L04;

/**
 * Created by roshane on 8/11/18.
 */
public class FrogRiverOne {

    public static void main(String[] args) {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4, 5};
        solution(5, A);
    }

    static public int solution(int X, int[] A) {
        int result = 0;
        int[] arr = new int[(int) 1e5];
        for (int i = 0; i < A.length; i++) {
            int pos = A[i];
            if (arr[pos] == 0) {
                arr[pos] = i;
            }
        }
        int minTime;
        return result;
    }
}
