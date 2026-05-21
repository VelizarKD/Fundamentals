package org.example.Methods;

import java.util.Scanner;

public class E11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calculate(a, operator, b));

    }
    public static double calculate(int a , String operator, int b) {
        double result = 0.0;
        switch (operator) {
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        return result;
    }
}
