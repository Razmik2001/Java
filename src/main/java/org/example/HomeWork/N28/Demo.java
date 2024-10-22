package org.example.HomeWork.N28;

public class Demo {
    static <T> void printArr(T[] arr) {
        for (T i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] iArr = {1,2,3,4,5,6};
        Double[] dArr = {1.5,2.5,.36,4.4};
        String[] sArr = {"one","two","three"};

        printArr(iArr);
        printArr(dArr);
        printArr(sArr);
    }
}
