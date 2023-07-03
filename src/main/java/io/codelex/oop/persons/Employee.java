package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {
    private String occupation;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String occupation, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.occupation = occupation;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(startedWorking, currentDate);
        return period.getYears();
    }

    @Override
    public String getInfo() {
        int yearsWorked = getWorkExperience();
        return occupation + " " + firstName + " " + lastName + " (" + yearsWorked + " years)";
    }
}
