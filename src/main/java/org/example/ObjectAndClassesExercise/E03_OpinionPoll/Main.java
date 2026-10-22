package org.example.ObjectAndClassesExercise.E03_OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String personalInformation = scanner.nextLine();
            String name = personalInformation.split(" ")[0];
            int age = Integer.parseInt(personalInformation.split(" ")[1]);

            Person person = new Person(name, age);

            if (age > 30) {
                personList.add(person);
            }
        }

        personList.sort(Comparator.comparing(Person :: getName));

        for (Person person : personList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
