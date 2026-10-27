package org.example.ObjectAndClassesExercise.E04_Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scanner.nextLine());
        List<Student> studentsList = new ArrayList<>();

        for (int student = 1; student <= countOfStudents; student++) {
            String studentInfo = scanner.nextLine();

            String firstName = studentInfo.split(" ")[0];
            String secondName = studentInfo.split(" ")[1];
            double grade = Double.parseDouble(studentInfo.split(" ")[2]);

            Student studentObj = new Student(firstName, secondName, grade);
            studentsList.add(studentObj);

        }

        studentsList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentsList) {
            System.out.println(student);
        }
    }
}
