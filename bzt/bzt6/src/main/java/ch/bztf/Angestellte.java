package ch.bztf;

public class Angestellte extends Mitarbeiter {
    private boolean schulleitung;

    public Angestellte(String nachname, int personalNummer) {
        super(nachname, personalNummer);
    }

    public Angestellte(String nachname) {
        super(nachname);
    }

    public boolean isSchulleitung() {
        return this.schulleitung;
    }

    public void setSchulleitung(boolean schulleitung) {
        this.schulleitung = schulleitung;
    }

    public String vorstellen() {
        if (this.isSchulleitung()) {
            return super.vorstellen() + " Ich bin Schulleitungsmitglied.";
        }
        return super.vorstellen() + " Ich bin einfacher Angestellter.";
    }
}
