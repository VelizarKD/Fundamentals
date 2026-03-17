package org.example.DataTypesAndVarExercise;

import java.util.Scanner;

public class E04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int count = 1; count <= n; count++) {
            char symbol = scanner.nextLine().charAt(0);
            sum += (int) symbol;
        }
        System.out.printf("The sum equals: " + sum);
    }
}
