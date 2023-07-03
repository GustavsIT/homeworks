package io.codelex.collections.practice.phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.putNumber("Gustavs", "1122334455");
        phoneDirectory.putNumber("Martins", "66778899");
        phoneDirectory.putNumber("Andris", "01234567");

        System.out.println("Gustavs number: " + phoneDirectory.getNumber("Gustavs"));
        System.out.println("Martins number: " + phoneDirectory.getNumber("Martins"));
        System.out.println("Andris number: " + phoneDirectory.getNumber("Andris"));
        System.out.println("Random's number: " + phoneDirectory.getNumber("Random"));
    }
}
