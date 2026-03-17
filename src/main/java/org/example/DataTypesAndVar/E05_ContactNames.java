package org.example.DataTypesAndVar;

import java.util.Scanner;

public class E05_ContactNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String symbol = scanner.nextLine();

        System.out.printf("%s%s%s", firstName, symbol, lastName);
    }
}
