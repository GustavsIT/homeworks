package io.codelex.classesandobjects.practice.Exercise5;

public class Date {
    private int month;
    private int day;
    private int year;

    private Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    private int getMonth() {

        return month;
    }

    private void setMonth(int month) {

        this.month = month;
    }

    private int getDay() {

        return day;
    }

    private void setDay(int day) {

        this.day = day;
    }

    private int getYear() {

        return year;
    }

    private void setYear(int year) {

        this.year = year;
    }

    public static void displayDate(int month, int day, int year) {
        System.out.println(day + "/" + month + "/" + year);
    }
}
