package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

abstract public class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    Integer foodEaten;

    public Animal(String animalName, String animalType, double animalWeight, Integer foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public void makeSound() {
    }

    public void eat(Food food) {
        System.out.println(getAnimalType() + " is eating " + food.getClass().getSimpleName() + ".");
        this.foodEaten += food.getQuantity();
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return getAnimalType() + "[" +
                getAnimalName() + ", " +
                decimalFormat.format(getAnimalWeight()) + ", " +
                getFoodEaten() + "]";
    }
}