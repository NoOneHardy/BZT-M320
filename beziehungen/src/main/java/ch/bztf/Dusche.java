package ch.bztf;

/**
 * Eine Dusche ist eine Subklasse von Möbel.
 */
public class Dusche extends Moebel {
    /**
     * Der Türtyp der Dusche
     */
    private String tuerTyp;
    /**
     * Ist die Dusche transparent?
     */
    private boolean transparent;

    /**
     * Erstellt eine Dusche bzw. ein Möbel vom Typ Dusche.
     */
    public Dusche() {
        super("Dusche");
    }

    /**
     * Ein Getter für den Türtyp der Dusche.
     * @return Der Türtyp der Dusche
     */
    public String getTuerTyp() {
        return tuerTyp;
    }

    /**
     * Ein Getter für das Property ob die Dusche transparent ist.
     * @return Boolean ob die Dusche transparent ist
     */
    public boolean isTransparent() {
        return transparent;
    }

    /**
     * Ein Setter für den Türtyp der Dusche.
     * @param tuerTyp Der Türtyp der Dusche
     */
    public void setTuerTyp(String tuerTyp) {
        this.tuerTyp = tuerTyp;
    }

    /**
     * Ein Setter für das Property ob die Dusche transparent ist.
     * @param transparent Boolean ob die Dusche transparent ist
     */
    public void setTransparent(boolean transparent) {
        this.transparent = transparent;
    }

    /**
     * Gibt die Eigenschaften der Dusche in der Konsole aus.
     */
    @Override
    public void ausgabe() {
        super.ausgabe();
        System.out.println("\tTürtyp: " + (getTuerTyp() == null ? "Unbekannt" : getTuerTyp()));
        System.out.println("\tTransparent: " + (isTransparent() ? "Ja" : "Nein"));
        System.out.println();
    }
}
