package org.example.HomeWork.N30;

import java.util.ArrayList;

public class ArrListDinSize {
    public static void main(String[] args) {
        ArrayList<Integer> aOb = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            aOb.add(i);
            System.out.println("i = " + i + "\t size = " + aOb.size());
        }

    }
}
