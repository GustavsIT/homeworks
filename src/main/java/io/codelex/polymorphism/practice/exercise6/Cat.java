package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    public String breed;

    public Cat(String animalName, String animalType, double animalWeight, Integer foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                getBreed();
    }
}

