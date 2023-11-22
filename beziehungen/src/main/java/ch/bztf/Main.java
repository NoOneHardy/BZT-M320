package ch.bztf;

import java.util.ArrayList;

public class Main {
    private static final ArrayList<Mieter> mieterList = new ArrayList<>();
    private static final ArrayList<Wohnung> wohnungList = new ArrayList<>();
    private static final ArrayList<Moebel> moebelList = new ArrayList<>();

    public static void main(String[] args) {
        // Random random = new Random();

        mieterList.add(new Mieter("Koster"));
        mieterList.add(new Mieter("Grimm"));

        wohnungList.add(new Wohnung(5, "Kohlstrasse 3"));
        wohnungList.add(new Wohnung(4, "Bächliweg 7"));

        listAll();

        /*
        for (Wohnung wohnung : wohnungList) {
            for (int i = 0; wohnung.getAnzahlUngenutzteZimmer() > 0; i++) {
                wohnung.setZimmerTyp("Zimmertyp " + i, random.nextInt(1, wohnung.getAnzahlUngenutzteZimmer()));
            }
        }
        */

        wohnungList.get(0).setZimmerTyp("Schlafzimmer", 6);
        wohnungList.get(0).setZimmerTyp("Schlafzimmer", 2);
        wohnungList.get(0).setZimmerTyp("Küche", 4);
        wohnungList.get(0).setZimmerTyp("Küche", 1);
        wohnungList.get(0).setZimmerTyp("Badezimmer", 1);
        wohnungList.get(0).setZimmerTyp("Büro", 2);
        wohnungList.get(0).setZimmerTyp("Büro", 1);
        wohnungList.get(0).setZimmerTyp("Gym", 1);

        wohnungList.get(1).setZimmerTyp("Schlafzimmer", 1);
        wohnungList.get(1).setZimmerTyp("Badezimmer", 1);
        wohnungList.get(1).setZimmerTyp("Küche", 1);

        listAll();

        mieterList.get(0).wohnungMieten(wohnungList.get(0));
        mieterList.get(0).wohnungMieten(wohnungList.get(0));
        mieterList.get(0).wohnungMieten(wohnungList.get(1));
        wohnungList.get(1).mieterWechseln(mieterList.get(1));
        mieterList.get(0).mietvertragKuenden(wohnungList.get(1));
        mieterList.get(1).mietvertragKuenden(wohnungList.get(1));
        wohnungList.get(1).ausziehen();
        wohnungList.get(0).mieten(mieterList.get(1));

        listAll();

        moebelList.add(new Moebel("Bett", "Holz", wohnungList.get(0).getZimmer(0)));
        moebelList.add(new Moebel("Schrank", "Holz", wohnungList.get(0).getZimmer(0)));
        moebelList.add(new Moebel("Toilette", "Keramik", wohnungList.get(1).getZimmer(1)));

        listAll();
    }

    public static void listAll() {
        System.out.println("Mieter-------------------");
        for (Mieter mieter : mieterList) {
            System.out.println("- " + mieter.getName());
            System.out.println("  - Wohnungen: " + mieter.getWohnungen());
        }
        System.out.println();
        System.out.println("Wohnungen----------------");
        for (Wohnung wohnung : wohnungList) {
            System.out.println("- " + wohnung.getAdresse());
            if (wohnung.istFrei()) {
                System.out.println("  - Ist frei?: Ja");
            } else {
                System.out.println("  - Ist frei?: Nein");
                System.out.println("  - Mieter: " + wohnung.getMieter().getName());
            }
            System.out.println("  - Zimmer -----");
            for (int i = 0; i < wohnung.getAnzahlZimmer(); i++) {
                Zimmer zimmer = wohnung.getZimmer(i);
                ausgabeZimmer(zimmer);
            }
            System.out.println();
        }
    }

    public static void ausgabeZimmer(Zimmer zimmer) {
        if (zimmer.getTyp() == null) {
            System.out.println("      Ungenutztes Zimmer");
        } else {
            System.out.println("      " + zimmer.getTyp());
        }
        for (Moebel moebel : zimmer.getMoebelList()) {
            System.out.println("        Moebel: " + zimmer.getMoebelList().indexOf(moebel));
            System.out.println("        - Typ: " + moebel.getTyp());
            System.out.println("        - Material: " + moebel.getMaterial());
            System.out.println("        - Steht in: " + moebel.getZimmer().getTyp());
        }
    }
}