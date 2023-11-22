package ch.bztf;

import java.util.ArrayList;
import java.util.Scanner;

public class Bankkunde {
    private String nachname;
    private ArrayList<Konto> konti = new ArrayList<>(4);

    private Scanner scan = new Scanner(System.in);

    public void neuesKonto() {
        if (konti.size() < 4) {
            Konto konto = new Konto();
            while (konto.getKontoNummer() == -1) {
                System.out.print("Geben Sie bitte eine 4-stellige Kontonummer ein: ");
                konto.setKontoNummer(scan.nextInt());
                scan.nextLine();
            }
            konti.add(konto);
        } else {
            System.out.println("Dieser Kunde hat schon die max. Anzahl Konti.");
        }
    }

    public void ausgabe() {
        System.out.println("Konti von " + nachname);
        for (Konto konto : konti) {
            System.out.println(konto.getKontoNummer());
        }
        System.out.println();
    }

    public Bankkunde() {
        neuesKonto();
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getNachname() {
        return nachname;
    }
}
