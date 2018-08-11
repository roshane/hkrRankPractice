package com.aeon.ccInterview;

import java.util.Arrays;
import java.util.List;

/**
 * Created by roshane on 7/2/18.
 */
public class SumList {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(7, 1, 6);
        List<Integer> b = Arrays.asList(5, 9, 2);
        System.out.println(String.format("Adding %s + %s = %d", a, b, sumList(a, b)));
    }

    static int sumList(List<Integer> a, List<Integer> b) {
        int result = 0, va, vb, carry = 0, tot, i = 0;
        while (i != a.size() || i != b.size()) {
            va = i < a.size() ? a.get(i) : 0;
            vb = i < b.size() ? b.get(i) : 0;
            tot = va + vb + carry;
            result += (tot % 10) * (Math.pow(10, i));
            carry = tot >= 10 ? 1 : 0;
            i++;
        }
        return result;
    }
}
