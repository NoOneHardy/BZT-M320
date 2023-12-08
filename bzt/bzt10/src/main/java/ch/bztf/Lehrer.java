package ch.bztf;

public class Lehrer extends Mitarbeiter {
    private String fachbereich;

    public Lehrer(String nachname, int personalNummer, String fachbereich) {
        super(nachname, personalNummer);
        this.fachbereich = fachbereich;
    }

    public void setFachbereich(String fachbereich)
    {
        this.fachbereich = fachbereich;
    }

    public String  getFachbereich()
    {
        return fachbereich;
    }

    public double kantineKonsum(int anzahl) {
        if (anzahl < 8) {
            anzahl = 8;
        }
        return anzahl * MINPREIS;
    }

    public String vorstellen() {
        return super.vorstellen() + " Ich lehre " + this.getFachbereich() + ".";
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tFachbereich: " + getFachbereich();
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
