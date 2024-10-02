package org.example.classInJava.inheritance1;

public class Box {

    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() {
        this.width = 0.0;
        this.height = 0.0;
        this.depth = 0.0;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double getVolume() {
        return depth * width * height;
    }

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
}