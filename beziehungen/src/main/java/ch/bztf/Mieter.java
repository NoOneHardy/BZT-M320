package ch.bztf;

import java.util.ArrayList;

public class Mieter {
    private String name;
    private int anzahlWohnungen;
    private final ArrayList<Wohnung> wohnungen = new ArrayList<>();

    public Mieter(String name) {
        setName(name);
    }


    public String getName() {
        return name;
    }

    public int getAnzahlWohnungen() {
        return anzahlWohnungen;
    }

    public ArrayList<Wohnung> getWohnungen() {
        return wohnungen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void wohnungMieten(Wohnung wohnung) {
    }
}
