package org.example.HomeWork.N17;

public class FindMax {
    static int findMax(int... arr) {
        int max = arr[0];
        for (int i : arr) {
            max = i > max ? i : max;
        }
        return max;
    }

    static double findMax(double... arr) {
        double max = arr[0];
        for (double i : arr) {
            max = i > max ? i : max;
        }
        return max;
    }
}
