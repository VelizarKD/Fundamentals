package org.example.ArraysExercise;

import java.util.Scanner;

public class E09_KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dnaLength = Integer.parseInt(scanner.nextLine());

        //Променливи за най - добра DNA
        int bestLength = 0;
        int bestStartIndex = Integer.MAX_VALUE;
        int bestSum = 0;
        int bestSampleIndex = 0;
        int [] bestDna = new int[dnaLength];

        int sampleCounter = 0;

        boolean isBetter = false;

        String command = scanner.nextLine();
        while (!command.equals("Clone them!")) {
            sampleCounter++;

            String [] tokens = command.split("!+");
            int[] currentDna = new int[dnaLength];

            for (int index = 0; index < dnaLength; index++) {
                currentDna[index] = Integer.parseInt(tokens[index]);
            }

            int currentLength = 0;
            int maxLength = 0;
            int startIndex = 0;
            int bestCurrentStart = 0;

            for (int i = 0; i < currentDna.length; i++) {
                if (currentDna[i] == 1) {
                    if (currentLength == 0) {
                        startIndex = i;
                    }

                    currentLength++;

                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        bestCurrentStart = startIndex;
                    }
                } else {
                    currentLength = 0;
                }
            }
            int sum = 0;
            for (int num : currentDna) {
                sum += num;
            }

            if (maxLength > bestLength) {
                isBetter = true;

            } else if (maxLength == bestLength) {
                if (bestCurrentStart < bestStartIndex) {
                    isBetter = true;
                }
            } else if (bestCurrentStart == bestStartIndex) {

                if (sum > bestSum) {
                    isBetter = true;
                }
            }

            if (isBetter) {
                bestLength = maxLength;
                bestStartIndex = bestCurrentStart;
                bestSum = sum;
                bestSampleIndex = sampleCounter;
                bestDna = currentDna;
            }


            command = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSampleIndex, bestSum);

        for (int num : bestDna) {
            System.out.print(num + " ");
        }
    }
}
