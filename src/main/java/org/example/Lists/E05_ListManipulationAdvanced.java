package org.example.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            List<String> commandLine = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String commandName = commandLine.get(0);

            switch (commandName) {
                case "Contains":
                    int containsNumber = Integer.parseInt(commandLine.get(1));
                    if (numbersList.contains(containsNumber)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print even":

                    break;
                case "Print odd":

                    break;
                case "Get sum":

                    break;
                case "Filter":

                    break;
            }

            commandName = scanner.nextLine();
        }
        System.out.println();
    }
}
