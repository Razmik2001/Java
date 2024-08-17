package org.example.HomeWork.N4;

public class Task3 {
    public static void main(String[] args) {
        int val = 4524;
        System.out.println(val/10 % 2);
        if (val/10 % 2 == 0)
        {
            System.out.println("the third digit in a number is an even number");
        }
        else
        {
            System.out.println("the third digit in a number is an odd number");
        }
    }
}
