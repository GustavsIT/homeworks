package io.codelex.loops.practice;

public class AsciiFigure {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print("/");
            }
            for (int j = 1; j <= (i - 1) * 4; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }


    }
}
