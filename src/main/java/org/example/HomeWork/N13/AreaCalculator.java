package org.example.HomeWork.N13;

import org.example.HomeWork.N12.Main;

public class AreaCalculator {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double base, double height, boolean isTriangle) {
        return base * height / 2;
    }

    public double calculateArea(double side1, double side2, double side3) {
        double p = side1 + side2 + side3;
        p /= 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}
