package de.dhbwka.java.exercise.control;

/*
Erstellen Sie ein Programm zur Ausgabe einer Temperaturtabelle von Fahrenheit (f) nach Celsius (c)!
Die Tabelle soll bei 0°F beginnen und bei 300°F enden. Die Abstände der Stützstellen sollen 20°F betragen.

Der funktionale Zusammenhang von c und f ist gegeben durch die Formel: c = (5/9) * (f-32)
 */

public class TemperatureTable {

    public static void convert(){

        double c;

        System.out.println("Fahrenheit  |  Celsius  ");
        System.out.println("------------+---------");

        for(int i = 0; i<=300; i+=20){

            c = (5.0/9.0) * (i-32);

            System.out.printf("%3d", i);
            System.out.print("         |  ");
            System.out.format("%6.2f", c);
            System.out.println();
        }
    }
}
