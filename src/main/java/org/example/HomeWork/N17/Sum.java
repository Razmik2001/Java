package org.example.HomeWork.N17;

public class Sum {
    static int sum(int... arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    static double sum(double... arr) {
        double sum = 0;
        for (double x : arr) {
            sum += x;
        }
        return sum;
    }
}
