package com.aeon.other;

import java.util.Arrays;

/**
 * Created by roshane on 8/11/18.
 */
public class Prefixproduct {

    public static void main(String[] args) {
        int[] a = {3, 1, 6, 4};
        int[] ps = {10, 20, 10, 5, 15};
//        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(prefixSum(ps)));

    }

    static int[] prefixSuffixProd(int[] input) {

        int[] prefixProd = new int[input.length];
        int[] suffixProd = new int[input.length];

        int prod = 1;
        for (int i = 0; i < input.length; i++) {
            prefixProd[i] = prod;
            prod *= input[i];
        }
        prod = 1;
        for (int i = input.length - 1; i >= 0; i--) {
            prod *= input[i];
            suffixProd[i] = prod;
        }

        return prefixProd;
    }

    static int[] prefixSum(int[] input) {
        int[] prefixSum = new int[input.length];
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
            prefixSum[i] = sum;
        }
        return prefixSum;
    }
}
