package de.dhbwka.java.exercise.operators;

/* Aufgabenstellung:
Berechnen Sie in einem Java-Programm Easter den Ostertermin für das Jahr „jahr“ nach der von
Gauß im Jahr 1816 veröffentlichten Formel (hier für den gregorianischen Kalender).
a = jahr mod 19
b = jahr mod 4
c = jahr mod 7
k = jahr div 100
p = (8k + 13) div 25
q = k div 4
m = (15 + k - p - q) mod 30
n = (4 + k - q) mod 7
d = (19a + m) mod 30
e = (2b + 4c + 6d + n) mod 7
ostern = (22 + d + e) (bezogen auf 1. März)
Der „32. März“ entspricht also dem 1. April usw.
Lassen Sie die Jahreszahl vom Nutzer eingeben und geben Sie den passenden Ostertermin aus!
Hinweise:
div liefert den Ganzzahlanteil des Ergebnisses der ganzzahligen Division.
mod (Modulo-Funktion) liefert den Divisionsrest bei ganzzahliger Division. */

public class Easter {

    public static void calc (){


    }
}
