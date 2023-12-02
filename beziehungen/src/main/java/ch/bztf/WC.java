package ch.bztf;

/**
 * Ein WC ist eine Subklasse von Moebel.
 */
public class WC extends Moebel {
    /**
     * Ist das WC elektrisch?
     */
    private boolean elektrisch;
    /**
     * Wurde das WC benutzt?
     */
    private boolean benutzt;

    /**
     * Erstellt ein WC bzw. ein Möbel vom Typ WC.
     */
    public WC() {
        super("WC");
    }

    /**
     * Ein Getter für das Property, ob das WC elektrisch ist.
     * @return Das Property, ob das WC elektrisch ist
     */
    public boolean isElektrisch() {
        return elektrisch;
    }

    /**
     * Ein Getter für das Property, ob das WC benutzt wurde.
     * @return Das Property, ob das WC benutzt wurde
     */
    public boolean isBenutzt() {
        return benutzt;
    }

    /**
     * Ein Setter für das Property, ob das WC elektrisch ist.
     * @param elektrisch Das Property, ob das WC elektrisch ist
     */
    public void setElektrisch(boolean elektrisch) {
        this.elektrisch = elektrisch;
        if (isBenutzt()) spuelen();
    }

    /**
     * Ein Setter für das Property, ob das WC benutzt wurde.
     * @param benutzt Das Property, ob das WC benutzt wurde
     */
    private void setBenutzt(boolean benutzt) {
        this.benutzt = benutzt;
    }

    /**
     * Setzt das Property, ob das WC benutzt wurde, auf true und spült es, falls es elektrisch ist.
     */
    public void benutzen() {
        setBenutzt(true);
        if (isElektrisch()) spuelen();
    }

    /**
     * Setzt das Property, ob das WC benutzt wurde, auf false.
     */
    public void spuelen() {
        setBenutzt(false);
    }

    /**
     * Gibt die Eigenschaften des WC in der Konsole aus.
     */
    @Override
    public void ausgabe() {
        super.ausgabe();
        System.out.println("\tElektrisch: " + (isElektrisch() ? "Ja" : "Nein"));
        System.out.println("\tBenutzt: " + (isBenutzt() ? "Ja" : "Nein"));
        System.out.println();
    }
}
