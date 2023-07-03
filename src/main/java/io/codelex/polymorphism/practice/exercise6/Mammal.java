package io.codelex.polymorphism.practice.exercise6;

abstract public class Mammal extends Animal {
    public static String livingRegion;


    public Mammal(String animalName, String animalType, double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    public static String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                Mammal.livingRegion;
    }
}
