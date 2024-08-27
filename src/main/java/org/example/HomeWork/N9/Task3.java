package org.example.HomeWork.N9;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5, -2, 8, 10, -4};
        int sum = 8;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.print("(" + arr[i] + ", " + arr[j] + "), ");
                    break;
                }
            }
        }
    }
}
