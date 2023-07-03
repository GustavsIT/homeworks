package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements CarBoosted {
    private Integer currentSpeed = 0;
    private String name;

    public Lexus(String name) {
        this.name = name;
    }

    public void speedUp() {
        currentSpeed += 8;
    }

    public void slowDown() {
        currentSpeed -= 8;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lexus{" +
                "name='" + name + '\'' +
                '}';
    }
}
