package io.codelex.oop.parcels;

public class Main {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(35, 37, 39, 11, false);
        System.out.println(parcel.validate());

        Parcel parcel2 = new Parcel(35, 97, 39, 550, true);
        System.out.println(parcel2.validate());

        Parcel parcel3 = new Parcel(5, 7, 9, 11, true);
        System.out.println(parcel3.validate());
    }
}
