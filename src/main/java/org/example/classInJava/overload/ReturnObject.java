package org.example.classInJava.overload;

public class ReturnObject {

    public static void main(String[] args) {
        Test ob1 = new Test(2);
        Test ob2;
        ob2 = ob1.incrementByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrementByTen();
        System.out.println("ob2.a after second incrementByTe: " + ob2.a);
    }
}
