package org.example.ArraysExercise;

import java.util.Scanner;

public class E02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secndLine = scanner.nextLine();

        String [] firstArr = firstLine.split(" ");
        String [] secondArr = secndLine.split(" ");

        for (String secondElement : secondArr) {
            for (String firstElement : firstArr) {
                if (firstElement.equals(secondElement)) {
                    System.out.print(secondElement + " ");
                }
            }
        }
    }
}
