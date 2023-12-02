package ch.bztf;

public class Moebel {
    private String typ = "Nicht definiert";
    private String material;
    private double wert;
    private String hersteller;
    private Zimmer zimmer;
    private double laenge;
    private double breite;

    public Moebel(String typ) {
        setTyp(typ);
    }

    public String getTyp() {
        return typ;
    }

    public String getMaterial() {
        return material;
    }

    public double getWert() {
        return wert;
    }

    public String getHersteller() {
        return hersteller;
    }

    public Zimmer getZimmer() {
        return zimmer;
    }

    public double getLaenge() {
        return laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWert(double wert) {
        if (wert < 0) wert *= -1;
        this.wert = wert;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public void setZimmer(Zimmer zimmer) {
        this.zimmer = zimmer;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public void einrichten(Zimmer zimmer) {
        if (getZimmer() != zimmer) {
            setZimmer(zimmer);
        } else {
            System.out.println("Dieses Möbel befindet sich bereits in diesem Zimmer.");
        }
    }

    public void ausZimmerNehmen() {
        if (getZimmer() != null) {
            setZimmer(null);
        } else {
            System.out.println("Dieses Möbel ist in keinem Zimmer.");
        }
    }

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
