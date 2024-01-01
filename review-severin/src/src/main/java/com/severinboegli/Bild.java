package com.severinboegli;

/**
 * Definiert die Eigenschaften eines Bildes. Ein Bild hat eine Beschreibung, einen Pfad, eine Höhe und eine Breite.
 * @version 1.0
 * @since 2023-11-20
 * @author Severin Bögli
 */
public class Bild {
    private String beschreibung;
    private String pfad;
    private int hoehe;
    private int breite;

    /**
     * Konstruktor für das Bild ohne Beschreibung
     * @param pfad setzt den Pfad des Bildes als String
     * @param breite setzt die Breite des Bildes als int
     * @param hoehe setzt die Höhe des Bildes als int
     */
    public Bild(String pfad, int breite, int hoehe) {
        setPfad(pfad);
        setBreite(breite);
        setHoehe(hoehe);
    }

    /**
     * Konstruktor für das Bild mit Beschreibung
     * @param pfad setzt den Pfad des Bildes als String
     * @param breite setzt die Breite des Bildes als int
     * @param hoehe setzt die Höhe des Bildes als int
     * @param beschreibung setzt die Beschreibung des Bildes als String
     */
    public Bild(String pfad, int breite, int hoehe, String beschreibung) {
        setPfad(pfad);
        setBreite(breite);
        setHoehe(hoehe);
        setBeschreibung(beschreibung);
    }

    /**
     * Setter für die Beschreibung des Bildes
     * @param beschreibung Beschreibung des Bildes
     */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * Getter für die Beschreibung des Bildes
     * @return Gibt die Beschreibung des Bildes zurück
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Setter für den Pfad des Bildes
     * @param pfad setzt den Pfad des Bildes
     */
    public void setPfad(String pfad) {
        this.pfad = pfad;
    }

    /**
     * Getter für den Pfad des Bildes
     * @return gibt den Pfad des Bildes zurück
     */
    public String getPfad() {
        return pfad;
    }

    /**
     * Setter für die Höhe des Bildes
     * @param hoehe bestimmt die Höhe des Bildes
     */
    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    /**
     * Getter für die Höhe des Bildes
     * @return gibt die Höhe des Bildes zurück
     */
    public int getHoehe() {
        return hoehe;
    }

    /**
     * Setter für die Breite des Bildes
     * @param breite definiert die Breite des Bildes.
     */
    public void setBreite(int breite) {
        this.breite = breite;
    }

    /**
     * Getter für die Breite des Bildes
     * @return gibt die Breite des Bildes zurück
     */
    public int getBreite() {
        return breite;
    }
}
