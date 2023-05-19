package io.codelex.classesandobjects.practice.car;

import java.util.Scanner;

public class Car {
    private double startOdo;
    private double endingOdo;
    private double liters;

    Car(double startOdo, double endingOdo, double liters) {
        this.startOdo = startOdo;
        this.endingOdo = endingOdo;
        this.liters = liters;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;

        System.out.print("Enter odometer's start value:");
        startKilometers = scan.nextDouble();

        System.out.print("Enter odometer's end value: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car = new Car(startKilometers, endKilometers, liters);

        System.out.println("Kilometers per liter are " + car.calculateConsumption());

        if (car.hasHog()) {
            System.out.println("Your car consumes a lot of fuel!");
        }
        if (car.economyCar()) {
            System.out.println("Economy car!");
        }
    }

    public double calculateConsumption() {
        double consumption = (endingOdo - startOdo) / liters;
        return consumption;
    }

    public boolean hasHog() {
        double consumption = calculateConsumption();
        return consumption > 15.0;
    }

    public boolean economyCar() {
        double consumption = calculateConsumption();
        return consumption < 5.0;
    }
}