package org.example.classInJava.encapsulation;

public  class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        outer.show();
        outer.test1();
        System.out.println(Outer.Inner.v);
    }
}
