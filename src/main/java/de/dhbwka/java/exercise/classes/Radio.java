package de.dhbwka.java.exercise.classes;

import java.util.Scanner;

public class Radio {


    //attributes
    boolean on;
    int volume;
    double frequency;



    //constructor
    public Radio(boolean on, int volume, double frequency) {
        this.on = on;
        this.volume = volume;
        this.frequency = frequency;
    }

    public Radio() {
        this.on = false;
        this.volume = 1;
        this.frequency = 85.0;
    }


    //getter & setter
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public static void menu() throws InterruptedException {

        Scanner inputValue = new Scanner(System.in);
        Radio myRadio = new Radio();
        System.out.println("Wilkommen bei myRadio!\n");

        while (true) {

            System.out.println("""
                    (1) Radio ein-/ausschalten
                    (2) Lautstärke anpassen
                    (3) Frequenz einstellen
                    (4) Einstellungen anzeigen
                    (5) Programm beenden
                                                
                    """);

            int userChoiceMainMenu = inputValue.nextInt();

            //(1) Radio ein-/ausschalten
            if (userChoiceMainMenu == 1 && !myRadio.isOn()){
                myRadio.setOn(true);
                System.out.println("Radio ist eingeschaltet\n");
            } else if (userChoiceMainMenu == 1 && myRadio.isOn()){
                myRadio.setOn(false);
                System.out.println("Radio ist ausgeschaltet\n");
            }


            //(2) Lautstärke anpassen
            if (userChoiceMainMenu == 2 && myRadio.isOn()){

                System.out.println("Bitte geben Sie die gewünschte Lautstärke von 0-10 ein:");
                int userChoiceVolume = inputValue.nextInt();

                if(userChoiceVolume >= 0 && userChoiceVolume <= 10){
                    myRadio.setVolume(userChoiceVolume);
                    System.out.println("Lautstärke wurde auf " + myRadio.getVolume() + " eingestellt.\n");
                } else {
                    System.out.println("Lautstärkeeinstellung nur von 0-10 möglich.\n");
                }

            } else if (userChoiceMainMenu == 2 && !myRadio.isOn()) {
                System.out.println("Bitte schalten Sie zuerst das radio an.");
            }

            //(3) Frequenz einstellen
            if (userChoiceMainMenu == 3 && myRadio.isOn()){
                System.out.println("Aktuelle Frequenz: " + myRadio.getFrequency() + " MHz\n");
                System.out.println("Bitte geben Sie die neue Frequenz zwischen 85.0 - 110.0 MHz ein:");
                double userChoiceFrequence = Double.parseDouble(inputValue.next().replace(',','.'));

                if(userChoiceFrequence >= 85.0 && userChoiceFrequence <= 110.0){
                    myRadio.setFrequency(userChoiceFrequence);
                    System.out.println("Die neue Frequenz ist " + myRadio.getFrequency() + " MHz.\n");
                } else {
                    System.out.println("Frequenzwertebereich nur von 85.0 - 110.0 MHz möglich.\n");
                }

            } else if (userChoiceMainMenu == 3 && !myRadio.isOn()) {
                System.out.println("Bitte schalten Sie zuerst das radio an.");
            }


            //Einstellungen anzeigen
            if(userChoiceMainMenu == 4 && myRadio.isOn()){
                System.out.println("Radio: an");
                System.out.println("Lautstärke: " + myRadio.getVolume());
                System.out.println("Frequenz: " + myRadio.getFrequency() + " MHz\n");
            } else if (userChoiceMainMenu == 4 && !myRadio.isOn()) {
                System.out.println("Bitte schalten Sie zuerst das radio an.");
            }


            //(5) Programm beenden
            if(userChoiceMainMenu == 5){
                System.out.println("Wollen Sie myRadio wirklich beenden? (j/n)\n");
                String userWantsExit = inputValue.next();

                if(userWantsExit.equals("j") || userWantsExit.equals("J") || userWantsExit.equals("y")){

                    System.out.println("Programm wird beendet...");
                    Thread.sleep(1500);
                    System.exit(1);
                }

            }


        }
    }
}
