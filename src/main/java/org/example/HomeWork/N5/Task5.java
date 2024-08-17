package org.example.HomeWork.N5;
import java.util.Objects;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num1:");
        double num1 = sc.nextDouble();
        System.out.print("num2:");
        double num2 = sc.nextDouble();
        System.out.print("operator:");
        String operator = sc.next();
        if(Objects.equals(operator, "+")) {
            System.out.println("num1 + num2 = " + (num1 + num2));
        } else if (Objects.equals(operator, "-")) {
            System.out.println("num1 - num2 = " + (num1 - num2));
        } else if (Objects.equals(operator, "*")) {
            System.out.println("num1 * num2 = " + (num1 * num2));
        } else if (Objects.equals(operator, "/")) {
            System.out.println("num1 / num2 = " + (num1 / num2));
        } else if (Objects.equals(operator, "%")) {
            System.out.println("num1 % num2 = " + (num1 % num2));
        } else
        {
            System.out.println("it is wrong operator");
        }
        sc.close();
    }
}
