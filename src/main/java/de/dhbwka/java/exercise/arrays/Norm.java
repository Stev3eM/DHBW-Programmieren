package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

public class Norm {

    public static void betrag () {

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Anzahl der Komponenten ein: ");
        int n = inputValue.nextInt();

        int[] components = new int[n];

        for(int i = 0; i<n; i++){

            System.out.println("Bitte x_"+ i + " eingeben: ");
            components[i] = inputValue.nextInt();
        }

        double temp = 0;

        for(int i = 0; i<n; i++){

            temp += Math.pow(components[i], 2);
        }

        System.out.println("Der Betrag von x ist " + Math.sqrt(temp));





    }
}
