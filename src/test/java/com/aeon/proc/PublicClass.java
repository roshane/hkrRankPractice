package com.aeon.proc;

import java.util.Arrays;

/**
 * Created by roshane on 6/29/18.
 */
class A {
    protected static void doSomething() {
        System.out.println("doSomething: " + A.class.getName());
    }

    void doSo() {
        System.out.println("doSo: " + A.class.getName());
    }
}

class B extends A {
    protected static void doSomething() {
        System.out.println("doSomething: " + B.class.getName());
    }

    @Override
    void doSo() {
        System.out.println("doSo: " + B.class.getName());
    }
}

public class PublicClass extends ProtectedClass {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
//        a.doSomething();
//        b.doSomething();
//        ((A)b).doSomething();
//        a.doSo();
//        b.doSo();
//        ((A) b).doSo();
        System.out.println(toBinaryString(8));

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.stream(numbers)
                .forEach(n -> {
                    int result = binarySearch(numbers, n);
                    System.out.println(String.format("binarySearch %d  found index %d result %d"
                            , n, result, result > -1 ? numbers[result] : -1));
                });
    }

    static String toBinaryString(int a) {
        if (a == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (a != 0) {
            sb.append(a & 1);
            a = a >>> 1;
        }
        return sb.reverse().toString();

    }

    static int binarySearch(int[] array, int k) {
        int lower, upper, mid, result = -1;
        lower = 0;
        upper = array.length - 1;
        while (lower <= upper) {
            mid = (lower + upper) >> 1;
            if (array[mid] == k) {
                return mid;
            } else if (array[mid] > k) {
                upper = mid;
            } else {
                lower = mid + 1;
            }
        }
        return result;
    }
}
