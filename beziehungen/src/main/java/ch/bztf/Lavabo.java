package ch.bztf;

/**
 * Ein Lavabo ist eine Subklasse von Moebel.
 */
public class Lavabo extends Moebel {
    /**
     * Die Form des Lavabos
     */
    private String form;
    /**
     * Die Anzahl Haehne des Lavabos
     */
    private int anzahlHaehne = 1;

    /**
     * Erstellt ein Lavabo bzw. ein Moebel vom Typ Lavabo.
     */
    public Lavabo() {
        super("Lavabo");
    }

    /**
     * Ein Getter fuer die Form des Lavabos.
     * @return Die Form des Lavabos
     */
    public String getForm() {
        return this.form;
    }

    /**
     * Ein Getter fuer die Anzahl Haehne des Lavabos.
     * @return Die Anzahl Haehne des Lavabos
     */
    public int getAnzahlHaehne() {
        return anzahlHaehne;
    }

    /**
     * Ein Setter fuer die Form des Lavabos.
     * @param form Die Form des Lavabos
     */
    public void setForm(String form) {
        this.form = form;
    }

    /**
     * Ein Setter fuer die Anzahl Haehne des Lavabos.
     * @param anzahlHaehne Die Anzahl Haehne des Lavabos
     */
    public void setAnzahlHaehne(int anzahlHaehne) {
        this.anzahlHaehne = anzahlHaehne;
    }

    /**
     * Gibt die Eigenschaften des Lavabos in der Konsole aus.
     */
    @Override
    public void ausgabe() {
        super.ausgabe();
        System.out.println("\tForm: " + (getForm() == null ? "Unbekannt" : getForm()));
        System.out.println("\tAnzahl Haehne: " + getAnzahlHaehne());
        System.out.println();
    }
}
