package ch.bztf;

import java.util.ArrayList;

/**
 * Ein Zimmer ist ein Raum in einem Haus.
 */
public class Zimmer {
    /**
     * Die Anzahl Fenster des Zimmers
     */
    private int anzahlFenster;
    /**
     * Die Anzahl Lampen des Zimmers
     */
    private int anzahlLampen;
    /**
     * Ist das Licht des Zimmers an?
     */
    private boolean lichtAn;
    /**
     * Der Typ des Zimmers
     */
    private String typ = "Nicht definiert";
    /**
     * Die Moebel des Zimmers
     */
    private final ArrayList<Moebel> moebelListe = new ArrayList<>();

    /**
     * Erstellt ein Zimmer mit einer Anzahl Fenster und Lampen.
     */
    public Zimmer() {}

    /**
     * Ein Getter fuer die Anzahl Fenster des Zimmers.
     * @return Die Anzahl Fenster des Zimmers
     */
    public int getAnzahlFenster() {
        return anzahlFenster;
    }

    /**
     * Ein Getter fuer die Anzahl Lampen des Zimmers.
     * @return Die Anzahl Lampen des Zimmers
     */
    public int getAnzahlLampen() {
        return anzahlLampen;
    }

    /**
     * Ein Getter fuer den Lichtstatus des Zimmers.
     * @return Ist das Licht des Zimmers an?
     */
    public boolean isLichtAn() {
        return lichtAn;
    }

    /**
     * Ein Getter fuer den Typ des Zimmers.
     * @return Der Typ des Zimmers
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Ein Getter fuer die Moebel des Zimmers.
     * @return Die Moebel des Zimmers
     */
    public ArrayList<Moebel> getMoebelListe() {
        return moebelListe;
    }

    /**
     * Ein Setter fuer den Typ des Zimmers.
     * @param typ Der Typ des Zimmers
     */
    public void setTyp(String typ) {
        this.typ = typ;
    }

    /**
     * Ein Setter fuer die Anzahl Fenster des Zimmers.
     * @param anzahlFenster Die Anzahl Fenster des Zimmers
     */
    public void setAnzahlFenster(int anzahlFenster) {
        this.anzahlFenster = anzahlFenster;
    }

    /**
     * Ein Setter fuer die Anzahl Lampen des Zimmers.
     * @param anzahlLampen Die Anzahl Lampen des Zimmers
     */
    public void setAnzahlLampen(int anzahlLampen) {
        this.anzahlLampen = anzahlLampen;
    }

    /**
     * Ein Setter fuer den Lichtstatus des Zimmers.
     * @param lichtAn Ist das Licht des Zimmers an?
     */
    public void setLichtAn(boolean lichtAn) {
        if (getAnzahlLampen() > 0) this.lichtAn = lichtAn;
        else System.out.println("Dieses Zimmer hat keine Lampen.");
    }

    /**
     * Fuegt dem Zimmer ein Moebel hinzu.
     * @param moebel Das Moebel, welches dem Zimmer hinzugefuegt werden soll
     */
    public void moebelHinzufuegen(Moebel moebel) {
        if (!moebelListe.contains(moebel) && moebel.getZimmer() == null) {
            moebelListe.add(moebel);
            moebel.einrichten(this);
        } else {
            System.out.println("Das Moebel befindet sich schon in einem anderen oder diesem Zimmer");
        }
    }

    /**
     * Entfernt ein Moebel aus dem Zimmer.
     * @param moebel Das Moebel, welches aus dem Zimmer entfernt werden soll
     */
    public void moebelEntfernen(Moebel moebel) {
        if (moebelListe.contains(moebel) && moebel.getZimmer() == this) {
            moebelListe.remove(moebel);
            moebel.ausZimmerNehmen();
        } else {
            System.out.println("Dieses Moebel steht nicht in diesem Zimmer");
        }
    }

    /**
     * Schaltet das Licht des Zimmers an oder aus.
     * @return Ist das Licht des Zimmers an?
     */
    public boolean betaetigeLichtschalter() {
        setLichtAn(!isLichtAn());
        return isLichtAn();
    }

    /**
     * Leert das Zimmer.
     * @return Die Moebel, welche sich im Zimmer befanden
     */
    public ArrayList<Moebel> leeren() {
        ArrayList<Moebel> alteMoebel = new ArrayList<>(moebelListe);
        for (Moebel moebel : moebelListe) {
            moebel.ausZimmerNehmen();
        }
        return alteMoebel;
    }

    /**
     * Gibt die Informationen des Zimmers in der Konsole aus.
     */
    public void ausgabe() {
        System.out.println(getTyp());
        System.out.println("\tAnzahl Fenster: " + getAnzahlFenster());
        System.out.println("\tAnzahl Lampen: " + getAnzahlLampen());
        if (getAnzahlLampen() > 0) System.out.println("\tLicht an: " + (isLichtAn() ? "Ja" : "Nein"));
        System.out.println("\tAnzahl Moebel: " + getMoebelListe().size());
        for (Moebel moebel : getMoebelListe()) {
            System.out.println("\t\t" + moebel.getTyp());
        }
        System.out.println();
    }
}
