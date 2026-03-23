package org.example.DataTypesAndVarExercise;

import java.util.Scanner;

public class E10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int firstTimePower = power;
        int count = 0;

        while (power >= distance) {
            power -= distance;
            count++;

            if (power == firstTimePower * 0.5) {
                if (exhaustionFactor > 0) {
                    power = power / exhaustionFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(count);
    }
}
