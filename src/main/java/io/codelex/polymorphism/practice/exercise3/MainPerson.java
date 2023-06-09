package io.codelex.polymorphism.practice.exercise3;

public class MainPerson {
    public static void main(String[] args) {

        Student student = new Student("Gustavs", "Petris", "Rigas iela 1", 123, 99.9);
        student.display();
        Employee employee = new Employee("John", "Doe", "America Street 1", 456, "JAVA developer");
        employee.display();

    }
}
