package io.codelex.oop.shapes;

import java.util.Objects;

public class Qube extends Shape3D {

    private int edge;

    public Qube(int edge) {
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
        Qube qube = (Qube) o;
        return edge == qube.edge;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edge);
    }

    @Override
    public int calculatePerimeter() {
        return 12 * edge;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(edge, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(edge, 3);
    }

    @Override
    public String toString() {
        return "Qube{" +
                "edge=" + edge +
                '}';
    }
}
