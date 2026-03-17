package org.example.DataTypesAndVarExercise;

import java.util.Scanner;

public class E08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String biggerKeg = "";

        for (int keg = 0; keg < n; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                biggerKeg = model;
            }
        }
        System.out.println(biggerKeg);

    }
}
