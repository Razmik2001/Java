package org.example.HomeWork.N24.task1;

import java.util.Scanner;

public class Exc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Write number : ");
            String num = sc.next();
            Integer.parseInt(num);
        } catch (NumberFormatException e){
            System.out.println("It is not digit " + e);
        }
    }
}