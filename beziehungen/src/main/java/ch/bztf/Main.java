package ch.bztf;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Wohnung wohnung = new Wohnung(5, "Gartenweg 10");
        System.out.println(wohnung.getZimmerListe());
        Bett bett = new Bett();
        Bett bett2 = new Bett();
        Moebel nachtTisch = new Moebel("Nachttisch");
        nachtTisch.setMaterial("Holz");

        WC wc = new WC();
        Lavabo lavabo = new Lavabo();
        Dusche dusche = new Dusche();
        Moebel spiegel = new Moebel("Spiegel");

        bett.setPlaetze(2);
        bett2.setPlaetze(1);
        bett.setMaterial("Holz");
        bett2.setMaterial("Holz");

        wc.setMaterial("Emaille");
        dusche.setMaterial("Glas");
        dusche.setTuerTyp("Schiebetür");
        dusche.setTransparent(true);
        lavabo.setForm("Eckig");
        lavabo.setMaterial("Emaille");

        ArrayList<Moebel> moebelSchlafzimmer = new ArrayList<>();
        moebelSchlafzimmer.add(bett);
        moebelSchlafzimmer.add(bett2);
        moebelSchlafzimmer.add(nachtTisch);

        ArrayList<Moebel> moebelBadezimmer = new ArrayList<>();
        moebelBadezimmer.add(wc);
        moebelBadezimmer.add(dusche);
        moebelBadezimmer.add(lavabo);
        moebelBadezimmer.add(spiegel);

        ArrayList<Moebel> moebelWohnzimmer = new ArrayList<>();
        moebelWohnzimmer.add(new Sofa());
        moebelWohnzimmer.add(new Sofa());
        moebelWohnzimmer.add(new Couchtisch());

        wohnung.zimmerUmbauen(0, "Schlafzimmer", moebelSchlafzimmer);
        wohnung.zimmerUmbauen(1, "Badezimmer", moebelBadezimmer);
        wohnung.zimmerUmbauen(2, "Wohnzimmer", moebelWohnzimmer);
        wohnung.getZimmerListe().get(3).setTyp("Gym");

        Moebel hantelbank = new Moebel("Hantelbank");

        wohnung.getZimmerListe().get(3).moebelHinzufuegen(hantelbank);

        for (Zimmer zimmer : wohnung.getZimmerListe()) {
            System.out.println(zimmer.getTyp());
            for (Moebel moebel : zimmer.getMoebelListe()) {
                System.out.println("  - " + moebel.getTyp());
            }
        }
    }
}