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