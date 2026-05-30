package org.example.MethodsExercise;

import java.util.Scanner;

public class E05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int firstExample = getSum(number1, number2);
        int secondExample = getSubtract(firstExample, number3);

        System.out.println(secondExample);
    }


    private static int getSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    private static int getSubtract(int number, int number1) {
        return number - number1;
    }
}
