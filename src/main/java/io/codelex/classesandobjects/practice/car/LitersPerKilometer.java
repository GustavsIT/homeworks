package io.codelex.classesandobjects.practice.car;

class LitersPerKilometer {
    public static void main(String[] args) {


        Car car = new Car(150, 1500, 8);
        Car car2 = new Car(50, 2000, 10);
        double carConsumption = car.calculateConsumption();
        double car2Consumption = car2.calculateConsumption();


        System.out.println("Car consumption is: " + carConsumption);
        System.out.println("Car2 consumption is: " + car2Consumption);


    }
}

