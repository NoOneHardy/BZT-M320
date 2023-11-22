package ch.bztf;

import java.util.Scanner;

/**
 * Das ist die Main-Klasse. Eigentlich nicht wichtig für die Doku.
 * 
 * @author Silas Hardegger
 * @version 1.0
 */

public class App {
    /**
     * main-Methode. Ist static.
     * 
     * @param args - String Array aus Übergabe-Werten aus der Konsole.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Konto instanzTestKonto = new Konto();
         * 
         * System.out.println("Ein neues Konto wurde erstellt.");
         * System.out.
         * println("Bitte beantworten Sie die folgenden Fragen um das Erstellen des Kontos abzuschliessen."
         * );
         * System.out.print("Was ist die Kontonummer von diesem Konto?: ");
         * instanzTestKonto.setNummerKonto(input.nextInt());
         * input.nextLine(); // Das behebt das Problem mit dem Überspringen der String
         * inputs
         * System.out.print("Wer ist der Besitzer von Konto " +
         * instanzTestKonto.getNummerKonto() + "?: ");
         * instanzTestKonto.setKontoInhaber(input.nextLine());
         * System.out.print("Wie heisst das Konto " + instanzTestKonto.getNummerKonto()
         * + "?: ");
         * instanzTestKonto.setNameKonto(input.nextLine());
         * System.out.print("Wie hoch ist der Saldo von " +
         * instanzTestKonto.getNameKonto() + "?: ");
         * instanzTestKonto.setSaldoKonto(input.nextDouble());
         * input.nextLine(); // Das behebt das Problem mit dem Überspringen der String
         * inputs
         * System.out.println();
         * 
         * StringBuilder ausgabe = new
         * StringBuilder("Das Konto ").append(instanzTestKonto.getNummerKonto())
         * .append(" - ").append(instanzTestKonto.getNameKonto())
         * .append(" von ").append(instanzTestKonto.getKontoInhaber())
         * .append(" hat einen Saldo von CHF ").append(instanzTestKonto.getSaldoKonto())
         * ;
         * 
         * System.out.println(ausgabe.toString());
         * 
         * input.close();
         */

        final Konto[] konti = new Konto[3];
        for (int i = 0; i < konti.length; i++) {
            konti[i] = new Konto();
            System.out.println("Ein neues Konto wurde erstellt.");
            System.out.println("Um die Erstellung abzuschliessen, beantworten Sie bitte die folgenden Fragen: ");
            System.out.print("Wie ist die Kontonummer von diesem Konto?: ");
            konti[i].setNummerKonto(input.nextInt());
            input.nextLine(); // Das behebt das Problem mit dem Überspringen der String inputs
            System.out.print("Wer ist der Besitzer von Konto " + konti[i].getNummerKonto() + "?: ");
            konti[i].setKontoInhaber(input.nextLine());
            System.out.print("Wie heisst das Konto " + konti[i].getNummerKonto() + "?: ");
            konti[i].setNameKonto(input.nextLine());
            System.out.print("Wie hoch ist der Saldo von " + konti[i].getNameKonto() + "?: ");
            konti[i].setSaldoKonto(input.nextDouble());
            input.nextLine(); // Das behebt das Problem mit dem Überspringen der String inputs
            System.out.println();
        }

        for (int i = 0; i < konti.length; i++) {
            System.out.println("Ausgabe " + i);
            konti[i].getKontoInhaberOut();
            konti[i].getNameKontoOut();
            konti[i].getNummerKontoOut();
            konti[i].getSaldoKontoOut();
            System.out.println();
        }

        Konto.greeting();
        System.out.println();
        Konto.greeting(100);

        input.close();
    }
}