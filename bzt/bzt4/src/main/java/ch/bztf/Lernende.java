package ch.bztf;

public class Lernende extends Person {
    private int nummer;

    public Lernende(String nachname) {
        super(nachname);
    }

    public void setNummer(int nummer)
    {
        this.nummer = nummer;
    }

    public int getNummer()
    {
        return nummer;
    }

    public String vorstellen() {
        return "Guten Tag, ich heisse " + this.getNachname() + "! Von der " + this.getClass() + ". Meine Nummer ist " + this.getNummer() + ".";
    }
}
