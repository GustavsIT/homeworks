package io.codelex.oop.runners;

public class Main {
    public static void main(String[] args) {
        int firstTest = 10;
        int secondTest = 100;
        int thirdTest = 300;
        int fourthTest = 500;
        int fifthTest = 1000;

        Runner fitnessLvl1 = Runner.getFitnessLevel(firstTest);
        System.out.println("first test:" + fitnessLvl1);
        Runner fitnessLvl2 = Runner.getFitnessLevel(secondTest);
        System.out.println("second test:" + fitnessLvl2);
        Runner fitnessLvl3 = Runner.getFitnessLevel(thirdTest);
        System.out.println("third test:" + fitnessLvl3);
        Runner fitnessLvl4 = Runner.getFitnessLevel(fourthTest);
        System.out.println("fourth test:" + fitnessLvl4);
        Runner fitnessLvl5 = Runner.getFitnessLevel(fifthTest);
        System.out.println("fifth test:" + fitnessLvl5);
    }
}
