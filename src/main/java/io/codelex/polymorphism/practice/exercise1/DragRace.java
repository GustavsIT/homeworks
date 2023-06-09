package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus,
 * extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car audi = new Audi("Audi");
        cars.add(audi);

        Car bmw = new Bmw("BMW");
        cars.add(bmw);

        Car mercedes = new Mercedes("Mercedes");
        cars.add(mercedes);

        Car tesla = new Tesla("Tesla");
        cars.add(tesla);

        CarBoosted lexus = new Lexus("Lexus");
        cars.add(lexus);

        CarBoosted toyota = new Toyota("Toyota");
        cars.add(toyota);

        System.out.println(cars);

        int iteration = 10;
        int iterationBoost = 3;
        Car fastestCar = null;
        int fastestSpeed = 0;
        for (int i = 1; i <= iteration; i++) {
            for (Car car : cars) {
                car.startEngine();
                car.speedUp();
                if (iterationBoost == 3 && car instanceof CarBoosted) {
                    CarBoosted boostedCar = (CarBoosted) car;
                    boostedCar.useNitrousOxideEngine();
                }
                System.out.println(car.getName() + " current speed is " + car.showCurrentSpeed());
                car.slowDown();

                int currentSpeed = Integer.parseInt(car.showCurrentSpeed());
                if (currentSpeed > fastestSpeed) {
                    fastestCar = car;
                    fastestSpeed = Integer.parseInt(car.showCurrentSpeed());
                }
            }

        }
        if (fastestCar != null) {
            System.out.println("Fastest car is " + fastestCar + " and it's speed is " + fastestSpeed);
        } else {
            System.out.println("There is no fastest car cause there are no cars at all!");
        }


    }
}
