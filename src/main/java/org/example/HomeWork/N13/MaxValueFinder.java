package org.example.HomeWork.N13;

public class MaxValueFinder {
    public int findMax(int a, int b) {
        return a = a > b ? a : b;
    }

    public double findMax(double a, double b) {
        return a = a > b ? a : b;
    }

    public int findMax(int a, int b, int c) {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }
}
