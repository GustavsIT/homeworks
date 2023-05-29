package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer {
    private int batteryLife;

    public Laptop(String processor, String ram, String graphicCard, String company, String model, int batteryLife) {
        super(processor, ram, graphicCard, company, model);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return batteryLife == laptop.batteryLife;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryLife);
    }

    @Override
    public String toString() {
        return super.toString() + " Laptop{" +
                "batteryLife=" + batteryLife +
                '}';
    }
}
