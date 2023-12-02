package ch.bztf;

/**
 * Ein Bett ist eine Subklasse von Möbel.
 */
public class Bett extends Moebel {
    /**
     * Die Anzahl Plätze des Bettes
     */
    private int plaetze = 1;
    /**
     * Ist das Bett gemacht?
     */
    private boolean gemacht;

    /**
     * Erstellt ein Bett bzw. ein Möbel vom Typ Bett.
     */
    public Bett() {
        super("Bett");
    }

    /**
     * Ein Getter für die Anzahl Plätze des Bettes.
     * @return Die Anzahl Plätze des Bettes
     */
    public int getPlaetze() {
        return plaetze;
    }

    /**
     * Ein Getter für das Property ob das Bett gemacht ist.
     * @return Boolean ob das Bett gemacht ist
     */
    public boolean isGemacht() {
        return gemacht;
    }

    /**
     * Ein Setter für die Anzahl Plätze des Bettes.
     * @param plaetze Die Anzahl Plätze des Bettes
     */
    public void setPlaetze(int plaetze) {
        this.plaetze = plaetze;
    }

    /**
     * Ein Setter für das Property ob das Bett gemacht ist.
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
        System.out.println("\tPlätze: " + getPlaetze());
        System.out.println();
    }
}
