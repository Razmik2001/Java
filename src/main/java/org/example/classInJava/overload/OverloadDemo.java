package org.example.classInJava.overload;

public class OverloadDemo {
    public void test() {
        System.out.println("no arguments");
    }


    public void test(int a) {
        System.out.println("a: " + a);
    }

    public void test(int a, int b) {
        System.out.println("a and b " + a + " " + b);
    }

    public double test(double d) {
        System.out.println("double d: " + d);
        return d * d;
    }

    public void test1(short a) {
        System.out.println("short argument method a: " + a);
    }

    public void test1(double d) {
        System.out.println("double argument method d: " + d);
    }
}
