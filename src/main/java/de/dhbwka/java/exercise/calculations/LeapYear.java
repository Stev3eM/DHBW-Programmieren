package de.dhbwka.java.exercise.calculations;

import java.util.Scanner;

public class LeapYear {

    public static void calculate () {

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Bitte geben Sie das zu prüfende Jahr ein:\n");
        int userinput = inputValue.nextInt();

        if(userinput % 4 == 0 && userinput % 100 != 0 || userinput % 4 == 0 && userinput % 100 == 0 && userinput % 400 == 0){
            System.out.println("Das Jahr " +userinput+ " ist ein Schaltjahr!");
        } else {
            System.out.println(("das jahr " +userinput+ " ist kein Schaltjahr."));
        }

    }
}
