package io.codelex.polymorphism.practice.exercise4;

public class Commision extends Hourly {
    public double totalSales;
    public double commissionRate;


    public Commision(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double hourlyPay = super.pay();
        double commissionPay = totalSales * commissionRate;
        totalSales = 0;
        return hourlyPay + commissionPay;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += totalSales;
        return result;
    }

}
