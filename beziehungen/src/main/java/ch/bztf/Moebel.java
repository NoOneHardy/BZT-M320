package ch.bztf;

/**
 * Ein Möbel ist ein Objekt, welches in einem Zimmer platziert werden kann.
 */
public class Moebel {
    /**
     * Der Typ des Möbels
     */
    private String typ = "Nicht definiert";
    /**
     * Das Material des Möbels
     */
    private String material;
    /**
     * Der Wert des Möbels
     */
    private double wert;
    /**
     * Der Hersteller des Möbels
     */
    private String hersteller;
    /**
     * Das Zimmer, in welchem sich das Möbel befindet
     */
    private Zimmer zimmer;
    /**
     * Die Länge des Möbels
     */
    private double laenge;
    /**
     * Die Breite des Möbels
     */
    private double breite;

    /**
     * Erstellt ein Möbel.
     * @param typ Der Typ des Möbels
     */
    public Moebel(String typ) {
        setTyp(typ);
    }

    /**
     * Ein Getter für den Typ des Möbels.
     * @return Der Typ des Möbels
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Ein Getter für das Material des Möbels.
     * @return Das Material des Möbels
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Ein Getter für den Wert des Möbels.
     * @return Der Wert des Möbels
     */
    public double getWert() {
        return wert;
    }

    /**
     * Ein Getter für den Hersteller des Möbels.
     * @return Der Hersteller des Möbels
     */
    public String getHersteller() {
        return hersteller;
    }

    /**
     * Ein Getter für das Zimmer, in welchem sich das Möbel befindet.
     * @return Das Zimmer, in welchem sich das Möbel befindet
     */
    public Zimmer getZimmer() {
        return zimmer;
    }

    /**
     * Ein Getter für die Länge des Möbels.
     * @return Die Länge des Möbels
     */
    public double getLaenge() {
        return laenge;
    }

    /**
     * Ein Getter für die Breite des Möbels.
     * @return Die Breite des Möbels
     */
    public double getBreite() {
        return breite;
    }

    /**
     * Ein Setter für den Typ des Möbels.
     * @param typ Der Typ des Möbels
     */
    public void setTyp(String typ) {
        this.typ = typ;
    }

    /**
     * Ein Setter für das Material des Möbels.
     * @param material Das Material des Möbels
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Ein Setter für den Wert des Möbels.
     * @param wert Der Wert des Möbels
     */
    public void setWert(double wert) {
        if (wert < 0) wert *= -1;
        this.wert = wert;
    }

    /**
     * Ein Setter für den Hersteller des Möbels.
     * @param hersteller Der Hersteller des Möbels
     */
    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    /**
     * Ein Setter für das Zimmer, in welchem sich das Möbel befindet.
     * @param zimmer Das Zimmer, in welchem sich das Möbel befindet
     */
    public void setZimmer(Zimmer zimmer) {
        this.zimmer = zimmer;
    }

    /**
     * Ein Setter für die Länge des Möbels.
     * @param laenge Die Länge des Möbels
     */
    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    /**
     * Ein Setter für die Breite des Möbels.
     * @param breite Die Breite des Möbels
     */
    public void setBreite(double breite) {
        this.breite = breite;
    }

    /**
     * Platziert das Möbel in einem Zimmer.
     * @param zimmer Das Zimmer, in welchem sich das Möbel befinden soll
     */
    public void einrichten(Zimmer zimmer) {
        if (getZimmer() != zimmer) {
            setZimmer(zimmer);
        } else {
            System.out.println("Dieses Möbel befindet sich bereits in diesem Zimmer.");
        }
    }

    /**
     * Entfernt das Möbel aus einem Zimmer.
     */
    public void ausZimmerNehmen() {
        if (getZimmer() != null) {
            setZimmer(null);
        } else {
            System.out.println("Dieses Möbel ist in keinem Zimmer.");
        }
    }

    /**
     * Gibt die Eigenschaften des Möbels in der Konsole aus.
     */
    public void ausgabe() {
        System.out.println(getTyp());
        System.out.println("\tMaterial: " + (getMaterial() == null ? "Unbekannt" : getMaterial()));
        System.out.println("\tWert: " + (getWert() == 0 ? "Unbekannt" : "CHF " + getWert()));
        System.out.println("\tHersteller: " + (getHersteller() == null ? "Unbekannt" : getHersteller()));
        System.out.println("\tBreite: " + (getBreite() == 0 ? "Unbekannt" : getBreite() + "cm"));
        System.out.println("\tLänge: " + (getLaenge() == 0 ? "Unbekannt" : getLaenge() + "cm"));
        if (getZimmer() != null) System.out.println("\tZimmer: " + getZimmer().getTyp());
        System.out.println();
    }
}
