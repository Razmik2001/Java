package org.example.classInJava.inheritance1;

public class B extends A {

    public int k;

    public void showK() {
        System.out.println("k = " + k);
    }

    public void sum() {
        System.out.print("i + j + k = " + (i + j + k));
    }
}