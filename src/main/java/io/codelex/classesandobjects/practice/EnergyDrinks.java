package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    static final int NUMBER_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {


        System.out.println("Total number of people surveyed: " + NUMBER_SURVEYED);


        double energyDrinkers = calculateEnergyDrinkers(NUMBER_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " people bought at least one energy drink");


        double preferCitrus = calculatePreferCitrus(NUMBER_SURVEYED);
        System.out.println(preferCitrus + " of those prefer citrus flavored energy drinks.");

    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return numberSurveyed * PURCHASED_ENERGY_DRINKS;
    }

    public static double calculatePreferCitrus(int numberSurveyed) {

        return numberSurveyed * PREFER_CITRUS_DRINKS;
    }
}