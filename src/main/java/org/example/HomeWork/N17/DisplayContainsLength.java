package org.example.HomeWork.N17;

public class DisplayContainsLength {
    static void display(int... arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("| length is : " + arr.length);
    }

    static void display(String... arr) {
        for (String x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("| length is : " + arr.length);
    }
}
