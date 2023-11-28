package ch.bztf;

import java.util.ArrayList;

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
            wc = new WC();
            System.out.println("Ein Badezimmer braucht ein WC.");
            System.out.println("Ein neues WC wurde erstellt.");
        }
        if (this.wc != null) moebelEntfernen(this.wc);
        this.wc = wc;
        moebelHinzufuegen(wc);
    }

    public void setLavabo(Lavabo lavabo) {
        if (lavabo == null) {
            lavabo = new Lavabo();
            System.out.println("Ein Badezimmer braucht ein Lavabo.");
            System.out.println("Ein neues Lavabo wurde erstellt.");
        }
        if (this.lavabo != null) moebelEntfernen(this.lavabo);
        this.lavabo = lavabo;
        moebelHinzufuegen(lavabo);
    }

    public void setDusche(Dusche dusche) {
        if (dusche == null) {
            dusche = new Dusche();
            System.out.println("Ein Badezimmer braucht eine Dusche.");
            System.out.println("Eine neue Dusche wurde erstellt.");
        }
        if (this.dusche != null) moebelEntfernen(this.dusche);
        this.dusche = dusche;
        moebelHinzufuegen(dusche);
    }

    @Override
    public ArrayList<Moebel> leeren() {
        final ArrayList<Moebel> alteMoebel = super.leeren();
        alteMoebel.add(wc);
        alteMoebel.add(lavabo);
        alteMoebel.add(dusche);
        wc.ausZimmerNehmen();
        lavabo.ausZimmerNehmen();
        dusche.ausZimmerNehmen();
        return alteMoebel;
    }
}
