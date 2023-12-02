package ch.bztf;

/**
 * Ein Badezimmer ist eine Subklasse von Zimmer.
 */
public class Badezimmer extends Zimmer {
    /**
     * Das WC des Badezimmers
     */
    private WC wc;
    /**
     * Das Lavabo des Badezimmers
     */
    private Lavabo lavabo;
    /**
     * Die Dusche des Badezimmers
     */
    private Dusche dusche;

    /**
     * Erstellt ein Badezimmer mit einem WC, einem Lavabo und einer Dusche.
     * @param wc Das WC des Badezimmers
     * @param lavabo Das Lavabo des Badezimmers
     * @param dusche Die Dusche des Badezimmers
     */
    public Badezimmer(WC wc, Lavabo lavabo, Dusche dusche) {
        super();
        setTyp("Badezimmer");
        setWc(wc);
        setLavabo(lavabo);
        setDusche(dusche);
    }

    /**
     * Ein Getter für das WC des Badezimmers.
     * @return Das WC des Badezimmers
     */
    public WC getWc() {
        return wc;
    }

    /**
     * Ein Getter für das Lavabo des Badezimmers.
     * @return Das Lavabo des Badezimmers
     */
    public Lavabo getLavabo() {
        return lavabo;
    }

    /**
     * Ein Getter für die Dusche des Badezimmers.
     * @return Die Dusche des Badezimmers
     */
    public Dusche getDusche() {
        return dusche;
    }

    /**
     * Ein Setter für das WC des Badezimmers.
     * @param wc Das WC des Badezimmers
     */
    public void setWc(WC wc) {
        if (wc == null) {
            if (getWc() != null) return;
            wc = new WC();
            System.out.println("Ein Badezimmer braucht ein WC.");
            System.out.println("Ein neues WC wurde erstellt.");
        }
        if (getWc() != null) moebelEntfernen(getWc());
        this.wc = wc;
        moebelHinzufuegen(wc);
    }

    /**
     * Ein Setter für das Lavabo des Badezimmers.
     * @param lavabo Das Lavabo des Badezimmers
     */
    public void setLavabo(Lavabo lavabo) {
        if (lavabo == null) {
            if (getLavabo() != null) return;
            lavabo = new Lavabo();
            System.out.println("Ein Badezimmer braucht ein Lavabo.");
            System.out.println("Ein neues Lavabo wurde erstellt.");
        }
        if (getLavabo() != null) moebelEntfernen(getLavabo());
        this.lavabo = lavabo;
        moebelHinzufuegen(lavabo);
    }

    /**
     * Ein Setter für die Dusche des Badezimmers.
     * @param dusche Die Dusche des Badezimmers
     */
    public void setDusche(Dusche dusche) {
        if (dusche == null) {
            if (getDusche() != null) return;
            dusche = new Dusche();
            System.out.println("Ein Badezimmer braucht eine Dusche.");
            System.out.println("Eine neue Dusche wurde erstellt.");
        }
        if (getDusche() != null) moebelEntfernen(getDusche());
        this.dusche = dusche;
        moebelHinzufuegen(dusche);
    }
}
