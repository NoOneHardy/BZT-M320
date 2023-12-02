package ch.bztf;

import java.util.ArrayList;

public class Schlafzimmer extends Zimmer {
    private final ArrayList<Bett> betten = new ArrayList<>();
    private int maxBetten = 1;

    public Schlafzimmer(ArrayList<Bett> betten) {
        super();
        setTyp("Schlafzimmer");
        if (betten.isEmpty()) {
            betten.add(new Bett());
            System.out.println("Ein Schlafzimmer braucht mindestens ein Bett.");
            System.out.println("Ein neues Bett wurde erstellt.");
            System.out.println("Die maximale Anzahl Betten wurde auf eins gesetzt.");
        }
        setMaxBetten(betten.size());
        for (Bett bett : betten) {
            bettHinzufuegen(bett);
        }
    }

    public ArrayList<Bett> getBetten() {
        return betten;
    }

    public int getMaxBetten() {
        return this.maxBetten;
    }

    private void setMaxBetten(int maxBetten) {
        this.maxBetten = maxBetten;
    }

    public void bettHinzufuegen(Bett bett) {
        if (!betten.contains(bett)) {
            if (bett.getZimmer() == null) {
                if (betten.size() < maxBetten) {
                    betten.add(bett);
                    moebelHinzufuegen(bett);
                } else {
                    System.out.println("Dieses Schlafzimmer hat schon die maximale Anzahl Betten. (" + maxBetten + ")");
                }
            } else {
                System.out.println("Dieses Bett befindet sich schon in einem anderen Zimmer.");
            }
        } else {
            System.out.println("Dieses Bett befindet sich schon in diesem Zimmer.");
        }
    }

    public void bettEntfernen(Bett bett) {
        if (betten.contains(bett) && bett.getZimmer() == this) {
            if (betten.size() > 1) {
                betten.remove(bett);
                moebelEntfernen(bett);
            } else {
                System.out.println("Ein Schlafzimmer benötigt mindestens ein Bett.");
            }
        } else {
            System.out.println("Das Bett befindet sich nicht in diesem Zimmer.");
        }
    }

    @Override
    public void ausgabe() {
        super.ausgabe();
        System.out.println("\tMaximale Anzahl Betten: " + getMaxBetten());
        System.out.println("\tMomentane Anzahl Betten: " + getBetten().size());
        System.out.println();
    }
}
