package ch.bztf;

/**
 * Ein Sofa ist eine Subklasse von Moebel.
 */
public class Sofa extends Moebel {
    /**
     * Die Anzahl Plaetze des Sofas
     */
    private int plaetze = 2;
    /**
     * Ist das Sofa ein Ecksofa?
     */
    private boolean ecksofa;

    /**
     * Erstellt ein Sofa bzw. ein Moebel vom Typ Sofa.
     */
    public Sofa() {
        super("Sofa");
    }

    /**
     * Ein Getter fuer die Anzahl Plaetze des Sofas.
     * @return Die Anzahl Plaetze des Sofas
     */
    public int getPlaetze() {
        return plaetze;
    }

    /**
     * Ein Getter fuer das Property, ob das Sofa ein Ecksofa ist.
     * @return Das Property, ob das Sofa ein Ecksofa ist
     */
    public boolean isEcksofa() {
        return ecksofa;
    }

    /**
     * Ein Setter fuer die Anzahl Plaetze des Sofas.
     * @param plaetze Die Anzahl Plaetze des Sofas
     */
    public void setPlaetze(int plaetze) {
        this.plaetze = plaetze;
    }

    /**
     * Ein Setter fuer das Property, ob das Sofa ein Ecksofa ist.
     * @param ecksofa Das Property, ob das Sofa ein Ecksofa ist
     */
    public void setEcksofa(boolean ecksofa) {
        this.ecksofa = ecksofa;
    }

    /**
     * Gibt die Eigenschaften des Sofas in der Konsole aus.
     */
    @Override
    public void ausgabe() {
        super.ausgabe();
        System.out.println("\tPlaetze: " + getPlaetze());
        System.out.println("\tEcksofa: " + (isEcksofa() ? "Ja" : "Nein"));
        System.out.println();
    }
}
