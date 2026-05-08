package org.example.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class E01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());

        int[] wagons = new int[countWagons];
        int sum = 0;

        for (int wagon = 0; wagon < countWagons; wagon++) {
            int passengers = Integer.parseInt(scanner.nextLine());

            wagons[wagon] = passengers;
        }

        /*for (int i = 0; i < wagons.length; i++) {
            int currentElement = wagons[i];
            System.out.print(currentElement + " ");
        }*/

        for (int number : wagons) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);

        //System.out.println(Arrays.stream(wagons).sum());
    }
}
