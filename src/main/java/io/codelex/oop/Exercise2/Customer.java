package io.codelex.oop.Exercise2;

public class Customer extends Person {
    private String customerID;
    private int purchaseCount;

    public Customer(String firstName, String lastName, String id, int age, String customerID, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.customerID = customerID;
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getInfo() {
        return firstName + " " + lastName + " " + customerID + "  (" + purchaseCount + " purchases)";
    }
}
