package org.example.MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class E11_ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commands = input.split(" ");
            String typeOfCommand = commands[0];
            switch (typeOfCommand) {
                case "exchange":
                    int exchangeIndex = Integer.parseInt(commands[1]);
                    if (isValidIndex(exchangeIndex, numbers.length)) {
                       numbers = exchange(numbers, exchangeIndex);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    String evenOrOdd = commands[1];
                    if (evenOrOdd.equals("even")) {
                        printIndexMaxEvenNumber(numbers);
                    } else if (evenOrOdd.equals("odd")) {
                        printIndexMaxOddNumber(numbers);
                    }
                    break;
                case "min":
                    String minEvenOrOdd = commands[1];
                    if (minEvenOrOdd.equals("even")) {
                        printIndexMinEvenNumber(numbers);
                    } else if (minEvenOrOdd.equals("odd")) {
                        printIndexMinOddNumber(numbers);
                    }
                    break;
                case "first":
                    int count = Integer.parseInt(commands[1]);
                    if (!isValidCount(count, numbers.length)) {
                        System.out.println("Invalid count");
                        input = scanner.nextLine();
                        continue;
                    }
                    String firstEvenOrOdd = commands[2];
                    if (firstEvenOrOdd.equals("even")) {
                        printFirstEven(numbers, count);
                    } else if (firstEvenOrOdd.equals("odd")) {
                        printFirstOdd(numbers, count);
                    }
                    break;
                case "last":
                    int countLast = Integer.parseInt(commands[1]);
                    if (!isValidCount(countLast, numbers.length)) {
                        System.out.println("Invalid count");
                        input = scanner.nextLine();
                        continue;
                    }
                    String lastEvenOrOdd = commands[2];
                    if (lastEvenOrOdd.equals("even")) {
                        printLastEven(numbers, countLast);
                    } else if (lastEvenOrOdd.equals("odd")) {
                        printLastOdd(numbers, countLast);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }

    private static boolean isValidCount(int count, int length) {
        return count <= length;
    }

    private static void printLastOdd(int[] numbers, int countLast) {
        String lastOdd = "";
        for (int index = numbers.length - 1;  index >= 0; index--) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 0) {
                lastOdd += currentNumber;
                countLast--;
            }
            if (countLast == 0) {
                break;
            }
        }
        System.out.println("[");
        for (int index = lastOdd.length() - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(lastOdd.charAt(index));
            } else {
                System.out.println(lastOdd.charAt(index) + ", ");
            }
        }
        System.out.println(']');
    }

    private static void printLastEven(int[] numbers, int countLast) {
        String lastEven = "";
        for (int index = numbers.length - 1;  index >= 0; index--) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 0) {
                lastEven += currentNumber;
                countLast--;
            }
            if (countLast == 0) {
                break;
            }
        }
        System.out.println("[");
        for (int index = lastEven.length() - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(lastEven.charAt(index));
            } else {
                System.out.println(lastEven.charAt(index) + ", ");
            }
        }
        System.out.println(']');
    }

    private static void printFirstOdd(int[] numbers, int count) {
        StringBuilder output = new StringBuilder();
        output.append("[");
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 1) {
                output.append(currentNumber).append(", ");
                count--;
            }
            if (count == 0) {
                break;
            }
            output.append(", ");
        }
        output.append("]");

        System.out.println(output.toString());
    }

    private static void printFirstEven(int[] numbers, int count) {
        StringBuilder output = new StringBuilder();
        output.append("[");
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 0) {
                output.append(currentNumber).append(", ");
                count--;
            }
            if (count == 0) {
                break;
            }
            output.append(", ");
        }
        output.append("]");

        System.out.println(output.toString());
    }

    private static void printIndexMinOddNumber(int[] numbers) {
        int minOdd = Integer.MAX_VALUE;
        int indexMinOdd = -1;

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 1 && currentNumber <= minOdd) {
                minOdd = currentNumber;
                indexMinOdd = index;
            }
        }
        if (indexMinOdd == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMinOdd);
        }
    }

    private static void printIndexMinEvenNumber(int[] numbers) {
        int minEven = Integer.MAX_VALUE;
        int indexMinEven = -1;

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 0 && currentNumber <= minEven) {
                minEven = currentNumber;
                indexMinEven = index;
            }
        }
        if (indexMinEven == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMinEven);
        }
    }

    private static void printIndexMaxOddNumber(int[] numbers) {
        int maxOdd = Integer.MIN_VALUE;
        int indexMaxOdd = -1;
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 1 && currentNumber >= maxOdd) {
                maxOdd = currentNumber;
                indexMaxOdd = index;
            }
        }
        if (indexMaxOdd == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMaxOdd);
        }
    }

    private static void printIndexMaxEvenNumber(int[] numbers) {
        int maxEven = Integer.MIN_VALUE;
        int indexMaxEven = -1;
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (currentNumber % 2 == 0 && currentNumber >= maxEven) {
                maxEven = currentNumber;
                indexMaxEven = index;
            }
        }
        if (indexMaxEven == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(indexMaxEven);
        }
    }

    private static int[] exchange(int[] numbers, int exchangeIndex) {
        int[] result = new int[numbers.length];

        int currentPos = 0;

        for (int i = exchangeIndex + 1; i < numbers.length; i++) {
            result[currentPos++] = numbers[i];
        }

        for (int i = 0; i <= exchangeIndex; i++) {
            result[currentPos++] = numbers[i];
        }

        return result;
    }

    private static boolean isValidIndex(int index, int length) {
        return index >= 0 && index <= length - 1;
    }
}
