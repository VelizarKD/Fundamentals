package org.example.Methods;

import java.util.Scanner;

public class E09_GreatOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());

                System.out.println(getMax(firstNum, secondNum));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);

                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                String first = scanner.nextLine();
                String second = scanner.nextLine();

                System.out.println(getMax(first, second));
                break;
        }

    }
    public static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }

    public static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    public static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
