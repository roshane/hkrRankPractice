package com.aeon.codility.L03;

/**
 * Created by roshane on 8/11/18.
 */
public class FrogJmp {
    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }

    public static int solution(int X, int Y, int D) {
        int distance = Y - X;
        return (distance / D) + ((distance % D) > 0 ? 1 : 0);
    }
}
