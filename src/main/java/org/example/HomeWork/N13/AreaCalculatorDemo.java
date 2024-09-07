package org.example.HomeWork.N13;

public class AreaCalculatorDemo {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Area of circle: " + calculator.calculateArea(5.0));

        System.out.println("Area of rectangle: " + calculator.calculateArea(4.0, 6.0));

        System.out.println("Area of triangle: " + calculator.calculateArea(3.0, 4.0, true));

        System.out.println("Area of triangle (Heron's formula): " + calculator.calculateArea(5.0, 3.0, 4.0));
    }
}
