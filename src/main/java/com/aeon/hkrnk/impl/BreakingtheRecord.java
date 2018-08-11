package com.aeon.hkrnk.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by roshane on 6/25/18.
 */
public class BreakingtheRecord {

    public static void main(String[] args) throws InterruptedException {
//        int[] a = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] b = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
//        Thread.sleep(1000);
//        System.out.println(Arrays.toString(breakingRecords(b)));
//        int a=12;
//        System.out.println("a "+a);
        List<Integer> integers = IntStream.range(1, 11).boxed().collect(Collectors.toList());
        {
            int a = 13;
            System.out.println("a " + a);
        }
        {
            int a = 14;
            System.out.println("a " + a);
        }


        int a = 12;
        System.out.println("a " + a);

        System.out.println("\u0063");
        addToList(integers);
        System.out.println(integers);
//        int result = 0;
//        for (int i : integers) {
//            result += i;
//        }

    }

    static <T> void  addToList(List<T> list) {
        list.add((T)"hello");
    }

    static int[] breakingRecords(int[] scores) {


        int currentMin = Integer.MAX_VALUE, currentMax = Integer.MIN_VALUE;
        int[] minArray = new int[scores.length], maxArray = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            if (currentMin > scores[i]) {
                currentMin = scores[i];
            }
            if (currentMax < scores[i]) {
                currentMax = scores[i];
            }
            minArray[i] = currentMin;
            maxArray[i] = currentMax;
        }

        int minChange = 0, maxChange = 0;
        for (int i = 1; i < scores.length; i++) {
            if (minArray[i - 1] != minArray[i]) {
                minChange += 1;
            }
            if (maxArray[i - 1] != maxArray[i]) {
                maxChange += 1;
            }
        }

        return new int[]{maxChange, minChange};
    }

    static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
