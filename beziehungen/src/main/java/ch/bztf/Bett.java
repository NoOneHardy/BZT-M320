package ch.bztf;

/**
 * Ein Bett ist eine Subklasse von Moebel.
 */
public class Bett extends Moebel {
    /**
     * Die Anzahl Plaetze des Bettes
     */
    private int plaetze = 1;
    /**
     * Ist das Bett gemacht?
     */
    private boolean gemacht;

    /**
     * Erstellt ein Bett bzw. ein Moebel vom Typ Bett.
     */
    public Bett() {
        super("Bett");
    }

    /**
     * Ein Getter fuer die Anzahl Plaetze des Bettes.
     * @return Die Anzahl Plaetze des Bettes
     */
    public int getPlaetze() {
        return plaetze;
    }

    /**
     * Ein Getter fuer das Property ob das Bett gemacht ist.
     * @return Boolean ob das Bett gemacht ist
     */
    public boolean isGemacht() {
        return gemacht;
    }

    /**
     * Ein Setter fuer die Anzahl Plaetze des Bettes.
     * @param plaetze Die Anzahl Plaetze des Bettes
     */
    public void setPlaetze(int plaetze) {
        this.plaetze = plaetze;
    }

    /**
     * Ein Setter fuer das Property ob das Bett gemacht ist.
     * @param gemacht Boolean ob das Bett gemacht ist
     */
    public void setGemacht(boolean gemacht) {
        this.gemacht = gemacht;
    }

    /**
     * Setzt das Property ob das Bett gemacht ist auf true.
     */
    public void machen() {
        setGemacht(true);
    }

    /**
     * Gibt die Eigenschaften des Bettes in der Konsole aus.
     */
    @Override
    public void ausgabe() {
        super.ausgabe();
        System.out.println("\tGemacht: " + (isGemacht() ? "Ja" : "Nein"));
        System.out.println("\tPlaetze: " + getPlaetze());
        System.out.println();
    }
}
