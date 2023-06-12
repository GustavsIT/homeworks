package io.codelex.oop.Exercise1;

public abstract class Shape {
    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract int getPerimeter();

    public abstract double getArea();
}
