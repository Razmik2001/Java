package org.example.HomeWork.N10;

public class Task7 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };

        int f1 = 0, f2 = 0;
        int l1 = matrix.length - 1;
        int l2 = matrix[0].length - 1;

        while (f1 <= l1 && f2 <= l2) {
            for (int i = f2; i <= l2; i++) {
                System.out.print(matrix[f1][i] + ", ");
            }
            f1++;

            for (int i = f1; i <= l1; i++) {
                System.out.print(matrix[i][l2] + ", ");
            }
            l2--;

            for (int i = l2; i >= f2; i--) {
                System.out.print(matrix[l1][i] + ", ");
            }
            l1--;

            for (int i = l1; i >= f1; i--) {
                System.out.print(matrix[i][f2] + ", ");
            }
            f2++;
        }
    }
}
