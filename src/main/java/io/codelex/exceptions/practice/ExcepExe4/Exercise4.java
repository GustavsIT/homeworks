package io.codelex.exceptions.practice.ExcepExe4;

public class Exercise4 {
    public static void main(String[] args) {

        try {
            double d = getInput(args[0]);
            double root = Math.sqrt(d);
            System.out.println("The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter a number as the first parameter.");
        } catch (NonPositiveNumberException e) {
            System.out.println("Result will be an imaginary number.");
        }


    }

    static double getInput(String s) throws NonPositiveNumberException {
        double d = Double.parseDouble(s);
        if (d < 0) {
            throw new NonPositiveNumberException("Input cannot be less than 0");
        }
        return d;
    }
}
