package org.example.ObjectAndClassesExercise.E06_OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String personalInfo = scanner.nextLine();

        List<Person> listOfPerson = new ArrayList<>();
        while (!personalInfo.equals("End")) {
            String name = personalInfo.split(" ")[0];
            String ID = personalInfo.split(" ")[1];
            int age = Integer.parseInt(personalInfo.split(" ")[2]);

            Person person = new Person(name, ID, age);
            listOfPerson.add(person);
            personalInfo = scanner.nextLine();
        }

        listOfPerson.sort(Comparator.comparing(Person::getAge));

        for (Person person : listOfPerson) {
            System.out.println(person);
        }
    }
}
