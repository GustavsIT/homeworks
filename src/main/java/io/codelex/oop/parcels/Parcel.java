package io.codelex.oop.parcels;

import java.util.Objects;

public class Parcel implements Validatable {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getxLength() {
        return xLength;
    }

    public void setxLength(int xLength) {
        this.xLength = xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public void setyLength(int yLength) {
        this.yLength = yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public void setzLength(int zLength) {
        this.zLength = zLength;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parcel parcel = (Parcel) o;
        return xLength == parcel.xLength && yLength == parcel.yLength && zLength == parcel.zLength && Float.compare(parcel.weight, weight) == 0 && isExpress == parcel.isExpress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLength, yLength, zLength, weight, isExpress);
    }

    @Override
    public boolean validate() {
        if (xLength < 30 && yLength < 30 && zLength < 30) {
            System.out.println("error, each dimension should be at least 30!");
            return false;
        }
        int sumDim = xLength + yLength + zLength;
        if (sumDim > 300) {
            System.out.println("error, sum of dimensions cannot exceed 300!");
            return false;
        }
        float weightLimit = isExpress ? 15.0f : 30.0f;
        if (weight > weightLimit) {
            System.out.println("The weight exceeds the allowed limit.");
            return false;
        }
        return true;
    }
}
