package io.codelex.polymorphism.practice.exercise1;

public class Toyota implements CarBoosted {
    private Integer currentSpeed = 0;
    private String name;

    public Toyota(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speedUp() {
        currentSpeed += 10;
    }

    public void slowDown() {
        currentSpeed -= 10;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 50;
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "name='" + name + '\'' +
                '}';
    }
}
