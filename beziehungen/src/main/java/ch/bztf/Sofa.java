package ch.bztf;

/**
 * Ein Sofa ist eine Subklasse von Moebel.
 */
public class Sofa extends Moebel {
    /**
     * Die Anzahl Plätze des Sofas
     */
    private int plaetze = 2;
    /**
     * Ist das Sofa ein Ecksofa?
     */
    private boolean ecksofa;

    /**
     * Erstellt ein Sofa bzw. ein Möbel vom Typ Sofa.
     */
    public Sofa() {
        super("Sofa");
    }

    /**
     * Ein Getter für die Anzahl Plätze des Sofas.
     * @return Die Anzahl Plätze des Sofas
     */
    public int getPlaetze() {
        return plaetze;
    }

    /**
     * Ein Getter für das Property, ob das Sofa ein Ecksofa ist.
     * @return Das Property, ob das Sofa ein Ecksofa ist
     */
    public boolean isEcksofa() {
        return ecksofa;
    }

    /**
     * Ein Setter für die Anzahl Plätze des Sofas.
     * @param plaetze Die Anzahl Plätze des Sofas
     */
    public void setPlaetze(int plaetze) {
        this.plaetze = plaetze;
    }

    /**
     * Ein Setter für das Property, ob das Sofa ein Ecksofa ist.
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
        System.out.println("\tPlätze: " + getPlaetze());
        System.out.println("\tEcksofa: " + (isEcksofa() ? "Ja" : "Nein"));
        System.out.println();
    }
}
