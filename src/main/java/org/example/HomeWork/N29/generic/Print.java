package org.example.HomeWork.N29.generic;

import java.util.List;

public class Print <T extends  Number>{
    static public void PrintNumber(List<? extends Number> numbers){
        for(Number i: numbers){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> iArr = List.of(1, 2, 3);
        List<Double> dArr = List.of(1.2,5.5,2.3,4.5);
        List<Float> fArr = List.of(1.2F,5.5F,2.3F,4.5F);

        Print.PrintNumber(iArr);
        Print.PrintNumber(dArr);
        Print.PrintNumber(fArr);
    }
}
