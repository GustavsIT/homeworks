package io.codelex.oop.persons;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2015, 5, 5);
        Employee employee = new Employee("John", "Brown", "112233", 25, "Accountant", startDate);
        System.out.println(employee.getInfo());


        Customer customer = new Customer("Peter", "Brown", "445566 ", 30, "CID1234", 10);
        System.out.println(customer.getInfo());


    }
}
