package org.example.BasicSyntaxExercise;

import java.util.Scanner;

public class E03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfGuest = Integer.parseInt(scanner.nextLine());
        String typeOfGuest = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;

        switch (typeOfGuest) {
            case "Students":
                switch (dayOfWeek){
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (dayOfWeek){
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }

                break;
            case "Regular":
                switch (dayOfWeek){
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.5;
                        break;
                }
                break;

        }

        double totalPrice = price * countOfGuest;

        if (typeOfGuest.equals("Students") && countOfGuest >= 30) {
            totalPrice = totalPrice - 0.15 * totalPrice;
        }
        else if (typeOfGuest.equals("Business") && countOfGuest >= 100) {
            totalPrice = totalPrice - 10 * price;
        }
        else if (typeOfGuest.equals("Regular") && countOfGuest >= 10 && countOfGuest <= 20) {
            totalPrice = totalPrice - 0.05 * totalPrice;
        }

        System.out.printf("Total price: %.2f", totalPrice);


    }
}
