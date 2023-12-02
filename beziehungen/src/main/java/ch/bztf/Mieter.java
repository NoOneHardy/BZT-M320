package ch.bztf;

import java.util.ArrayList;

/**
 * Ein Mieter hat einen Namen und kann Wohnungen mieten.
 */
public class Mieter {
    /**
     * Der Name des Mieters
     */
    private String name;
    /**
     * Die Wohnungen des Mieters
     */
    private final ArrayList<Wohnung> wohnungen = new ArrayList<>();

    /**
     * Erstellt einen Mieter.
     * @param name Der Name des Mieters
     */
    public Mieter(String name) {
        setName(name);
    }

    /**
     * Ein Getter für den Namen des Mieters.
     * @return Der Name des Mieters
     */
    public String getName() {
        return name;
    }

    /**
     * Ein Getter für die Anzahl Wohnungen des Mieters.
     * @return Die Anzahl Wohnungen des Mieters
     */
    public int getAnzahlWohnungen() {
        return wohnungen.size();
    }

    /**
     * Ein Getter für die Wohnungen des Mieters.
     * @return Die Wohnungen des Mieters
     */
    public ArrayList<Wohnung> getWohnungen() {
        return wohnungen;
    }

    /**
     * Ein Setter für den Namen des Mieters.
     * @param name Der Name des Mieters
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mietet eine Wohnung.
     * @param wohnung Die zu mietende Wohnung
     */
    public void wohnungMieten(Wohnung wohnung) {
        if (!wohnung.isFrei()) {
            System.out.println("Diese Wohnung wird bereits an " + wohnung.getMieter().getName() + " vermietet.");
            return;
        }
        wohnungen.add(wohnung);
        wohnung.setMieter(this);
    }

    /**
     * Kündet eine Wohnung.
     * @param wohnung Die zu kündende Wohnung
     */
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

    /**
     * Gibt die Eigenschaften des Mieters in der Konsole aus.
     */
    public void ausgabe() {
        System.out.println(getName());
        System.out.println("\tAnzahl Wohnungen: " + getAnzahlWohnungen());
        for (Wohnung wohnung : getWohnungen()) {
            System.out.println("\t\t" + wohnung.getAdresse());
        }

        System.out.println();
    }
}
