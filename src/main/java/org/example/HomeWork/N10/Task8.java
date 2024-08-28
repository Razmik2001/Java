package org.example.HomeWork.N10;

public class Task8 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 2, 3},
                {4, 5, 0},
                {7, 0, 9},
        };
        int countOfZero = 0;
        for (int[] tD : matrix) {
            for (int oD : tD) {
                if (oD == 0) {
                    countOfZero++;
                }
            }
        }
        System.out.println("in matrix you have " + countOfZero +" zero");
    }
}
