package com.aeon;

/**
 * Created by roshane on 7/1/18.
 */
public class A {
    protected String aName = A.class.getName();
}

class B extends A {
    protected String aName = B.class.getName();
    int[] a;

    public static void main(String[] args) {
        int[] a;
        A b = new B();
//        System.out.println(a);
        System.out.println(((B) b).aName);
    }
}

class Runner {
    String name = Runner.class.getName();

    void doSomething() {
        String name = "uk123456#";
        System.out.println(name);
    }

    public static void main(String[] args) {
        String name = "some name";
        System.out.println(name);
    }
}