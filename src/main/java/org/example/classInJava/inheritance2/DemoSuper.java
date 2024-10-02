package org.example.classInJava.inheritance2;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight2 myBox1 = new BoxWeight2(10.2, 23.4, 32.4, 12);
        BoxWeight2 myBox2 = new BoxWeight2(10.2, 9, 3.6, 0.0760);
        BoxWeight2 myBox3 = new BoxWeight2();
        BoxWeight2 myCub = new BoxWeight2(10, 3);
        BoxWeight2 myClone = new BoxWeight2(myBox1);

        double volume;
        volume = myBox1.getVolume();
        System.out.println("The volume of myBox1 is " + volume);
        System.out.println("The wright of myBox1 is " + myBox1.weight);
        System.out.println();

        volume = myBox2.getVolume();
        System.out.println("The volume of myBox2 is " + volume);
        System.out.println("The wright of myBox2 is " + myBox2.weight);
        System.out.println();

        volume = myBox3.getVolume();
        System.out.println("The volume of myBox3 is " + volume);
        System.out.println("The wright of myBox3 is " + myBox3.weight);
        System.out.println();

        volume = myCub.getVolume();
        System.out.println("The volume of myCub is " + volume);
        System.out.println("The wright of myCub is " + myCub.weight);
        System.out.println();

        volume = myClone.getVolume();
        System.out.println("The volume of myClone is " + volume);
        System.out.println("The wright of myClone is " + myClone.weight);
        System.out.println();
    }
}
