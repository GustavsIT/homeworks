package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name, eyes, teeth, hair;
        int age, heightInches, weightLbs;
        double heightCm, weightKg, total;

        name = "Zed A. Shaw";
        age = 35;
        heightInches = 74;  // inches
        weightLbs = 180; // lbs
        heightCm = heightInches * 2.54;
        weightKg = weightLbs * 0.453592;
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";
        total = heightCm + weightKg + age;

        System.out.println("Let's talk about " + name + ".");
        System.out.printf("He's %.2f cm tall.\n", heightCm);
        System.out.printf("He's %.2f kg heavy.\n", weightKg);
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.printf("If I add " + age + ", %.2f, and  %.2f I get %.2f.\n", heightCm, weightKg, total);
    }
}