package ch.bztf;

/**
 * Ein Lavabo ist eine Subklasse von Möbel.
 */
public class Lavabo extends Moebel {
    /**
     * Die Form des Lavabos
     */
    private String form;
    /**
     * Die Anzahl Hähne des Lavabos
     */
    private int anzahlHaehne = 1;

    /**
     * Erstellt ein Lavabo bzw. ein Möbel vom Typ Lavabo.
     */
    public Lavabo() {
        super("Lavabo");
    }

    /**
     * Ein Getter für die Form des Lavabos.
     * @return Die Form des Lavabos
     */
    public String getForm() {
        return this.form;
    }

    /**
     * Ein Getter für die Anzahl Hähne des Lavabos.
     * @return Die Anzahl Hähne des Lavabos
     */
    public int getAnzahlHaehne() {
        return anzahlHaehne;
    }

    /**
     * Ein Setter für die Form des Lavabos.
     * @param form Die Form des Lavabos
     */
    public void setForm(String form) {
        this.form = form;
    }

    /**
     * Ein Setter für die Anzahl Hähne des Lavabos.
     * @param anzahlHaehne Die Anzahl Hähne des Lavabos
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
        System.out.println("\tAnzahl Hähne: " + getAnzahlHaehne());
        System.out.println();
    }
}
