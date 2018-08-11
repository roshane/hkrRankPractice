package com.aeon.other;

/**
 * Created by roshane on 6/16/18.
 */
public class BitOperations {

    public static void main(String[] args) {
        int[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9, Integer.MAX_VALUE};

//        for (int i = 0; i < ia.length; i++) {
//            System.out.println(String.format("checking set bits of [%d] result: [%d]", ia[i], getSetBitCount(ia[i])));
//            System.out.println(String.format("A checking parity of [%d] result: [%d]", ia[i], parity(ia[i])));
//            System.out.println(String.format("B checking parity of [%d] result: [%d]", ia[i], parityA(ia[i])));
//            System.out.println("\n");
//        }
//        for (int i : ia) {
//            System.out.println(String.format("[%d] binary => [%s]", i, toBinaryString(i)));
//            System.out.println(String.format("findClosestIntegerWithSameWeight(%d) %d",i,findClosestIntegerWithSameWeight(i)));
//            System.out.println(String.format(" closestlntSameBitCount(%d) %d",i,closestlntSameBitCount(i)));
//        }

//        System.out.println(swapBits(73, 1, 6));
        int x = 11;



//        System.out.println(String.format("closestComplementBitLocation(%d) ",x) + closestComplementBitLocation(x));
        System.out.println(String.format("findClosestIntegerWithSameWeight(%d) ", x) + findClosestIntegerWithSameWeight(x));
        System.out.println(String.format("closestIntSameBitCount(%d) ", x) + closestIntSameBitCount(x));
    }

    private static String toBinaryString(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n & 1);
            n >>>= 1;
        }
        return sb.reverse().toString();
    }

    private static int parity(int n) {
        int result = 0;
        while (n != 0) {
            result += n & 1;
            n = n >>> 1;
        }
        return result % 2;
    }

    private static String reverseBits(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n & 1);
            n >>= 1;
        }
        return sb.toString();
    }

    /**
     * bit count start from `0`, like array index
     *
     * @param n number
     * @param i bit position
     * @param j bit position
     * @return integer value after swapping the bits
     */
    private static int swapBits(int n, int i, int j) {
        int result = n;
        if (((n >>> i) & 1) != ((n >>> j) & 1)) {
            int BITMASK = (1 << i) | (1 << j);
            System.out.println("should swap");
            result ^= BITMASK;
        }
        return result;
    }


    private static int parityA(int n) {
        int result = 0;
        while (n != 0) {
            result ^= n & 1;
            n = n >>> 1;
        }
        return result;
    }

    private static int getSetBitCount(int n) {
        int count = 0;

        while (n != 0) {
            count += (n & 1);
            n = n >>> 1;
        }
        return count;
    }

    private static int closestComplementBitLocation(long n) {
        int point = 1;
        long x, y;
        x = n & 1;
        y = n & 1;
        while (x == y) {
            x = (n >>> point) & 1;
            point += 1;
        }
        return point;
    }

    private static long findClosestIntegerWithSameWeight(long n) {
        int closestComplementBitLocation = closestComplementBitLocation(n);
        long BITMASK = (1L << (closestComplementBitLocation - 1)) | (1L << (closestComplementBitLocation - 2));
        return n ^ BITMASK;
    }

    public static long closestIntSameBitCount(long x) { // x is assumed to be non-negative so we know the leading bit is .
        // We // restrict to our attention to 63 LSBs.
        int NUM_UNSIGN_BITS = 63;
        for (int i = 0; i < NUM_UNSIGN_BITS - 1; ++i) {
            if ((((x >>> i) & 1) != ((x >>> (i + 1)) & 1))) {
                x ^= (1L << i) | (1L << (i + 1));
                // Swaps bit-i and bit-(i + 1).
                return x;
            }
        }
        // Throw error if all bits of x are <9 or 1.
        throw new IllegalArgumentException("All bits are ® or 1");
    }
}

//        checking set bits of [1] result: [1]
//        checking set bits of [2] result: [1]
//        checking set bits of [3] result: [2]
//        checking set bits of [4] result: [1]
//        checking set bits of [5] result: [2]
//        checking set bits of [6] result: [2]
//        checking set bits of [7] result: [3]
//        checking set bits of [8] result: [1]
//        checking set bits of [9] result: [2]
