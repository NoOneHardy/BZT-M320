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
        return "Guten Tag, ich heisse " + this.getNachname() + "! Von der " + this.getClass() + ". Ich lehre " + this.getFachbereich() + " und meine Personalnummer ist " + this.getPersonalNummer() + ".";
    }
}
