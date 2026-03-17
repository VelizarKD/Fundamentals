package org.example.DataTypesAndVarExercise;

import java.util.Scanner;

public class E11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSnowballs = Integer.parseInt(scanner.nextLine());
        double maxSnowballValue = Double.MIN_VALUE;
        int snowballSnowHighestBall = 0;
        int snowballTimeHighestBall = 0;
        int snowballQualityHighestBall = 0;

        for (int snowballs = 1; snowballs <= countSnowballs; snowballs++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > maxSnowballValue) {
                maxSnowballValue = snowballValue;
                snowballSnowHighestBall = snowballSnow;
                snowballTimeHighestBall = snowballTime;
                snowballQualityHighestBall = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", snowballSnowHighestBall, snowballTimeHighestBall, maxSnowballValue, snowballQualityHighestBall);

    }
}
