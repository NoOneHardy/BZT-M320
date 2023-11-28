package ch.bztf;

import java.util.ArrayList;

public class Wohnzimmer extends Zimmer {
    private final ArrayList<Sofa> sofas = new ArrayList<>();
    private final ArrayList<Couchtisch> couchtische = new ArrayList<>();
    private int maxSofas = 1;
    private int maxCouchtische = 1;

    public Wohnzimmer(Couchtisch couchtisch, Sofa sofa, int maxSofas, int maxCouchtische) {
        super();
        setTyp("Wohnzimmer");
        setMaxSofas(maxSofas);
        setMaxCouchtische(maxCouchtische);
        sofaHinzufuegen(sofa);
        couchtischHinzufuegen(couchtisch);
    }

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

    public ArrayList<Sofa> getSofas() {
        return sofas;
    }

    public ArrayList<Couchtisch> getCouchtische() {
        return couchtische;
    }

    public int getMaxSofas() {
        return maxSofas;
    }

    public int getMaxCouchtische() {
        return maxCouchtische;
    }

    private void setMaxSofas(int maxSofas) {
        if (maxSofas < 1) {
            System.out.println("Ein Wohnzimmer benötigt mindestens ein Sofa.");
            System.out.println("Die Anzahl Sofas wird auf eins gesetzt.");
            maxSofas = 1;
        }
        this.maxSofas = maxSofas;
    }

    private void setMaxCouchtische(int maxCouchtische) {
        if (maxCouchtische < 1) {
            System.out.println("Ein Wohnzimmer benötigt mindestens einen Couchtisch .");
            System.out.println("Die Anzahl Couchtische wird auf eins gesetzt.");
            maxCouchtische = 1;
        }
        this.maxCouchtische = maxCouchtische;
    }

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

    public void sofaEntfernen(Sofa sofa) {
        if (sofas.contains(sofa) && sofa.getZimmer() != this) {
            if (sofas.size() > 1) {
                sofas.remove(sofa);
                moebelEntfernen(sofa);
            } else {
                System.out.println("Ein Wohnzimmer benötigt mindestens ein Sofa");
            }
        } else {
            System.out.println("Das Sofa befindet sich nicht in diesem Zimmer.");
        }
    }

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

    public void couchtischEntfernen(Couchtisch couchtisch) {
        if (couchtische.contains(couchtisch) && couchtisch.getZimmer() != this) {
            if (couchtische.size() > 1) {
                couchtische.remove(couchtisch);
                moebelEntfernen(couchtisch);
            } else {
                System.out.println("Ein Wohnzimmer benötigt mindestens einen Couchtisch");
            }
        } else {
            System.out.println("Der Couchtisch befindet sich nicht in diesem Zimmer.");
        }
    }

    @Override
    public ArrayList<Moebel> leeren() {
        ArrayList<Moebel> alteMoebel = super.leeren();
        for (Sofa sofa : sofas) {
            alteMoebel.add(sofa);
            sofaEntfernen(sofa);
        }
        for (Couchtisch couchtisch : couchtische) {
            alteMoebel.add(couchtisch);
            couchtischEntfernen(couchtisch);
        }
        return alteMoebel;
    }
}
