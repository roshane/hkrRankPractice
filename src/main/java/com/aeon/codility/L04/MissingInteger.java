package com.aeon.codility.L04;

/**
 * Created by roshane on 8/12/18.
 */
public class MissingInteger {

    public static void main(String[] args) {
//        int[] A={1, 3, 6, 4, 1, 2};
//        int[] A={1,2,3};
        int[] A = {1, -3};
        System.out.println(solution(A));
    }

    static public int solution(int[] A) {
        int pivot = (int) 1e6 + 1;
        int[] count = new int[pivot];
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                count[A[i]] += 1;
            }
        }
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 0) {
                return i;
            }
        }
        return count[count.length - 1] + 1;
    }
}
