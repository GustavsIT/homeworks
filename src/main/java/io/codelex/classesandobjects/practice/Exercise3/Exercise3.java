package io.codelex.classesandobjects.practice.Exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(fuelGauge);

        for (int i = 0; i < 70; i++) {
            fuelGauge.incrementFuel();
        }
        while (fuelGauge.getCurrentFuel() > 0 && odometer.getCurrentMileage() < 999999) {
            System.out.println("Mileage: " + odometer.getCurrentMileage() + " km");
            System.out.println("Fuel: " + fuelGauge.getCurrentFuel() + " liters");
            odometer.incrementMileage();

        }
    }
}
