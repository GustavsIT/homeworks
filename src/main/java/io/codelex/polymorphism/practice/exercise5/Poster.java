package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {

    private int dimensions;
    private int numberOfCopies;
    private int costPerCopy;

    public Poster(int fee, int dimensions, int numberOfCopies, int costPerCopy) {
        super(fee);
        this.dimensions = dimensions;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public int getCostPerCopy() {
        return costPerCopy;
    }

    public void setCostPerCopy(int costPerCopy) {
        this.costPerCopy = costPerCopy;
    }

    @Override
    public int cost() {
        return numberOfCopies * costPerCopy;
    }

    @Override
    public String toString() {
        return super.toString()
                + " Poster: Dimensions=" + dimensions
                + ", Number of Copies=" + numberOfCopies
                + ", Cost per Copy=" + costPerCopy;
    }
}
