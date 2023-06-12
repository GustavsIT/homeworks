package io.codelex.oop.shapes;

import java.util.Objects;

public class Hexagon extends Shape {
    private int edge;

    public Hexagon(int edge) {
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hexagon hexagon = (Hexagon) o;
        return edge == hexagon.edge;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edge);
    }

    @Override
    public int calculatePerimeter() {
        return edge * 6;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3 * Math.pow(edge, 2))) / 2;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "edge=" + edge +
                '}';
    }
}
