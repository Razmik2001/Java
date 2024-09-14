package org.example.HomeWork.N17;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Task1\n");
        System.out.println("sum of int array {1, 4, 6, 7, 8, 9, 2, 1} is: " + Sum.sum(1, 4, 6, 7, 8, 9, 2, 1));
        System.out.println("sum of double array {13.3, 4, 6, 7.1, 8, 9, 2, 1} is: " + Sum.sum(13.3, 4, 6, 7.1, 8, 9, 2, 1));

        System.out.println("\nTask2\n");

        AverageScore.printDetails("Razmik", 45, 12, 90, 2, 45);
        AverageScore.printDetails("Juli", 78, 92, 90, 82, 75);

        System.out.println("\nTask3\n");

        System.out.println(ConcatenateStrings.concatenateStrings1(2, "hello", "world"));
        System.out.println(ConcatenateStrings.concatenateStrings1(3, "Java"));

        System.out.println();

        System.out.println(ConcatenateStrings.concatenateStrings2(2, "hello", "world"));
        System.out.println(ConcatenateStrings.concatenateStrings2(3, "Java"));

        System.out.println("\nTask4\n");

        DisplayContainsLength.display(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2);
        DisplayContainsLength.display("Hello", "my", "friends");

        System.out.println("\nTask6\n");

        System.out.println("The max value of {1, 4, 6, 7, 8, 9, 2, 1} is : " + FindMax.findMax(1, 4, 6, 7, 8, 9, 2, 1));
        System.out.println("The max value of {13.3, 4, 6, 7.1, 8, 9, 2, 1} is : " + FindMax.findMax(13.3, 4, 6, 7.1, 8, 9, 2, 1));
    }
}
