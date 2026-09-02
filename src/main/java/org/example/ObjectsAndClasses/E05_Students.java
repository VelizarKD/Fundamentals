package org.example.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E05_Students {
     static class Student {
        String firstName;
        String lastName;
        int age;
        String town;

        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return firstName;
        }

        public Student setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public Student setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Student setAge(int age) {
            this.age = age;
            return this;
        }

        public String getTown() {
            return town;
        }

        public Student setTown(String town) {
            this.town = town;
            return this;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();
        while (!input.equals("end")) {
            String [] data = input.split(" ");
            String firstName = data[0];
            String lastName = data[1];
            int years = Integer.parseInt(data[2]);
            String homeTown = data[3];

            Student student = new Student(firstName, lastName,years, homeTown);
            studentList.add(student);

            input = scanner.nextLine();
        }
        String searchTown = scanner.nextLine();

        for (Student s : studentList) {
            if (s.getTown().equals(searchTown)) {
                System.out.printf("%s %s is %d years old\n", s.getFirstName(), s.getLastName(), s.getAge());
            }
        }
    }
}
