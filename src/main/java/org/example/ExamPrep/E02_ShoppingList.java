package org.example.ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> productList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            String[] commandArr = input.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "Urgent":
                    String itemToAdd = commandArr[1];

                    if (!productList.contains(itemToAdd)) {
                        productList.add(0, itemToAdd);
                    }
                    break;
                case "Unnecessary":
                    String itemToRemove = commandArr[1];

                    productList.remove(itemToRemove);
                    break;
                case "Correct":
                    String oldItem = commandArr[1];
                    String newItem = commandArr[2];

                    if (productList.contains(oldItem)) {
                        int index = productList.indexOf(oldItem);
                        productList.set(index, newItem);
                    }
                    break;
                case "Rearrange":
                    String itemToRearrange = commandArr[1];
                    if (productList.contains(itemToRearrange)) {
                        productList.remove(itemToRearrange);
                        productList.add(itemToRearrange);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", productList));
    }
}
