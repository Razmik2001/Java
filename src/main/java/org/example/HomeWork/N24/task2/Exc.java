package org.example.HomeWork.N24.task2;

import java.util.Scanner;

public class Exc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Write first number : ");
            String s1 = sc.next();
            int num1 = Integer.parseInt(s1);
            System.out.print("Write second number : ");
            String s2 = sc.next();
            int num2 = Integer.parseInt(s2);
            System.out.println(num1/num2);
        } catch (NumberFormatException e){
            System.out.println("It is not digit " + e);
        } catch (ArithmeticException e){
            System.out.println("dividing in 0 " + e);
        }
    }
}
