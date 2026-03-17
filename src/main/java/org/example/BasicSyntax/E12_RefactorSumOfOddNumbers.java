package org.example.BasicSyntax;

import java.util.Scanner;

public class E12_RefactorSumOfOddNumbers {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 1;
        int sumOddNumbers = 0;
        for (int count = 1; count <= n; count++) {
            System.out.println(number);
            sumOddNumbers += number;
            number += 2;
        }
        System.out.printf("Sum: %d%n", sumOddNumbers);
    }
}