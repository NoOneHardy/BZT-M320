package ch.bztf;

public class Lernende extends Person {
    private int nummer;

    public void setNummer(int nummer)
    {
        this.nummer = nummer;
    }

    public int getNummer()
    {
        return nummer;
    }

    public String vorstellen() {
        return "Ich heisse " + this.getNachname() + ". Meine Nummer ist " + this.getNummer() + ".";
    }
}
