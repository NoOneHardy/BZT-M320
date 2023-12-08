package ch.bztf;

public abstract class Mitarbeiter extends Person {
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

    @Override
    public String toString() {
        String string = super.toString();
        string += "\n\tPersonalnummer: " + getPersonalNummer();
        return string;
    }

    @Override
    public int hashCode() {
        return personalNummer;
    }
}
