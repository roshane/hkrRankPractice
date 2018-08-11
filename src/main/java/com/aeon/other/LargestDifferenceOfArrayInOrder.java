package com.aeon.other;

/**
 * Created by roshane on 6/7/18.
 */
public class LargestDifferenceOfArrayInOrder {


    public static void main(String[] args) {
        int[] a = {1, -12, 13, 30, 45, 42, 0, 12};
        int[] result = getLargestDifferentIndexes(a);

        System.out.println(String.format("Largest diff index [%d]-[%d] = [%d]",
                result[0], result[1], a[result[1]] - a[result[0]]));
    }

    private static int[] getLargestDifferentIndexes(int[] input) {
        int low = 0, high = 0;
        int largestDiff = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                int diff = input[j] - input[i];
                count += 1;
                System.out.println(String.format("Temp diff [%d]", diff));
                if (diff > largestDiff) {
                    largestDiff = diff;
                    low = i;
                    high = j;
                }
            }
        }
        System.out.println("count: " + count);
        return new int[]{low, high};
    }
}
