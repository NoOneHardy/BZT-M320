package ch.bztf;

/**
 * Eine Dusche ist eine Subklasse von Moebel.
 */
public class Dusche extends Moebel {
    /**
     * Der Tuertyp der Dusche
     */
    private String tuerTyp;
    /**
     * Ist die Dusche transparent?
     */
    private boolean transparent;

    /**
     * Erstellt eine Dusche bzw. ein Moebel vom Typ Dusche.
     */
    public Dusche() {
        super("Dusche");
    }

    /**
     * Ein Getter fuer den Tuertyp der Dusche.
     * @return Der Tuertyp der Dusche
     */
    public String getTuerTyp() {
        return tuerTyp;
    }

    /**
     * Ein Getter fuer das Property ob die Dusche transparent ist.
     * @return Boolean ob die Dusche transparent ist
     */
    public boolean isTransparent() {
        return transparent;
    }

    /**
     * Ein Setter fuer den Tuertyp der Dusche.
     * @param tuerTyp Der Tuertyp der Dusche
     */
    public void setTuerTyp(String tuerTyp) {
        this.tuerTyp = tuerTyp;
    }

    /**
     * Ein Setter fuer das Property ob die Dusche transparent ist.
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
        System.out.println("\tTuertyp: " + (getTuerTyp() == null ? "Unbekannt" : getTuerTyp()));
        System.out.println("\tTransparent: " + (isTransparent() ? "Ja" : "Nein"));
        System.out.println();
    }
}
