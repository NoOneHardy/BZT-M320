package ch.bztf;

public class Lehrer extends Mitarbeiter {
    private String fachbereich = new String();

    public Lehrer(String nachname, int personalNummer, String fachBereich) {
        super(nachname, personalNummer);
        this.fachbereich = fachBereich;
    }

    public void setFachbereich(String fachbereich)
    {
        this.fachbereich = fachbereich;
    }

    public String  getFachbereich()
    {
        return fachbereich;
    }

    public String vorstellen() {
        return super.vorstellen() + " Ich lehre " + this.getFachbereich() + ".";
    }
}
