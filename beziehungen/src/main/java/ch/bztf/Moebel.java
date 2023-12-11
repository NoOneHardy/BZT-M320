package ch.bztf;

/**
 * Ein Moebel ist ein Objekt, welches in einem Zimmer platziert werden kann.
 */
public class Moebel {
    /**
     * Der Typ des Moebels
     */
    private String typ = "Nicht definiert";
    /**
     * Das Material des Moebels
     */
    private String material;
    /**
     * Der Wert des Moebels
     */
    private double wert;
    /**
     * Der Hersteller des Moebels
     */
    private String hersteller;
    /**
     * Das Zimmer, in welchem sich das Moebel befindet
     */
    private Zimmer zimmer;
    /**
     * Die Laenge des Moebels
     */
    private double laenge;
    /**
     * Die Breite des Moebels
     */
    private double breite;

    /**
     * Erstellt ein Moebel.
     * @param typ Der Typ des Moebels
     */
    public Moebel(String typ) {
        setTyp(typ);
    }

    /**
     * Ein Getter fuer den Typ des Moebels.
     * @return Der Typ des Moebels
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Ein Getter fuer das Material des Moebels.
     * @return Das Material des Moebels
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Ein Getter fuer den Wert des Moebels.
     * @return Der Wert des Moebels
     */
    public double getWert() {
        return wert;
    }

    /**
     * Ein Getter fuer den Hersteller des Moebels.
     * @return Der Hersteller des Moebels
     */
    public String getHersteller() {
        return hersteller;
    }

    /**
     * Ein Getter fuer das Zimmer, in welchem sich das Moebel befindet.
     * @return Das Zimmer, in welchem sich das Moebel befindet
     */
    public Zimmer getZimmer() {
        return zimmer;
    }

    /**
     * Ein Getter fuer die Laenge des Moebels.
     * @return Die Laenge des Moebels
     */
    public double getLaenge() {
        return laenge;
    }

    /**
     * Ein Getter fuer die Breite des Moebels.
     * @return Die Breite des Moebels
     */
    public double getBreite() {
        return breite;
    }

    /**
     * Ein Setter fuer den Typ des Moebels.
     * @param typ Der Typ des Moebels
     */
    public void setTyp(String typ) {
        this.typ = typ;
    }

    /**
     * Ein Setter fuer das Material des Moebels.
     * @param material Das Material des Moebels
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Ein Setter fuer den Wert des Moebels.
     * @param wert Der Wert des Moebels
     */
    public void setWert(double wert) {
        if (wert < 0) wert *= -1;
        this.wert = wert;
    }

    /**
     * Ein Setter fuer den Hersteller des Moebels.
     * @param hersteller Der Hersteller des Moebels
     */
    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    /**
     * Ein Setter fuer das Zimmer, in welchem sich das Moebel befindet.
     * @param zimmer Das Zimmer, in welchem sich das Moebel befindet
     */
    public void setZimmer(Zimmer zimmer) {
        this.zimmer = zimmer;
    }

    /**
     * Ein Setter fuer die Laenge des Moebels.
     * @param laenge Die Laenge des Moebels
     */
    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    /**
     * Ein Setter fuer die Breite des Moebels.
     * @param breite Die Breite des Moebels
     */
    public void setBreite(double breite) {
        this.breite = breite;
    }

    /**
     * Platziert das Moebel in einem Zimmer.
     * @param zimmer Das Zimmer, in welchem sich das Moebel befinden soll
     */
    public void einrichten(Zimmer zimmer) {
        if (getZimmer() != zimmer) {
            setZimmer(zimmer);
        } else {
            System.out.println("Dieses Moebel befindet sich bereits in diesem Zimmer.");
        }
    }

    /**
     * Entfernt das Moebel aus einem Zimmer.
     */
    public void ausZimmerNehmen() {
        if (getZimmer() != null) {
            setZimmer(null);
        } else {
            System.out.println("Dieses Moebel ist in keinem Zimmer.");
        }
    }

    /**
     * Gibt die Eigenschaften des Moebels in der Konsole aus.
     */
    public void ausgabe() {
        System.out.println(getTyp());
        System.out.println("\tMaterial: " + (getMaterial() == null ? "Unbekannt" : getMaterial()));
        System.out.println("\tWert: " + (getWert() == 0 ? "Unbekannt" : "CHF " + getWert()));
        System.out.println("\tHersteller: " + (getHersteller() == null ? "Unbekannt" : getHersteller()));
        System.out.println("\tBreite: " + (getBreite() == 0 ? "Unbekannt" : getBreite() + "cm"));
        System.out.println("\tLaenge: " + (getLaenge() == 0 ? "Unbekannt" : getLaenge() + "cm"));
        if (getZimmer() != null) System.out.println("\tZimmer: " + getZimmer().getTyp());
        System.out.println();
    }
}
