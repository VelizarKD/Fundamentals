package org.example.BasicSyntax;

import java.util.Scanner;

public class E04_TimeAfter30Min {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 30;

        if (minutes >= 60) {
            hours += 1;
            minutes -= 60;
        }

        if (hours >= 24) {
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
