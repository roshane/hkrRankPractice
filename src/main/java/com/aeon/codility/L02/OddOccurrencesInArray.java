package com.aeon.codility.L02;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by roshane on 8/11/18.
 */
public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] a = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(a));
    }

    public static int solution(int[] A) {
        Map<Integer, Integer> eCount = new HashMap<>();
        for (int i : A) {
            if (eCount.containsKey(i)) {
                eCount.put(i, eCount.get(i) + 1);
            } else {
                eCount.put(i, 1);
            }
        }
        int answer = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> e : eCount.entrySet()) {
            if (e.getValue() % 2 != 0) {
                answer = e.getKey();
            }
        }
        return answer;
//        return eCount.entrySet().stream()
//                .filter(e -> e.getValue() % 2 != 0)
//                .map(Map.Entry::getKey)
//                .findFirst()
//                .get();
    }
}
