package io.codelex.oop.shapes;

import java.util.Objects;

public class Rectangle extends Shape {

    private static int height;
    private static int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int calculatePerimeter() {
        return 2 * (height + length);
    }

    @Override
    public double calculateArea() {
        return height * length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.height && length == rectangle.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", length=" + length +
                '}';
    }
}
