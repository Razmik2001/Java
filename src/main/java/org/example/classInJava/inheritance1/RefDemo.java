package org.example.classInJava.inheritance1;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(12,23,34,34);
        Box plainBox = new Box();
        double vol;
        vol  = boxWeight.getVolume();
        System.out.println("boxWeight volume is " + vol);
        System.out.println("boxWeight weight is " + boxWeight.weight);
        System.out.println();
        plainBox = boxWeight;
        vol = plainBox.getVolume();
        System.out.println(vol);
//        System.out.println("plain Box weight is " + plainBox.weight);
    }
}
