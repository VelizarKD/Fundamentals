package org.example.BasicSyntax;

import java.util.Scanner;

public class E09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int  number = 1;
        int sum = 0;
        for (int count = 1; count <= n; count++) {
            System.out.println(number);
            sum += number;
            number+= 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
