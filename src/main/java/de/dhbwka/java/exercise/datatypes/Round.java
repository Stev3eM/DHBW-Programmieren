package de.dhbwka.java.exercise.datatypes;

/*
Aufgabenstellung:
Das „Casten“ (dt. die Typumwandlung) von Gleitkommazahlen in ganze Zahlen bedeutet im
Allgemeinen einen Informationsverlust, denn die Nachkommastellen werden abgeschnitten, z.B.
erfolgt im folgenden Programmstück die Ausgabe von 3 bzw. 2 für die ganzzahligen Varianten von Pi
bzw. e.
double pi = 3.1415926; // Naeherung der Kreiszahl Pi
double e = 2.7182818; // Naeherung der Eulerschen Zahl e
int piInt = (int) pi;
int eInt = (int) e;
System.out.println("Pi ganzzahlig: " + piInt); // Ausgabe: 3
System.out.println("e ganzzahlig: " + eInt); // Ausgabe: 2

Mit anderen Worten: Nachkommastellen werden immer abgeschnitten bzw. es wird unabhängig
vom Wert der Nachkommastellen immer abgerundet.

Schreiben Sie ein Programm Round, welches das obige Programm-Fragment so abändert, dass die
Zahlen Pi bzw. e kaufmännisch gerundet werden, d.h. wenn der Nachkommawert >= 0.5 ist wird
aufgerundet, ansonsten abgerundet!
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Round {

    public static void rounding (){

        double pi = 3.1415926;
        double e = 2.7182818;

        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(pi));
        System.out.println(df.format(e));

    }
}
