package org.example.Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int size = numList.size();

        for (int i = 0; i < size / 2; i++) {
            int firstNum = numList.get(i);
            int lastNum = numList.get(numList.size() - 1);

            numList.set(i, firstNum + lastNum);
            numList.remove(numList.size() - 1);


        }

        System.out.println(joinElementsByDelimiter(numList, " "));
    }
    public static String joinElementsByDelimiter(List<Integer> items, String delimiter) {
        String output = "";
        for (Integer item : items) {
            DecimalFormat df = new DecimalFormat("0.#");
            String numDf = df.format(item) + delimiter;

            output += numDf;
        }
        return output;
    }
}
