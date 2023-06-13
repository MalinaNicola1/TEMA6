package org.fasttrackit;

import java.util.Random;
import java.util.Scanner;

public class TemaCURS5 {
    public static void main(String[] args) {
        String[] nume = {"Ana Maria Dan", "Maria", "Alexandra", "Andreea", "Anca", "Adelina", "Marin", "Andrei", "Valeria", "Gery", "Vlad"};
        //NumeCuLiteraA(nume);
        // Given(nume);
        // Replacement(nume);
        //PrimeleTrei(nume);
        //NrRandom(nume);
        Abreviere(nume);
    }

    static void NumeCuLiteraA(String[] nume) {
        int i = 0;
        for (i = 0; i < nume.length; i++) {
            String litA = nume[i];


            if (litA.charAt(0) == 'A') {
                System.out.println(nume[i]);

            }
        }
    }

    static void Given(String[] nume) {
        int i = 0;
        Scanner console = new Scanner(System.in);
        String continut;
        continut = console.next();

        for (i = 0; i < nume.length; i++) {
            if (nume[i].contains(continut)) {
                System.out.println(nume[i]);

            }


        }


    }

    static void Replacement(String[] nume) {
        int i = 0;

        String[] numeNou = nume;
        for (i = 0; i < numeNou.length; i++) {

            System.out.println(numeNou[i].replace("r", "*"));
        }


    }

    static void PrimeleTrei(String[] nume) {
        int i;
        for (i = 0; i < nume.length; i++) {
            System.out.println(nume[i].substring(0, 3));

            System.out.println();

        }
    }

    static void NrRandom(String[] nume) {
        Random newLetter = new Random();
        int i;

        for (i = 0; i < nume.length; i++) {
            int a = nume[i].length();
            System.out.println(nume[i].charAt(newLetter.nextInt(a - 1)));
        }

    }


    static void Abreviere(String[] nume) {
        int i;
        for (i = 0; i < nume.length; i++) {
            if (nume[i].indexOf(" ") != nume[i].lastIndexOf(" ") && nume[i].indexOf(" ") != -1 && nume[i].lastIndexOf(" ") != -1){
                String[] altNume = nume[i].split(" ");
                System.out.println( altNume[0] + " " + altNume[1].charAt(0) + ". " + altNume[2]);
            }
            else
                System.out.println(nume[i]);
        }

    }

}



