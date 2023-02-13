package de.dhbwka.java.exercise.arrays;

import java.util.ArrayList;

public class Eratostenes {

    public static void print (int n){

        int[] sieve = new int[n];

        for(int i = 0; i<n; i++){
            sieve[i] = i+1;
        }

        for(int i=0; i<n; i++){
            if(sieve[i]==0){
                continue;
            } else {
                if(sieve[i]%2 == 0){

                }
            }
        }


    }
}
