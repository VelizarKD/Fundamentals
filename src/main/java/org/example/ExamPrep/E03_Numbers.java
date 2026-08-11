package org.example.ExamPrep;

import java.util.*;

public class E03_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        double sum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr[i];
            sum = sum + currentNum;
        }

        double average = sum / numbersArr.length;

        List<Integer> topNumbers = new ArrayList<>();

        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr[i];

            if (currentNum > average) {
                topNumbers.add(currentNum);
            }
        }
        Collections.sort(topNumbers);
        Collections.reverse(topNumbers);

        if (topNumbers.isEmpty()) {
            System.out.println("No");
        } else {
            for (int i = 0; i < Math.min(5, topNumbers.size()); i++) {
                System.out.print(topNumbers.get(i) + " ");
            }
        }
    }
}
