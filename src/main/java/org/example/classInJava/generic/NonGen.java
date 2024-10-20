package org.example.classInJava.generic;

public class NonGen {
    Object ob;

    NonGen(Object ob) {
        this.ob = ob;
    }

    public Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("T type is " + ob.getClass().getName());
    }
}
