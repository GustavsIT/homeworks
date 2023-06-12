package io.codelex.oop.cars;

public class MainTester {
    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer("BMW", 1916, "Germany");
        System.out.println(manufacturer.getInfo());

        CarService carService = new CarService();

        Car car = new Car("BMW M4", "F82", 42000.23, 2015, manufacturer, Car.EngineType.V8);
        System.out.println(car.getAllInfo());

        Manufacturer ferrari = new Manufacturer("Ferrari", 1947, "Italy");
        Car car2 = new Car("Ferrari 458 Italia", "F458", 250000, 2011, ferrari, Car.EngineType.V8);
        Car car3 = new Car("BMW X5", "G05", 60000, 2020, manufacturer, Car.EngineType.S6);

        carService.addCar(car);
        carService.addCar(car2);
        carService.addCar(car3);

        System.out.println("All cars: " + carService.getAllCars());

        carService.removeCar(car2);

        System.out.println("Cars after some removals: " + carService.getAllCars());

        System.out.println("Cars with a V12 engine: " + carService.getCarsWithV12Engine());

        System.out.println("Cars produced before 1999:" + carService.getCarsProducedBefore(1999));

        System.out.println("Most expensive car:" + carService.getMostExpensiveCar());

        System.out.println("Cheapest car:" + carService.getCheapestCar());

        System.out.println("Cars sorted by price ascending:" + carService.getCarsSortedByPrice(true));

        System.out.println("Cars sorted by price descending:" + carService.getCarsSortedByPrice(false));

        System.out.println("Car is on the list: " + carService.hasCar(car));

        System.out.println("Cars manufactured by BMW:" + carService.getCarsByManufacturer(manufacturer));

        System.out.println("Cars manufactured by manufacturers with the year of establishment > 1900:" + carService.getCarsByManufacturerAndEstablishmentYear(manufacturer, ">", 1900));
    }
}
