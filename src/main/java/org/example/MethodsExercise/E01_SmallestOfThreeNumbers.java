package org.example.MethodsExercise;

import java.util.Scanner;

public class E01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int smallestNum = getSmallestNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println(smallestNum);
    }
    private static int getSmallestNumber(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return  num2;
        } else {
            return num3;
        }
    }
}
