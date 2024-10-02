package org.example.classInJava.overload;

public class OverloadConstructor {
    public static void main(String[] args) {
        Box myBox1 = new Box(10.0, 11.0, 12.0);
        Box myBox2 = new Box();
        Box myBox3 = new Box(12.0);

        double vol1 = myBox1.getVolume();
        double vol2 = myBox2.getVolume();
        double vol3 = myBox3.getVolume();

        System.out.println("vol1: " + vol1);
        System.out.println("vol1: " + vol2);
        System.out.println("vol1: " + vol3);
    }
}
