package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

public class MatrixSubtraction {

    public static void calculate(){

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Zeilenanzahl des Arrays ein: ");
        int y = inputValue.nextInt();
        System.out.println("Bitte geben Sie die Spaltenanzahl des Arrays ein: ");
        int x = inputValue.nextInt();

        int[][] array1 = new int[y][x];
        int[][] array2 = new int[y][x];
        int[][] array3 = new int[y][x];


        //Fill array1
        for(int i = 0; i<y; i++){
            for(int j = 0; j<x; j++){

                array1[i][j] = (int)(Math.random()*99+1);
            }
        }

        //Fill array2
        for(int i = 0; i<y; i++){
            for(int j = 0; j<x; j++){

                array2[i][j] = (int)(Math.random()*99+1);
            }
        }

        //Print array1
        System.out.println("X:");
        for(int i = 0; i<y; i++){
            for(int j = 0; j<x; j++){

                System.out.print(array1[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\n");

        //Print array2
        System.out.println("Y:");
        for(int i = 0; i<y; i++){
            for(int j = 0; j<x; j++){

                System.out.print(array2[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\n");

        //Subtraction of X and Y
        for(int i = 0; i<y; i++){
            for(int j = 0; j<x; j++){
                array3[i][j] = array1[i][j] - array2[i][j];
            }
        }

        //Print array3
        System.out.println("X-Y:");
        for(int i = 0; i<y; i++){
            for(int j = 0; j<x; j++){

                System.out.printf("%3s", array3[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

}
