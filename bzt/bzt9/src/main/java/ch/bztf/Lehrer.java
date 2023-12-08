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
}
