package de.dhbwka.java.exercise.arrays;

public class Fibonacci {

    public static void print (int numbers){

        int[] fibNumbers = new int[numbers];

        System.out.println(fibNumbers[0] = 1);
        System.out.println(fibNumbers[1] = 1);

        for(int i = 2; i < numbers; i++){

            fibNumbers[i] = fibNumbers[i-1] + fibNumbers[i-2];
            System.out.println(fibNumbers[i]);

        }

    }
}
