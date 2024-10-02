package org.example.classInJava.encapsulation;

public class Outer {
    int outerX = 10001;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        static int v = 20;

        void display() {
            System.out.println("outerX == " + outerX);
        }
    }

    void show() {
        System.out.println(Inner.v);
    }

    void test1() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("outerX == " + outerX);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
