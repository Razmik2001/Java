package org.example.classInJava.overload;

public class Box {

    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
        this.width = 0.0;
        this.height = 0.0;
        this.depth = 0.0;
    }

    public Box(double len) {
        width = height = depth = len;
    }

    double getVolume()
    {
        return depth * width * height;
    }

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
}
