package ch.bztf;

public class Angestellte extends Mitarbeiter {
    private boolean schulleitung;

    public boolean isSchulleitung() {
        return this.schulleitung;
    }

    public void setSchulleitung(boolean schulleitung) {
        this.schulleitung = schulleitung;
    }

    public String vorstellen() {
        if (this.isSchulleitung()) {
            return "Guten Tag, ich heisse " + this.getNachname() + ". Meine Personalnummer ist " + this.getPersonalNummer() + " und ich bin Schulleitungsmitglied.";
        }
        return "Guten Tag, ich heisse " + this.getNachname() + ". Meine Personalnummer ist " + this.getPersonalNummer() + " und ich bin einfacher Angestellter.";
    }
}
