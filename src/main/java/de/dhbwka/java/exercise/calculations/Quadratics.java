package de.dhbwka.java.exercise.calculations;

/*
ax^2 + bx +c = 0
 */

import java.util.Scanner;

public class Quadratics {

    public static void zeroing() {

        Scanner inputValue = new Scanner(System.in);

        System.out.println("ax² + bx + c = 0\n");
        System.out.println("Bitte geben Sie den Wert für a ein:");
        double a = inputValue.nextDouble();
        System.out.println("Bitte geben Sie den Wert für b ein:");
        double b = inputValue.nextDouble();
        System.out.println("Bitte geben Sie den Wert für c ein:");
        double c = inputValue.nextDouble();

        if (a == 0 && b == 0) {
            System.out.println("Die Gleichung ist degeneriert.");
        } else if (a == 0 && b != 0) {
            double x = -c / b;
            System.out.println("Das Ergebnis lautet: x = " + x);
        }


        if (a != 0) {
            double disKrim = Math.pow(b, 2) - 4 * a * c;

            if (disKrim >= 0) {

                double sqrt = Math.sqrt(disKrim);
                double x1 = (-b + sqrt) / (2 * a);
                double x2 = (-b - sqrt) / (2 * a);

                System.out.println("Das Ergebnis lautet: ");
                System.out.printf("x1 = %f, x2 = %f, x1, x2");
            } else {
                System.out.println("Die Lösung ist konjugiert komplex.");
            }
        }
    }
}
