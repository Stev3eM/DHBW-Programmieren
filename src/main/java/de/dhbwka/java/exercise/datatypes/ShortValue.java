package de.dhbwka.java.exercise.datatypes;

/*
Aufgabenstellung:
Schreiben Sie ein Programm ShortValue, in dem Sie eine short-Variable mit dem Wert 32767
initialisieren und den Wert der Variablen ausgeben!
Erhöhen Sie dann den Wert der Variablen um 1 und geben Sie den neuen Wert der Variablen aus!
Welcher Wert wird ausgegeben und warum? Gibt es eine Fehlermeldung des Laufzeitsystems?

Hinweis:
Für die Ausgabe der Variablenwerte kann das Beispielprogramm Quotient im Kapitel „Die
Programmiersprache Java“ als Vorbild genommen werden.
 */

public class ShortValue {

    public static void printShortValue() {

        short shortVariable = 32767;
        System.out.println(shortVariable);

        shortVariable += 1;
        System.out.println(shortVariable);

    }

}

