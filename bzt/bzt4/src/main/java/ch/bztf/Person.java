package ch.bztf;

public class Person {
    protected String nachname = new String();

    protected Person(String nachname) {
        this.nachname = nachname;
    }
    
    public void setNachname(String nachname)
    {
        this.nachname = nachname;
    }

    public String getNachname()
    {
        return nachname;
    }

    public String vorstellen() {
        return "Guten Tag, ich heisse " + this.getNachname() + "! Von der " + this.getClass() + ".";
    }
}
