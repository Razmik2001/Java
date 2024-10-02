package org.example.classInJava.encapsulation;

public class VarArgs2 {
    void test(String msg, double... v) {
        System.out.println(msg);
        for (double x : v) {
            System.out.println(x + " ");
        }
        System.out.println();
    }
}
