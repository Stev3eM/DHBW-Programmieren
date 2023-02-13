package de.dhbwka.java.exercise.arrays;
/*
Formel Mittelwert: x = (1/n)
for(int i = 1; i < x; i++)
 */

public class StandardDevitation {

    public static void calculate (){

        double[] array = new double[100];
        double midValue = 0;

        //Mittelwert
        for(int i = 0; i< array.length; i++){
            array[i] = Math.random() * 10;
            midValue += array[i];
        }

        double finalMidValue = midValue / array.length;
        System.out.println(finalMidValue);
        double arL = array.length;

        //Standardabweichung
        double stAbw = Math.sqrt((1/ (arL-1))*Math.pow(midValue - finalMidValue, 2));

        System.out.println(stAbw);

    }
}
