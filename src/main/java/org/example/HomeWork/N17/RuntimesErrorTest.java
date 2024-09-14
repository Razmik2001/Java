package org.example.HomeWork.N17;

public class RuntimesErrorTest {
    static void test1(int r, int... v) {
        System.out.println("1");
    }

    static void test1(int... v) {
        System.out.println("2");
    }

    static void test1(int r) {
        System.out.println("3");
    }
}
