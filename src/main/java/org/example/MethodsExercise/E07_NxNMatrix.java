package org.example.MethodsExercise;

import java.util.Scanner;

public class E07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        printNXNMatrix(n);

    }
    private static void printNXNMatrix(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }


    }
}
