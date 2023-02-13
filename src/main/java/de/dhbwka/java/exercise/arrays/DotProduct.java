package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

public class DotProduct {

    public static void calculate (){

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Anzahl der Komponenten an: ");
        int n = inputValue.nextInt();

        int[] y = new int[n];
        int[] x = new int[n];

        for(int i = 0; i<n; i++){

            System.out.println("Bitte x_"+ i + " eingeben: ");
            x[i] = inputValue.nextInt();
        }

        for(int i = 0; i<n; i++){

            System.out.println("Bitte y_"+ i + " eingeben: ");
            y[i] = inputValue.nextInt();
        }

        double scalarProduct = 0;

        for(int i = 0; i < n; i++){
            scalarProduct += y[i] * x[i];
        }

        System.out.println("Das Skalarprodukt von x und y ist " + scalarProduct);
    }
}
