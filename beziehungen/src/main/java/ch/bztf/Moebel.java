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
        if (this.zimmer != zimmer) {
            setZimmer(zimmer);
        } else {
            System.out.println("Dieses Möbel befindet sich bereits in diesem Zimmer.");
        }
    }

    public void ausZimmerNehmen() {
        if (zimmer != null) {
            setZimmer(null);
        } else {
            System.out.println("Dieses Möbel ist in keinem Zimmer.");
        }
    }
}
