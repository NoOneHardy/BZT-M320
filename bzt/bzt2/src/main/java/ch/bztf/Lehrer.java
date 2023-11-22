package ch.bztf;

public class Lehrer extends Person {
    private String fachbereich = new String();

    public void setFachbereich(String fachbereich)
    {
        this.fachbereich = fachbereich;
    }

    public String  getFachbereich()
    {
        return fachbereich;
    }
}
