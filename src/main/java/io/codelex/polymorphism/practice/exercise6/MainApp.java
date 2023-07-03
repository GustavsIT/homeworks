package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] animalInfo = input.split("\\s+");
            String animalType = animalInfo[0];
            String animalName = animalInfo[1];
            double animalWeight = Double.parseDouble(animalInfo[2]);
            String animalLivingRegion = animalInfo[3];
            Animal animal = null;
            if (animalType.equals("Cat")) {
                String catBreed = animalInfo[4];
                animal = new Cat(animalName, animalType, animalWeight, 0, animalLivingRegion, catBreed);
            } else {
                switch (animalType) {
                    case "Mouse" -> animal = new Mouse(animalName, animalType, animalWeight, 0, animalLivingRegion);
                    case "Zebra" -> animal = new Zebra(animalName, animalType, animalWeight, 0, animalLivingRegion);
                    case "Tiger" -> animal = new Tiger(animalName, animalType, animalWeight, 0, animalLivingRegion);
                }
            }
            if (animal != null) {
                animal.makeSound();
                String foodInfo = scanner.nextLine();
                String[] foodData = foodInfo.split("\\s+");
                String foodType = foodData[0];
                int foodQuantity = Integer.parseInt(foodData[1]);
                Food food;
                if (foodType.equals("Meat")) {
                    food = new Meat(foodQuantity);
                } else {
                    food = new Vegetable(foodQuantity);
                }
                animal.eat(food);
                animals.add(animal);
            }
            input = scanner.nextLine();
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (Animal animal : animals) {
            String weight = decimalFormat.format(animal.getAnimalWeight());
            String foodEaten = decimalFormat.format(animal.getFoodEaten());
            System.out.println(animal.getAnimalType() + "[" + animal.getAnimalName() + ", " +
                    (animal instanceof Cat ? ((Cat) animal).getBreed() + ", " : "") +
                    weight + ", " + Mammal.getLivingRegion() + ", " + foodEaten + "]");
        }
    }
}