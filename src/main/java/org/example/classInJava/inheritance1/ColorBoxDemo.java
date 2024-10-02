package org.example.classInJava.inheritance1;

public class ColorBoxDemo {
    public static void main(String[] args) {
        ColorBox myBox1 = new ColorBox(10, 12.4, 12.9, "Black");
        ColorBox myBox2 = new ColorBox(20, 22.7, 25, "Red");

        double vol;
        vol = myBox1.getVolume();
        System.out.println("myBox1 volume is " + vol);
        System.out.println("myBox1 color is " + myBox1.color);

        vol = myBox2.getVolume();
        System.out.println("myBox2 volume is " + vol);
        System.out.println("myBox2 color is " + myBox2.color);
    }
}
