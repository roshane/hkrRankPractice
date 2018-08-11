package com.aeon;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by roshane on 6/26/18.
 */

class Mailer implements AutoCloseable {
    Mailer to() {
        System.out.println("To");
        return this;
    }

    Mailer body() {
        System.out.println("Body");
        return this;
    }

    Mailer subject() {
        System.out.println("Subject");
        return this;
    }

    static void send(Consumer<Mailer> consumer) {
        try (Mailer mailer = new Mailer()) {
            consumer.accept(mailer);
            System.out.println("sending mail...!");
        }
    }

    public void close() {
        System.out.println("closing mail resource!");
    }
}

public class ScratchTest01 {

    static void doS(){
        List<Integer> ints= Arrays.asList(1,2,3);
        for(int i : ints){

        }
    }

    static long multiplyNumbers(long a, long b) {
        long result = 0;
        int pos = 0;
        while (a != 0) {
            if ((a & 1) == 1) {
                result += (b << pos);
            }
            pos++;
            a >>>= 1;
        }

        return result;
    }

    static long findClosestComplementBitLocation(long n) {
        long x, y, point = 1;
        x = n & 1;
        y = n & 1;
        while (x == y) {
            x = (n >>> point) & 1;
            point += 1;
        }
        return point;
    }

    static long findSameWeightNumber(long n) {
        long point = findClosestComplementBitLocation(n);
        long BITMASK = (1L << (point - 1)) | (1L << (point - 2));
        return n ^ BITMASK;
    }

    public static void main(String[] args) {
        System.out.println(multiplyNumbers(13,2));
        System.out.println(multiplyNumbers(2,13));
    }
}