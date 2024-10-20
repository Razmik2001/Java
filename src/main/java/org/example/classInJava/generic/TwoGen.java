package org.example.classInJava.generic;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void showType() {
        System.out.println("Type T: " + ob1.getClass());
        System.out.println("Type V: " + ob2.getClass());
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }
}
