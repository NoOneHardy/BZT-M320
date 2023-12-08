package ch.bztf;

public class Lernender extends Person {
    private int nummer;

    public double kantineKonsum(int anzahl) {
        // Erhalten 10%
        return anzahl * MINPREIS * 0.9;
    }

    public Lernender(String nachname) {
        super(nachname);
    }

    public void setNummer(int nummer)
    {
        this.nummer = nummer;
    }

    public int getNummer()
    {
        return nummer;
    }

    public String vorstellen() {
        return super.vorstellen() + " Meine Nummer ist " + this.getNummer() + ".";
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tNummer: " + getNummer();
    }

    @Override
    public int hashCode() {
        return nummer;
    }

    @Override
    public int inKantine() {
        return (int)(Math.random() * 10);
    }

    @Override
    public String bewertung() {
        if (inKantine() > 5) {
            if ((int) (Math.random() * 10) >= 5) {
                return "War akzeptabel";
            } else {
                return "Hat Verbesserungspotential";
            }
        } else {
            return "War nicht in Mensa!";
        }
    }
}
