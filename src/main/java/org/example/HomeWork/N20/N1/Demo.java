package org.example.HomeWork.N20.N1;

public class Demo {
    public static void main(String[] args) {
        Circle ob1 = new Circle();
        Rectangle ob2 = new Rectangle();
        Shape ref;

        ref = ob1;
        ref.draw();
        System.out.println();

        ref = ob2;
        ref.draw();
    }
}
