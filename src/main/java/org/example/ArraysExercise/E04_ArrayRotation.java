package org.example.ArraysExercise;

import java.util.Scanner;

public class E04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] array = input.split(" ");

        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= countRotations ; rotation++) {
            //ротация на масива
            //1.взимам първия елемент
            String firstElement = array[0];
            //2.местя всички елементи на ляво
            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }
            //3.задавам последния елемент в масива да ми е първи
            array[array.length - 1] = firstElement;
        }
        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}
