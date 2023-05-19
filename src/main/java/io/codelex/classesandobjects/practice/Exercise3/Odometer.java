package io.codelex.classesandobjects.practice.Exercise3;

public class Odometer {
    private int currentMileage;

    public Odometer(FuelGauge fuelGauge) {
        currentMileage = 0;
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public void incrementMileage() {
        currentMileage++;
        if (currentMileage > 999999) {
            currentMileage = 0;
        }
    }

    public void workWithFuelGauge(FuelGauge fuelGauge) {
        if (currentMileage % 10 == 0) {
            fuelGauge.decrementFuel();
        }
    }
}
