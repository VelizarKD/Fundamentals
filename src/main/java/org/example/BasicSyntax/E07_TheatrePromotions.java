package org.example.BasicSyntax;

import java.util.Scanner;

public class E07_TheatrePromotions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine().toLowerCase();
        int ageOfPerson = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (typeOfDay.equals("weekday")) {
            if (ageOfPerson >= 0 && ageOfPerson <= 18 || ageOfPerson > 64 && ageOfPerson <=122) {
                price = 12;
            } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
                price = 18;
            }
        }
        if (typeOfDay.equals("weekend")) {
            if (ageOfPerson >= 0 && ageOfPerson <=18 || ageOfPerson > 64 && ageOfPerson <= 122) {
                price = 15;
            } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
                price = 20;
            }
        }
        if (typeOfDay.equals("holiday")) {
            if (ageOfPerson >= 0 && ageOfPerson <=18) {
                price = 5;
            } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
                price = 12;
            } else if (ageOfPerson > 64 && ageOfPerson <= 122) {
                price = 10;
            }
        }

        if (price != 0 ) {
            System.out.printf("%.0f$", price);
        } else {
            System.out.println("Error!");
        }



    }
}
