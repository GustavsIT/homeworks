package io.codelex.oop.shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("rectangle area:" + rectangle.calculateArea());
        System.out.println("rectangle perimeter:" + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(6, 3);
        System.out.println("triangle area:" + triangle.calculateArea());
        System.out.println("triangle perimeter:" + triangle.calculatePerimeter());

        Hexagon hexagon = new Hexagon(5);
        System.out.println("hexagon area:" + hexagon.calculateArea());
        System.out.println("hexagon perimeter:" + hexagon.calculatePerimeter());

        Qube qube = new Qube(5);
        System.out.println("qube area:" + qube.calculateArea());
        System.out.println("qube perimeter:" + qube.calculatePerimeter());
        System.out.println("qube volume:" + qube.calculateVolume());

        Cone cone = new Cone(10, 3);
        System.out.println("cone area:" + cone.calculateArea());
        System.out.println("cone doesn't have perimeter");
        System.out.println("cone volume:" + cone.calculateVolume());

    }
}
