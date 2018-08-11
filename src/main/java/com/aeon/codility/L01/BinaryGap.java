package com.aeon.codility.L01;

import java.util.Arrays;
import java.util.List;

/**
 * Created by roshane on 8/11/18.
 */
public class BinaryGap {
    static BinaryGap bg = new BinaryGap();

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(9, 529, 20, 15, 32);

        ints.forEach(i -> {
            System.out.println(String.format("solutionA(%d): %d", i, bg.solution(i)));
        });
    }

    public int solution(int N) {
        // write your code in Java SE 8
        int gap = 0;
        int zeroCount = 0;
        boolean startCount = false;
        while (N > 0) {
            if ((N & 1) == 1) {
                startCount = true;
            }
            if (startCount && (N & 1) == 0) {
                zeroCount += 1;
            }
            if (zeroCount > 0 && (N & 1) == 1) {
                if (gap < zeroCount) {
                    gap = zeroCount;
                }
                zeroCount = 0;
            }
            N >>= 1;
        }
        return gap;
    }
}
