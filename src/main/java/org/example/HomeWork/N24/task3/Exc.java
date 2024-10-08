package org.example.HomeWork.N24.task3;


import java.util.Scanner;

public class Exc {
    public static void main(String[] args) {
        int[] c = {1,2,4,3,0,4,1,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Write first number : ");
            String s1 = sc.next();
            int num1 = Integer.parseInt(s1);
            System.out.print("Write second number : ");
            String s2 = sc.next();
            int num2 = Integer.parseInt(s2);
            try {
                num1 = c[num1];
                num2 = c[num2];
            } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println(ex);
            }
            System.out.println(num1/num2);
        } catch (ArithmeticException ex){
            System.out.println(ex);
        } catch (NumberFormatException ex){
            System.out.println("It is not digit " + ex);
        }
    }
}
