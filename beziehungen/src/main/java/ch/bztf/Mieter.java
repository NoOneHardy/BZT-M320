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
        if (!wohnung.isFrei()) {
            System.out.println("Diese Wohnung wird bereits an " + wohnung.getMieter().getName() + " vermietet.");
            return;
        }

        wohnungen.add(wohnung);
        anzahlWohnungen++;
        wohnung.setMieter(this);
    }

    public void mietvertragKuenden(Wohnung wohnung) {
        if (wohnung.isFrei()) {
            System.out.println("Diese Wohnung wird nicht vermietet.");
            return;
        }

        if (wohnung.getMieter() != this || !wohnungen.contains(wohnung)) {
            System.out.println("Diese Wohnung wird nicht an diesen Mieter vermietet.");
            return;
        }

        wohnungen.remove(wohnung);
        anzahlWohnungen--;
        wohnung.setMieter(null);
    }
}
