package io.codelex.classesandobjects.practice.car;

import java.util.Scanner;

class LitersPerKilometer {
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

        Car car1 = new Car(10, 1000, 5);
        double car1Consumption = car1.calculateConsumption();
        System.out.println("Car1 consumption is: " + ca1rConsumption);

        Car car2 = new Car(50, 1000, 20);
        double car2Consumption = car2.calculateConsumption();
        System.out.println("Car2 consumption is: " + car2Consumption);

    }


}


