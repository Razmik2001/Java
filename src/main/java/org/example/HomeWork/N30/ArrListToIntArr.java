package org.example.HomeWork.N30;

import java.util.ArrayList;

public class ArrListToIntArr {
    public static void main(String[] args) {
        ArrayList<Integer> aOb = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            aOb.add(i);
        }

        int size = aOb.size();
        Integer[] iOb = new Integer[size];

        for (int i = 0; i < size; i++) {
            iOb[i] = aOb.get(i);
        }

        System.out.println(aOb);
        for (int i = 0; i < size; i++) {
            System.out.print(iOb[i] + " ");
        }
    }
}
