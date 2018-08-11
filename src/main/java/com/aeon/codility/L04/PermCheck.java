package com.aeon.codility.L04;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by roshane on 8/11/18.
 */
public class PermCheck {

    public static void main(String[] args) {
//        int[] A = {4, 1, 3, 2};
//        int[] A = {4, 1, 3};
//        int[] A = {2};
        int[] A = {3, 1};
        System.out.println(solution(A));
    }


    static public int solution(int[] A) {

        Map<Integer, Boolean> map = new HashMap<>();
        int isPermutation = 1;
        int notPermutation = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                return notPermutation;
            } else {
                map.put(A[i], true);
            }
            if (maxValue < A[i]) {
                maxValue = A[i];
            }
        }

        for (int i = 1; i <= maxValue; i++) {
            if (!map.containsKey(i)) {
                return notPermutation;
            }
        }

        return isPermutation;
    }
}
