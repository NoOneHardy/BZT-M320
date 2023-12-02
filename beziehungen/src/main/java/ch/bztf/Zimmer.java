package ch.bztf;

import java.util.ArrayList;

public class Zimmer {
    private int anzahlFenster;
    private int anzahlLampen;
    private boolean lichtAn;
    private String typ = "Nicht definiert";
    private final ArrayList<Moebel> moebelListe = new ArrayList<>();

    public Zimmer() {}

    public int getAnzahlFenster() {
        return anzahlFenster;
    }

    public int getAnzahlLampen() {
        return anzahlLampen;
    }

    public boolean isLichtAn() {
        return lichtAn;
    }

    public String getTyp() {
        return typ;
    }

    public ArrayList<Moebel> getMoebelListe() {
        return moebelListe;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setAnzahlFenster(int anzahlFenster) {
        this.anzahlFenster = anzahlFenster;
    }

    public void setAnzahlLampen(int anzahlLampen) {
        this.anzahlLampen = anzahlLampen;
    }

    public void setLichtAn(boolean lichtAn) {
        if (getAnzahlLampen() > 0) this.lichtAn = lichtAn;
        else System.out.println("Dieses Zimmer hat keine Lampen.");
    }

    public void moebelHinzufuegen(Moebel moebel) {
        if (!moebelListe.contains(moebel) && moebel.getZimmer() == null) {
            moebelListe.add(moebel);
            moebel.einrichten(this);
        } else {
            System.out.println("Das Möbel befindet sich schon in einem anderen oder diesem Zimmer");
        }
    }

    public void moebelEntfernen(Moebel moebel) {
        if (moebelListe.contains(moebel) && moebel.getZimmer() == this) {
            moebelListe.remove(moebel);
            moebel.ausZimmerNehmen();
        } else {
            System.out.println("Dieses Moebel steht nicht in diesem Zimmer");
        }
    }

    public boolean betaetigeLichtschalter() {
        setLichtAn(!isLichtAn());
        return isLichtAn();
    }

    public ArrayList<Moebel> leeren() {
        ArrayList<Moebel> alteMoebel = new ArrayList<>(moebelListe);
        for (Moebel moebel : moebelListe) {
            moebel.ausZimmerNehmen();
        }
        return alteMoebel;
    }

    public void ausgabe() {
        System.out.println(getTyp());
        System.out.println("\tAnzahl Fenster: " + getAnzahlFenster());
        System.out.println("\tAnzahl Lampen: " + getAnzahlLampen());
        if (getAnzahlLampen() > 0) System.out.println("\tLicht an: " + (isLichtAn() ? "Ja" : "Nein"));
        System.out.println("\tAnzahl Möbel: " + getMoebelListe().size());
        for (Moebel moebel : getMoebelListe()) {
            System.out.println("\t\t" + moebel.getTyp());
        }
        System.out.println();
    }
}
