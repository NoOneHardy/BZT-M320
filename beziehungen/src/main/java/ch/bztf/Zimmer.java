package ch.bztf;

import java.util.ArrayList;

public class Zimmer {
    private int anzahlFenster;
    private int anzahlLampen;
    private boolean lichtAn;
    private String typ;
    private final ArrayList<Moebel> moebelListe = new ArrayList<>();

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

    public void setAnzahlFenster(int anzahlFenster) {
        this.anzahlFenster = anzahlFenster;
    }

    public void setAnzahlLampen(int anzahlLampen) {
        this.anzahlLampen = anzahlLampen;
    }

    public void setLichtAn(boolean lichtAn) {
        this.lichtAn = lichtAn;
    }

    public void setTyp(String typ) {
        this.typ = typ;
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
        if (!moebelListe.contains(moebel) && moebel.getZimmer() == this) {
            moebelListe.remove(moebel);
            moebel.ausZimmerNehmen();
        }
    }

    public boolean betaetigeLichtschalter() {
        setLichtAn(!isLichtAn());
        return isLichtAn();
    }

    public ArrayList<Moebel> leeren() {
        ArrayList<Moebel> alteMoebel = new ArrayList<>();
        for (Moebel moebel : moebelListe) {
            alteMoebel.add(moebel);
            moebelEntfernen(moebel);
        }
        return alteMoebel;
    }
}
