package org.example.Methods;

import java.util.Scanner;

public class E05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (product) {
            case "coffee":
                price = 1.5;
                totalPrice(price, quantity);
                break;
            case "water":
                price = 1.0;
                totalPrice(price, quantity);
                break;
            case "coke":
                price = 1.4;
                totalPrice(price, quantity);
                break;
            case "snacks":
                price = 2.0;
                totalPrice(price, quantity);
                break;
        }
    }
    public static void totalPrice(double price, int quantity) {
        double result = price * quantity;
        System.out.printf("%.2f", result);
    }
}
