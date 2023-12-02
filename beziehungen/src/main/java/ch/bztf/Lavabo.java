package ch.bztf;

public class Lavabo extends Moebel {
    private String form;
    private int anzahlHaehne = 1;

    public Lavabo() {
        super("Lavabo");
    }

    public String getForm() {
        return this.form;
    }

    public int getAnzahlHaehne() {
        return anzahlHaehne;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setAnzahlHaehne(int anzahlHaehne) {
        this.anzahlHaehne = anzahlHaehne;
    }

    @Override
    public void ausgabe() {
        super.ausgabe();
        System.out.println("\tForm: " + (getForm() == null ? "Unbekannt" : getForm()));
        System.out.println("\tAnzahl Hähne: " + getAnzahlHaehne());
        System.out.println();
    }
}
