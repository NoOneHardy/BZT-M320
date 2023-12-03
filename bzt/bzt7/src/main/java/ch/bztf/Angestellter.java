package ch.bztf;

public class Angestellter extends Mitarbeiter {
    private boolean schulleitung;

    public Angestellter(String nachname, int personalNummer) {
        super(nachname, personalNummer);
    }

    public Angestellter(String nachname) {
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

    @Override
    public String toString() {
        return super.toString() + "\n\tSchulleitungsmitglied: " + (isSchulleitung() ? "Ja" : "Nein");
    }
}
