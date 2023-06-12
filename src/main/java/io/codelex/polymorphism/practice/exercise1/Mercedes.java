package io.codelex.polymorphism.practice.exercise1;

public class Mercedes implements Car {
    private Integer currentSpeed = 0;
    private String name;

    public Mercedes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void speedUp() {
        currentSpeed += 11;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 11;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "name='" + name + '\'' +
                '}';
    }
}
