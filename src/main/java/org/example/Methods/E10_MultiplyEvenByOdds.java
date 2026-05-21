package org.example.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class E10_MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(number));
    }

    public static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);

        return evenSum * oddSum;
    }

    private static int getEvenSum(int num) {
        String intToString = Integer.toString(num);
        int[] numbersArr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 == 0) {
                sum += numbersArr[i];
            }
        }
        return sum;
    }
    private static int getOddSum(int num) {
        String intToString = Integer.toString(num);
        int[] numbersArr = Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 == 1) {
                sum += numbersArr[i];
            }
        }
        return sum;
    }

}
