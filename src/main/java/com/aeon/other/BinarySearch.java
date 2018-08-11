package com.aeon.other;

import java.util.Arrays;

/**
 * Created by roshane on 6/16/18.
 */
public class BinarySearch {

    public static void main(String[] args) {

        int ia[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(ia));
        for (int i : ia) {
            System.out.println(String.format("searching [%d] result [%d]", i, binarySearch(ia, i)));
        }
//        System.out.println(String.format("searching [%d] result [%d]", 12, binarySearch(ia, 12)));
//        System.out.println(String.format("searching [%d] result [%d]", -12, binarySearch(ia, -12)));
    }

    private static int binarySearch(int[] array, int k) {
//        return recursiveBinarySearch(array, k, 0, array.length - 1);
        return loopBinarySearch(array, k, 0, array.length - 1);
    }


    private static int recursiveBinarySearch(int[] array, int key, int lower, int upper) {

        int mid = (lower + upper) / 2;

        if (array[mid] == key) {
            return mid;
        }

        if (lower >= upper) {
            return -1;
        } else if (array[mid] > key) {
            //search left half
            return recursiveBinarySearch(array, key, lower, mid);
        } else {
            //search right half
            return recursiveBinarySearch(array, key, mid + 1, upper);
        }
    }

    //TODO not complete can't find the last element
    private static int loopBinarySearch(int[] array, int key, int lower, int upper) {

        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] > key) {
                //search left
                upper = mid ;
            } else if (array[mid] < key) {
                //search right
                lower = mid + 1;
            }

        }
        return -1;
    }
}
