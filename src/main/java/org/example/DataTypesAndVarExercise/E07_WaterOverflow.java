package org.example.DataTypesAndVarExercise;

import java.util.Scanner;

public class E07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int totalLiters = 0;
        int capacity = 255;
        for (int i = 1; i <= n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            totalLiters += liters;
        }
        if (totalLiters > capacity) {
            System.out.printf("Insufficient capacity!%n%d", totalLiters);
        } else {
            System.out.println(totalLiters);
        }
    }
}
