package io.codelex.typesandvariables.practice;

public class VariablesAndNames {
    public static void main(String[] args) {
        int cars, drivers, passengers, carsNotDriven, carsDriven, seatsInACar, carpoolCapacity;
        double averagePassengersPerCar;

        cars = 100; //cars
        seatsInACar = 4; //seats in a car
        drivers = 30; // drivers
        passengers = 90; // passengers
        carsNotDriven = cars - drivers; // free cars
        carsDriven = drivers; // cars driven at the moment
        carpoolCapacity = carsDriven * seatsInACar; // carpool capacity
        averagePassengersPerCar = passengers / carsDriven; // average passengers per car

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.printf("We need to put about %.2f in each car.", averagePassengersPerCar);
    }
}