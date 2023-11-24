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
        if (wc != null) {
            this.wc = wc;
            wc.einrichten(this);
        } else {
            System.out.println("Ein Badezimmer braucht ein WC");
        }
    }

    public void setLavabo(Lavabo lavabo) {
        if (lavabo != null) {
            this.lavabo = lavabo;
            lavabo.einrichten(this);
        } else {
            System.out.println("Ein Badezimmer braucht ein Lavabo");
        }
    }

    public void setDusche(Dusche dusche) {
        if (dusche != null) {
            this.dusche = dusche;
            dusche.einrichten(this);
        } else {
            System.out.println("Ein Badezimmer braucht eine Dusche");
        }
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
