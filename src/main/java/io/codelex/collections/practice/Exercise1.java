package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Audi");
        arrayList.add("BMW");
        arrayList.add("Honda");
        arrayList.add("Mercedes");
        arrayList.add("Volkswagen");
        arrayList.add("Mercedes");
        arrayList.add("Tesla");
        System.out.println(arrayList);

        HashSet<String> cars = new HashSet<>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Mercedes");
        cars.add("Volkswagen");
        cars.add("Mercedes");
        cars.add("Tesla");
        System.out.println(cars);

        HashMap<String, String> carsOrigination = new HashMap<String, String>();
        carsOrigination.put("Audi", "Germany");
        carsOrigination.put("BMW", "Germany");
        carsOrigination.put("Honda", "Japan");
        carsOrigination.put("Mercedes", "Germany");
        carsOrigination.put("Volkswagen", "Germany");
        carsOrigination.put("Mercedes", "Germany");
        carsOrigination.put("Tesla", "USA");
        System.out.println(carsOrigination);
    }
}
