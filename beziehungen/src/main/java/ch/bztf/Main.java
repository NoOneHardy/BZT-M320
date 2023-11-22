package ch.bztf;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mieter> mieter = new ArrayList<Mieter>();
        ArrayList<Wohnung> wohnungen = new ArrayList<Wohnung>();

        mieter.add(new Mieter("Koster"));
        mieter.add(new Mieter("Grimm"));

        wohnungen.add(new Wohnung(5, "Kohlstrasse 3"));
        wohnungen.add(new Wohnung(3, "Bächliweg 7"));

        listAll(mieter, wohnungen);

        wohnungen.get(0).getZimmer(0).setTyp("Schlafzimmer");
        wohnungen.get(0).getZimmer(1).setTyp("Schlafzimmer");
        
    }

    public static void listAll(ArrayList<Mieter> mieterList, ArrayList<Wohnung> wohnungen) {
        System.out.println("Mieter-------------------");
        for (Mieter mieter : mieterList) {
            System.out.println("- " + mieter.getName());
        }
        System.out.println();
        System.out.println("Wohnungen----------------");
        for (Wohnung wohnung : wohnungen) {
            System.out.println("- " + wohnung.getAdresse());
            if (wohnung.istFrei()) {
                System.out.println("  - Ist frei?: Ja");
            } else {
                System.out.println("  - Ist frei?: Nein");
                System.out.println("  - Mieter: " + wohnung.getMieter().getName());
            }
            System.out.println();
        }
    }
}