package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getCarsWithV12Engine() {
        return cars.stream()
                .filter(car -> car.getEngineType() == Car.EngineType.V12)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsProducedBefore(int year) {
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() < year)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }

    public Car getCheapestCar() {
        return cars.stream()
                .min(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }

    public List<Car> getCarsSortedByPrice(boolean ascending) {
        Comparator<Car> priceComparator = Comparator.comparing(Car::getPrice);
        if (!ascending) {
            priceComparator = priceComparator.reversed();
        }
        return cars.stream()
                .sorted(priceComparator)
                .collect(Collectors.toList());
    }

    public boolean hasCar(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsByManufacturerAndEstablishmentYear(Manufacturer manufacturer, String operator, int year) {
        List<Car> filteredCars;
        switch (operator) {
            case "<" -> filteredCars = cars.stream()
                    .filter(car -> car.getManufacturer().equals(manufacturer) && car.getManufacturer().getYearOfEstablishment() < year)
                    .collect(Collectors.toList());
            case ">" -> filteredCars = cars.stream()
                    .filter(car -> car.getManufacturer().equals(manufacturer) && car.getManufacturer().getYearOfEstablishment() > year)
                    .collect(Collectors.toList());
            case "<=" -> filteredCars = cars.stream()
                    .filter(car -> car.getManufacturer().equals(manufacturer) && car.getManufacturer().getYearOfEstablishment() <= year)
                    .collect(Collectors.toList());
            case ">=" -> filteredCars = cars.stream()
                    .filter(car -> car.getManufacturer().equals(manufacturer) && car.getManufacturer().getYearOfEstablishment() >= year)
                    .collect(Collectors.toList());
            case "=" -> filteredCars = cars.stream()
                    .filter(car -> car.getManufacturer().equals(manufacturer) && car.getManufacturer().getYearOfEstablishment() == year)
                    .collect(Collectors.toList());
            case "!=" -> filteredCars = cars.stream()
                    .filter(car -> car.getManufacturer().equals(manufacturer) && car.getManufacturer().getYearOfEstablishment() != year)
                    .collect(Collectors.toList());
            default -> filteredCars = new ArrayList<>();
        }
        return filteredCars;
    }

    @Override
    public String toString() {
        return "CarService{" +
                "cars=" + cars +
                '}';
    }
}
