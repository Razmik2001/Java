package org.example.classInJava.inheritance1;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("print u and j from super class");
        superOb.showIJ();
        System.out.println();
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.println("print i, j, k from sub class");
        subOb.showIJ();
        subOb.showK();

        System.out.println();
        System.out.println("The sum of i, j and k equal is");
        subOb.sum();
    }
}
