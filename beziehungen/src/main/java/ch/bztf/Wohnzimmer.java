package ch.bztf;

import java.util.ArrayList;

/**
 * Ein Wohnzimmer ist eine Subklasse von Zimmer.
 */
public class Wohnzimmer extends Zimmer {
    /**
     * Die Sofas des Wohnzimmers
     */
    private final ArrayList<Sofa> sofas = new ArrayList<>();
    /**
     * Die Couchtische des Wohnzimmers
     */
    private final ArrayList<Couchtisch> couchtische = new ArrayList<>();
    /**
     * Die maximale Anzahl Sofas des Wohnzimmers
     */
    private int maxSofas = 1;
    /**
     * Die maximale Anzahl Couchtische des Wohnzimmers
     */
    private int maxCouchtische = 1;

    /**
     * Erstellt ein Wohnzimmer mit einem oder mehreren Sofas und Couchtischen.
     */
    public Wohnzimmer(ArrayList<Couchtisch> couchtische, ArrayList<Sofa> sofas) {
        super();
        setTyp("Wohnzimmer");
        if (couchtische.isEmpty()) {
            couchtische.add(new Couchtisch());
            System.out.println("Ein Wohnzimmer braucht mindestens einen Couchtisch.");
            System.out.println("Ein neuer Couchtisch wurde erstellt.");
            System.out.println("Die maximale Anzahl Couchtische wurde auf eins gesetzt.");
        }
        if (sofas.isEmpty()) {
            sofas.add(new Sofa());
            System.out.println("Ein Wohnzimmer braucht mindestens ein Sofa.");
            System.out.println("Ein neues Sofa wurde erstellt.");
            System.out.println("Die maximale Anzahl Sofas wurde auf eins gesetzt.");
        }
        setMaxCouchtische(couchtische.size());
        setMaxSofas(sofas.size());
        for (Couchtisch couchtisch : couchtische) {
            couchtischHinzufuegen(couchtisch);
        }
        for (Sofa sofa : sofas) {
            sofaHinzufuegen(sofa);
        }
    }

    /**
     * Gibt die Sofas des Wohnzimmers zurueck.
     * @return Die Sofas des Wohnzimmers
     */
    public ArrayList<Sofa> getSofas() {
        return sofas;
    }

    /**
     * Gibt die Couchtische des Wohnzimmers zurueck.
     * @return Die Couchtische des Wohnzimmers
     */
    public ArrayList<Couchtisch> getCouchtische() {
        return couchtische;
    }

    /**
     * Gibt die maximale Anzahl Sofas des Wohnzimmers zurueck.
     * @return Die maximale Anzahl Sofas des Wohnzimmers
     */
    public int getMaxSofas() {
        return maxSofas;
    }

    /**
     * Gibt die maximale Anzahl Couchtische des Wohnzimmers zurueck.
     * @return Die maximale Anzahl Couchtische des Wohnzimmers
     */
    public int getMaxCouchtische() {
        return maxCouchtische;
    }

    /**
     * Setzt die maximale Anzahl Sofas des Wohnzimmers.
     * @param maxSofas Die maximale Anzahl Sofas des Wohnzimmers
     */
    private void setMaxSofas(int maxSofas) {
        this.maxSofas = maxSofas;
    }

    /**
     * Setzt die maximale Anzahl Couchtische des Wohnzimmers.
     * @param maxCouchtische Die maximale Anzahl Couchtische des Wohnzimmers
     */
    private void setMaxCouchtische(int maxCouchtische) {
        this.maxCouchtische = maxCouchtische;
    }

    /**
     * Fuegt dem Wohnzimmer ein Sofa hinzu.
     * @param sofa Das Sofa, welches dem Wohnzimmer hinzugefuegt werden soll
     */
    public void sofaHinzufuegen(Sofa sofa) {
        if (!sofas.contains(sofa)) {
            if (sofa.getZimmer() == null) {
                if (sofas.size() < maxSofas) {
                    sofas.add(sofa);
                    moebelHinzufuegen(sofa);
                } else {
                    System.out.println("Dieses Wohnzimmer hat schon die maximale Anzahl Sofas. (" + maxSofas + ")");
                }
            } else {
                System.out.println("Dieses Sofa befindet sich schon in einem anderen Zimmer.");
            }
        } else {
            System.out.println("Dieses Sofa befindet sich bereits in diesem Zimmer.");
        }
    }

    /**
     * Entfernt ein Sofa aus dem Wohnzimmer.
     * @param sofa Das Sofa, welches aus dem Wohnzimmer entfernt werden soll
     */
    public void sofaEntfernen(Sofa sofa) {
        if (sofas.contains(sofa) && sofa.getZimmer() == this) {
            if (sofas.size() > 1) {
                sofas.remove(sofa);
                moebelEntfernen(sofa);
            } else {
                System.out.println("Ein Wohnzimmer benoetigt mindestens ein Sofa");
            }
        } else {
            System.out.println("Das Sofa befindet sich nicht in diesem Zimmer.");
        }
    }

    /**
     * Fuegt dem Wohnzimmer einen Couchtisch hinzu.
     * @param couchtisch Der Couchtisch, welcher dem Wohnzimmer hinzugefuegt werden soll
     */
    public void couchtischHinzufuegen(Couchtisch couchtisch) {
        if (!couchtische.contains(couchtisch)) {
            if (couchtisch.getZimmer() == null) {
                if (couchtische.size() < maxCouchtische) {
                    couchtische.add(couchtisch);
                    moebelHinzufuegen(couchtisch);
                } else {
                    System.out.println("Dieses Wohnzimmer hat schon die maximale Anzahl Couchtische. (" + maxCouchtische + ")");
                }
            } else {
                System.out.println("Dieser Couchtisch befindet sich schon in einem anderen Zimmer.");
            }
        } else {
            System.out.println("Dieser Couchtisch befindet sich bereits in diesem Zimmer.");
        }
    }

    /**
     * Entfernt ein Couchtisch aus dem Wohnzimmer.
     * @param couchtisch Der Couchtisch, welcher aus dem Wohnzimmer entfernt werden soll
     */
    public void couchtischEntfernen(Couchtisch couchtisch) {
        if (couchtische.contains(couchtisch) && couchtisch.getZimmer() == this) {
            if (couchtische.size() > 1) {
                couchtische.remove(couchtisch);
                moebelEntfernen(couchtisch);
            } else {
                System.out.println("Ein Wohnzimmer benoetigt mindestens einen Couchtisch");
            }
        } else {
            System.out.println("Der Couchtisch befindet sich nicht in diesem Zimmer.");
        }
    }

    /**
     * Gibt die Informationen des Wohnzimmers in der Konsole aus.
     */
    @Override
    public void ausgabe() {
        super.ausgabe();
        System.out.println("\tMaximale Anzahl Sofas: " + getMaxSofas());
        System.out.println("\tMomentane Anzahl Sofas: " + getSofas().size());
        System.out.println("\tMaximale Anzahl Couchtische: " + getMaxCouchtische());
        System.out.println("\tMomentane Anzahl Couchtische: " + getCouchtische().size());
    }
}
