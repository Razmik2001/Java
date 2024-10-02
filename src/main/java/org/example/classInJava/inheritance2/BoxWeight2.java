package org.example.classInJava.inheritance2;

public class BoxWeight2 extends Box {
    public double weight;

    public BoxWeight2(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public BoxWeight2(BoxWeight2 ob) {
        super(ob);
        this.weight = ob.weight;
    }

    public BoxWeight2() {
        super();
        weight = 0.0;
    }

    public BoxWeight2(double len, double weight) {
        super(len);
        this.weight = weight;
    }
}
