package org.example.HomeWork.N5;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num:");
        double num = sc.nextDouble();
        if(num % 5 == 0 && num % 11 == 0)
        {
            System.out.println("number is divisible by both 5 and 11");
        }
        else {
            System.out.println("number isn't divisible by both 5 and 11");
        }
        sc.close();
    }
}
