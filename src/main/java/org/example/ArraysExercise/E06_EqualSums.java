package org.example.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class E06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        boolean isFound = false;

        for (int index = 0; index < numbers.length; index++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < index; i++) {
                leftSum += numbers[i];
            }
            for (int i = index + 1; i < numbers.length; i++) {
                rightSum += numbers[i];
            }
            if (leftSum == rightSum) {
                isFound = true;
                System.out.println(index);
                break;
            }

        }
        if (!isFound) {
            System.out.println("no");
        }
    }
}
