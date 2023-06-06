package io.codelex.oop.Exercise1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5, 6);
        System.out.println("rectangle numSides: " + rectangle.getNumSides());
        System.out.println("rectangle perimeter : " + rectangle.getPerimeter());
        System.out.println("rectangle area : " + rectangle.getArea());

        Triangle triangle = new Triangle(3, 6, 8);
        System.out.println("triangle numSides: " + triangle.getNumSides());
        System.out.println("triangle perimeter : " + triangle.getPerimeter());
        System.out.println("triangle area : " + triangle.getArea());


    }
}
