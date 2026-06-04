package org.example.MethodsExercise;

import java.util.Scanner;

public class E07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long firstFactorial = calculateFactorial(firstNum);
        long secondFactorial = calculateFactorial(secondNum);

        double result = firstFactorial * 1.0 / secondFactorial;
        System.out.printf("%.2f", result);
    }
    private static long calculateFactorial (int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
