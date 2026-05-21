package org.example.Methods;

import java.util.Scanner;

public class E06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double area = calculateRectangleArea(width, height);
        System.out.printf("%.0f",area);

    }

    private static double calculateRectangleArea(double width, double height) {
        return width * height;
    }
}
