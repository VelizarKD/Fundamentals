package org.example.ExamPrep;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scanner.nextLine());
        int countOfLectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());

        double maxPoints = Double.MIN_VALUE;
        int maxAttendances = Integer.MIN_VALUE;
        double totalBonus = 0;

        for (int i = 0; i < countOfStudents; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
            totalBonus = (double) attendances / countOfLectures * (5 + initialBonus);

            if (totalBonus > maxPoints) {
                maxPoints = totalBonus;
            }
            if (attendances > maxAttendances){
                maxAttendances = attendances;
            }
        }
        System.out.printf("Max Bonus: %d.%n", Math.round(maxPoints));
        System.out.printf("The student has attended %d lectures.", maxAttendances);
    }
}
