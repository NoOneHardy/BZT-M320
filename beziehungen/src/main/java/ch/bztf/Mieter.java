package ch.bztf;

import java.util.ArrayList;

public class Mieter {
    private String name;
    private final ArrayList<Wohnung> wohnungen = new ArrayList<>();

    public Mieter(String name) {
        setName(name);
    }


    public String getName() {
        return name;
    }

    public int getAnzahlWohnungen() {
        return wohnungen.size();
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
        wohnung.setMieter(null);
    }

    public void ausgabe() {
        System.out.println(getName());
        System.out.println("\tAnzahl Wohnungen: " + getAnzahlWohnungen());
        for (Wohnung wohnung : getWohnungen()) {
            System.out.println("\t\t" + wohnung.getAdresse());
        }

        System.out.println();
    }
}
