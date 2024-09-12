package org.example.HomeWork.N16;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Set radius of circle: ");
        radius = sc.nextDouble();
        System.out.println("The area of circle with radius = " + radius + " is : " + MathUtility.calculateCircleArea(radius));
        System.out.print("Set another radius of circle: ");
        radius = sc.nextDouble();
        System.out.println("The area of circle with radius = " + radius + " is : " + MathUtility.calculateCircleArea(radius));
    }
}
