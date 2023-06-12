package io.codelex.exceptions.practice;

public class Exercise2 {
    public void methodA() throws ArithmeticException {
        methodB();
    }

    public void methodB() throws ArithmeticException {
        methodC();
    }

    public void methodC() throws ArithmeticException {
        int result = 42 / 0;
    }

    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();

        try {
            exercise2.methodA();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            exercise2.methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            exercise2.methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}