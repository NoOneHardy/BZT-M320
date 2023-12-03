package ch.bztf;

public class Mitarbeiter extends Person {
    protected int personalNummer;

    protected Mitarbeiter(String nachname, int personalNummer) {
        super(nachname);
        this.personalNummer = personalNummer;
    }

    protected Mitarbeiter(String nachname) {
        this(nachname, 0);
    }

    public int getPersonalNummer() {
        return this.personalNummer;
    }

    public void setPersonalNummer(int personalNummer) {
        this.personalNummer = personalNummer;
    }

    public String vorstellen() {
        return super.vorstellen() + " Meine Personalnummer ist " + this.getPersonalNummer() + ".";
    }
}
