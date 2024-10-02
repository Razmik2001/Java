package org.example.classInJava.inheritance1;

public class BoxWeightDemo {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 12.4, 12.9, 8);
        BoxWeight myBox2 = new BoxWeight(20, 22.7, 25, 8.5);

        double vol;
        vol = myBox1.getVolume();
        System.out.println("myBox1 volume is " + vol);
        System.out.println("myBox1 weight is " + myBox1.weight);

        vol = myBox2.getVolume();
        System.out.println("myBox2 volume is " + vol);
        System.out.println("myBox2 weight is " + myBox2.weight);
    }
}
