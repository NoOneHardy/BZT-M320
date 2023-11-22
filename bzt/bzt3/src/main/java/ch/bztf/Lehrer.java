package ch.bztf;

public class Lehrer extends Mitarbeiter {
    private String fachbereich = new String();

    public void setFachbereich(String fachbereich)
    {
        this.fachbereich = fachbereich;
    }

    public String  getFachbereich()
    {
        return fachbereich;
    }

    public String vorstellen() {
        return "Guten Tag, ich heisse " + this.getNachname() + ". Ich lehre das Fach " + this.getFachbereich() + " und meine Personalnummer ist " + this.getPersonalNummer() + ".";
    }
}
