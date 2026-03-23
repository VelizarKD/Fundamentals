package org.example.DataTypesAndVarExercise;

import java.util.Scanner;

public class E09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int totalSpice = 0;

        while (startingYield >= 100) {
            days++;
            totalSpice += startingYield;
            totalSpice -= 26;
            startingYield -= 10;
        }
        if (totalSpice >= 26) {
            totalSpice -=26;
        } else {
            totalSpice -= 0;
        }

        System.out.println(days);
        System.out.println(totalSpice);
    }
}
