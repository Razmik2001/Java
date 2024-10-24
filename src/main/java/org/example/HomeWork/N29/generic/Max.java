package org.example.HomeWork.N29.generic;

import org.example.HomeWork.N17.FindMax;

public class Max {
    public static <T extends Comparable<T>> T FindMax(T[] arr){
        T max = arr[0];
        for (T i : arr){
            max = i.compareTo(max)>0?i:max;
        }
        return max;
    }

    public static void main(String[] args) {
        String[] sOb = {"one","onz","ano"};
        Integer[] iOb = {1,2,3,4,5};
        Double[] dOb = {1.5,-2.5,1.1,52.0};

        System.out.println(FindMax(sOb));
        System.out.println(FindMax(dOb));

        Integer max = FindMax(iOb);
        System.out.println(max);
    }
}
