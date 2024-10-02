package org.example.classInJava.encapsulation;

public class PassArray {

    static void test(int[] arr) {
        System.out.println("Elements count of arr is " + arr.length);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {};
        test(arr1);
        test(arr2);
        test(arr3);
    }
}
