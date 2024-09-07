package org.example.HomeWork.N13;

public class MaxValueFinderDemo {
    public static void main(String[] args) {
        MaxValueFinder finder = new MaxValueFinder();

        int maxInt = finder.findMax(10, 5);
        System.out.println("Maximum integer between 10 and 5 is: " + maxInt);

        double maxDouble = finder.findMax(7.5, 8.2);
        System.out.println("Maximum double between 7.5 and 8.2 is: " + maxDouble);

        int maxIntThree = finder.findMax(3, 8, 5);
        System.out.println("Maximum integer between 3, 8, and 5 is: " + maxIntThree);
    }
}
