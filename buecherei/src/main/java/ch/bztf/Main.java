package ch.bztf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    private static final char[] abc = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final Random random = new Random();

    public static void main(String[] args) {
        final int anzahlKunden = 5;
        final int anzahlBuecher = 16;

        List<Kunde> kunden = new ArrayList<Kunde>();
        List<Buch> buecher = new ArrayList<Buch>();

        for (int i = 0; i < anzahlKunden; i++) {
            kunden.add(new Kunde());
            kunden.get(i).setName(getWord());
        }
        kunden = Collections.unmodifiableList(kunden);

        for (int i = 0; i < anzahlBuecher; i++) {
            buecher.add(new Buch());
            buecher.get(i).setTitel(getWord());
        }
        buecher = Collections.unmodifiableList(buecher);

        for (int i = 0; i < buecher.size(); i++) {
            kunden.get(random.nextInt(anzahlKunden)).buchLeihen(buecher.get(i));
        }

        for (Kunde kunde : kunden) {
            System.out.println("***** " + kunde.getName() + " *****");
            if (kunde.buecherAusgehliehen()) {
                kunde.listeAusgeben();
            } else {
                System.out.println("Keine Buecher ausgeliehen.");
            }
            System.out.println();
        }
    }

    public static String getChar() {
        return "" + abc[random.nextInt(25)];
    }

    public static String getWord() {
        String word = "";
        for (int i = 0; i < random.nextInt(12) + 1; i++) {
            if (i == 0) {
                word = getChar().toUpperCase();
            }
            word += getChar();
        }
        return word;
    }
}