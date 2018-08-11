package com.aeon.other;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by roshane on 7/1/18.
 */
public class Sort10Array {

    public static void main(String[] args) {
        int[] a = {1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1};
        System.out.println("before sort: " + Arrays.toString(a));
        sortArray(a);
        System.out.println("after sort: " + Arrays.toString(a));
    }

    static void sortArray(int[] array) {
        int x, y;
        x = 0;
        y = array.length - 1;
        while (x < y) {
            if (array[x] == 0) {
                x++;
            }
            if (array[y] == 1) {
                y--;
            }
            if (array[x] > array[y]) {
                swap(array, x, y);
            }
        }
    }

    static void swap(int[] array, int a, int b) {
        System.out.println("\tswapping index " + String.format("a %d b %d", a, b));
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        System.out.println(Arrays.toString(array));
    }
}
