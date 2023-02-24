package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

public class PascalsTriangle {

    public static void calculate() {

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Tiefe des Pascalschen Dreiecks ein: ");
        int deep = inputValue.nextInt();

        int[][] array = new int[deep][deep];


        for (int i = 0; i <= deep; i++) {
            for (int j = 0; j < deep; j++) {

                array[i][j] += 1;

            }
        }

        System.out.println();

        for (int i = 0; i < deep; i++) {
            for (int j = 0; j < deep; j++) {

                if (array[i][j] != 0) {
                    System.out.print(array[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
