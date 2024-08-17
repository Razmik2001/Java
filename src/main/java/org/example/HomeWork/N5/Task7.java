package org.example.HomeWork.N5;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num:");
        byte num = sc.nextByte();
        if(num < 1 || num > 7)
        {
            System.out.println("you put wrong number");
        } else if (num == 1) {
            System.out.println("Monday");
        } else if (num == 2) {
            System.out.println("Tuesday");
        } else if (num == 3) {
            System.out.println("Wednesday");
        } else if (num == 4) {
            System.out.println("Thursday");
        } else if (num == 5) {
            System.out.println("Friday");
        } else if (num == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
    }
}
