package com.company;

import java.util.Scanner;

public class Main {

    Scanner scan = new Scanner(System.in);

    //Variabler
    int Bruger;
    int Shift;
    String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String Besked;
    String ciphertekst = "";

    public static void main(String[] args) {

        new Main().Velkommen();
        new Main().Cæsar();

    }

    public void Velkommen() {

        System.out.println("Velkommen til krypterings- og dekrypteringsmaskinen");
        System.out.println("Du har nu 4 valg muligheder: ");
        System.out.println("Tast 1 for Cæsar Cipher: " + Bruger);
        System.out.println("Tast 2 for exit: " + Bruger);

    }

    public void Cæsar() {

        Bruger = scan.nextInt();
        if (Bruger == 1) {
            System.out.println("Du har valgt Cæsar Cipher: ");
            System.out.println("Du har nu 2 valgmuligheder: ");
            System.out.println("Tast 1 for Kryptering");
            System.out.println("Tast 2 for Dekryptering");
            Bruger = scan.nextInt();

            if (Bruger == 1) {

                System.out.println("Du har valgt Kryptering");

                System.out.println("skriv en besked for kryptering: ");
                Besked = scan.next();

                System.out.println("Skriv en shift værdi");
                Shift = scan.nextInt();

                Besked = Besked.toUpperCase();
                for (int i = 0; i < Besked.length(); i++) {
                    int charPosition = alfabet.indexOf(Besked.charAt(i));
                    int værdi = (Shift + charPosition) % 26;
                    char replaceVal = alfabet.charAt(værdi);
                    ciphertekst += replaceVal;
                }

                System.out.println("Den krypterede besked er:" + ciphertekst);
            }

        }if (Bruger == 2) {
            System.out.println("Du har valgt Dekryptering");

            System.out.println("skriv den dekrypterede besked: ");
            Besked = scan.next();

            System.out.println("Skriv en shift værdi");
            Shift = scan.nextInt();

            Besked = Besked.toUpperCase();
            for (int i = 0; i < Besked.length(); i++) {
                int charPosition = alfabet.indexOf(Besked.charAt(i));
                int værdi = (charPosition - Shift) % 26;
                if (værdi < 0) {
                    værdi = alfabet.length() + værdi;
                }
                char replaceVal = alfabet.charAt(værdi);
                ciphertekst += replaceVal;

            }
            System.out.println("Den Dekrypterede besked er: " + ciphertekst);
        }
    }

    }













