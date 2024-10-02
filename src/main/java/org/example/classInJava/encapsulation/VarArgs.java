package org.example.classInJava.encapsulation;

public class VarArgs {

    static void test(int... arr) {
        System.out.println("Elements count of arr is " + arr.length);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test(2);
        test(1, 2, 3, 4, 0);
        test(5, 6, 7, 5, 9, 2, 1, 2, 30);
    }
}
