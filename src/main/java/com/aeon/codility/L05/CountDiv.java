package com.aeon.codility.L05;

/**
 * Created by roshane on 8/12/18.
 */
public class CountDiv {

    public static void main(String[] args) {


    }

    public int solution(int A, int B, int K) {
        int res = ((B / K) - (A - 1) / K);
        if (A == 0) {
            res += 1;
        }
        return res;
    }
}
