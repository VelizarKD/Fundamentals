package org.example.DataTypesAndVar;

import java.util.Scanner;

public class E06_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        char symbol3 = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c", symbol, symbol2, symbol3);
    }
}
