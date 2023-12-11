package ch.bztf;

import java.util.ArrayList;

/**
 * Ein Schlafzimmer ist eine Subklasse von Zimmer.
 */
public class Schlafzimmer extends Zimmer {
    /**
     * Die Betten des Schlafzimmers
     */
    private final ArrayList<Bett> betten = new ArrayList<>();
    /**
     * Die maximale Anzahl Betten des Schlafzimmers
     */
    private int maxBetten = 1;

    /**
     * Erstellt ein Schlafzimmer mit einem oder mehreren Betten.
     */
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

    /**
     * Gibt die Betten des Schlafzimmers zurueck.
     * @return Die Betten des Schlafzimmers
     */
    public ArrayList<Bett> getBetten() {
        return betten;
    }

    /**
     * Gibt die maximale Anzahl Betten des Schlafzimmers zurueck.
     * @return Die maximale Anzahl Betten des Schlafzimmers
     */
    public int getMaxBetten() {
        return this.maxBetten;
    }

    /**
     * Setzt die maximale Anzahl Betten des Schlafzimmers.
     * @param maxBetten Die maximale Anzahl Betten des Schlafzimmers
     */
    private void setMaxBetten(int maxBetten) {
        this.maxBetten = maxBetten;
    }

    /**
     * Fuegt ein Bett dem Schlafzimmer hinzu.
     * @param bett Das Bett, welches dem Schlafzimmer hinzugefuegt werden soll
     */
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

    /**
     * Entfernt ein Bett aus dem Schlafzimmer.
     * @param bett Das Bett, welches aus dem Schlafzimmer entfernt werden soll
     */
    public void bettEntfernen(Bett bett) {
        if (betten.contains(bett) && bett.getZimmer() == this) {
            if (betten.size() > 1) {
                betten.remove(bett);
                moebelEntfernen(bett);
            } else {
                System.out.println("Ein Schlafzimmer benoetigt mindestens ein Bett.");
            }
        } else {
            System.out.println("Das Bett befindet sich nicht in diesem Zimmer.");
        }
    }

    /**
     * Gibt die Eigenschaften des Schlafzimmers in der Konsole aus.
     */
    @Override
    public void ausgabe() {
        super.ausgabe();
        System.out.println("\tMaximale Anzahl Betten: " + getMaxBetten());
        System.out.println("\tMomentane Anzahl Betten: " + getBetten().size());
        System.out.println();
    }
}
