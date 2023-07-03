package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {
    public String livingRegion;

    public Tiger(String animalName, String animalType, double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("roaaaawwr");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            super.eat(food);
        } else {
            System.out.println("Tigers are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                Mammal.getLivingRegion();
    }
}
