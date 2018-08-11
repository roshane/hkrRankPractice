package com.aeon.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by roshane on 6/16/18.
 */
public class TwoSum {

    private static class Pair {
        private int a;
        private int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }

    public static void main(String[] args) {
        int ia[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumArray[] = {10, 11, 13, 15, 20, 3};

        for (int i = 0; i < sumArray.length; i++) {
            System.out.println(String.format("find pair for sum [%d] => %s", sumArray[i], findTwoSum(ia, sumArray[i])));
        }
    }

    private static List<Pair> findTwoSum(int[] array, int sum) {
        Map<Integer, Integer> remainder = new HashMap<>();
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (remainder.containsKey(sum - array[i])) {
                pairs.add(new Pair(i, remainder.get(sum - array[i])));
            }
            remainder.put(array[i],i);
        }
        return pairs;
    }
}
