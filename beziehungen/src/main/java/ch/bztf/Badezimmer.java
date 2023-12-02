package ch.bztf;

public class Badezimmer extends Zimmer {
    private WC wc;
    private Lavabo lavabo;
    private Dusche dusche;

    public Badezimmer(WC wc, Lavabo lavabo, Dusche dusche) {
        super();
        setTyp("Badezimmer");
        setWc(wc);
        setLavabo(lavabo);
        setDusche(dusche);
    }

    public WC getWc() {
        return wc;
    }

    public Lavabo getLavabo() {
        return lavabo;
    }

    public Dusche getDusche() {
        return dusche;
    }

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
