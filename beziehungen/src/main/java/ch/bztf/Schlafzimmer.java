package ch.bztf;

import java.util.ArrayList;

public class Schlafzimmer extends Zimmer {
    private ArrayList<Bett> betten;

    public Schlafzimmer(Bett bett, int maxBetten) {
        super();
        betten = new ArrayList<>(maxBetten);
        bettHinzufuegen(bett);
        bett.einrichten(this);
    }

    public ArrayList<Bett> getBetten() {
        return betten;
    }

    public void bettHinzufuegen(Bett bett) {
        if (!betten.contains(bett) && bett.getZimmer() == null) {
            betten.add(bett);
            bett.einrichten(this);
        } else {
            System.out.println("Das Bett befindet sich schon in einem anderen oder diesem Zimmer");
        }
    }

    public void bettEntfernen(Bett bett) {
        if (!betten.contains(bett) && bett.getZimmer() == this && betten.size() > 1) {
            betten.remove(bett);
            bett.ausZimmerNehmen();
        } else {
            System.out.println("Das Bett befindet sich nicht in diesem Zimmer oder das Schlafzimmer hat ansonsten zu wenig Betten");
        }
    }
}
