package org.example.HomeWork.N17;

public class AverageScore {
    static void printDetails(String name, int... score) {
        System.out.print("The average score of " + name + " is : ");
        int sum = 0;
        for (int x : score) {
            sum += x;
        }
        System.out.println(sum / score.length);
    }
}
