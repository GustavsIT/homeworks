package io.codelex.oop.shapes;

import java.util.Objects;

public class Cone extends Shape3D {
    private int height;
    private int radius;

    public Cone(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cone cone = (Cone) o;
        return height == cone.height && radius == cone.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, radius);
    }

    @Override
    public int calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2) + Math.PI * radius * height;
    }

    @Override
    public double calculateVolume() {
        return ((double) 1 / 3) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }
}
