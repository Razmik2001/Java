package org.example.classInJava.inheritance2;

public class B extends A {
    int i;

    public B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Member i from super class is " + super.i);
        System.out.println("Member i from sub class is " + i);
    }
}
