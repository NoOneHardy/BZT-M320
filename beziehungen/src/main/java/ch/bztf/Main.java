package ch.bztf;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Wohnung rebenWeg12 = new Wohnung(5, "Rebenweg 12", 2);
        Wohnung rebenWeg13 = new Wohnung(4, "Rebenweg 13");
        Wohnung laubStrasse7 = new Wohnung(0, "Laubstrasse 7", 0);

        Mieter gasser = new Mieter("Jan Gasser");
        Mieter gritz = new Mieter("Melanie Gritz");

        Moebel spiegel = new Moebel("Spiegel");

        Bett bett1 = new Bett();
        Bett bett2 = new Bett();

        WC wc1 = new WC();
        WC wc2 = new WC();
        Dusche dusche1 = new Dusche();
        Dusche dusche2 = new Dusche();
        Lavabo lavabo1 = new Lavabo();
        Lavabo lavabo2 = new Lavabo();

        Couchtisch couchtisch = new Couchtisch();
        Sofa sofa = new Sofa();

        // START - Test Mieter
        gasser.wohnungMieten(rebenWeg12);
        gritz.wohnungMieten(rebenWeg12);
        gritz.wohnungMieten(rebenWeg13);

        gasser.mietvertragKuenden(rebenWeg13);
        gasser.mietvertragKuenden(laubStrasse7);
        gasser.mietvertragKuenden(rebenWeg12);
        // ENDE - Test Mieter

        // START - Test Moebel
        spiegel.setMaterial("Glas");
        spiegel.setWert(50);
        spiegel.setHersteller("IKEA");
        spiegel.setLaenge(40);
        spiegel.setBreite(40);

        spiegel.einrichten(rebenWeg12.getZimmer(0));
        spiegel.einrichten(rebenWeg12.getZimmer(0));
        spiegel.ausZimmerNehmen();
        spiegel.ausZimmerNehmen();
        // ENDE - Test Moebel

        // START - Test Bett
        bett1.setPlaetze(2);
        bett1.setGemacht(false);
        bett1.machen();
        // ENDE - Test Bett

        // START - Test Zimmer
        rebenWeg12.getZimmer(0).setAnzahlFenster(3);
        rebenWeg12.getZimmer(0).setAnzahlLampen(1);
        if (rebenWeg12.getZimmer(0).betaetigeLichtschalter()) {
            rebenWeg12.getZimmer(0).betaetigeLichtschalter();
        }
        rebenWeg12.getZimmer(-20).moebelHinzufuegen(spiegel);
        rebenWeg12.getZimmer(0).moebelHinzufuegen(spiegel);
        rebenWeg12.getZimmer(0).moebelEntfernen(spiegel);
        rebenWeg12.getZimmer(0).moebelEntfernen(spiegel);
        rebenWeg12.getZimmer(0).moebelHinzufuegen(spiegel);
        rebenWeg12.getZimmer(0).ausgabe();
        rebenWeg12.getZimmer(0).leeren();
        // ENDE - Test Zimmer

        // START - Test Wohnung
        rebenWeg12.setMiete(2150);

        rebenWeg12.zimmerUmbauen(1, "Schlafzimmer", new ArrayList<>());

        ArrayList<Moebel> schlafzimmerMoebel = new ArrayList<>();
        schlafzimmerMoebel.add(bett1);
        schlafzimmerMoebel.add(bett2);
        schlafzimmerMoebel.add(spiegel);
        rebenWeg12.zimmerUmbauen(0, "Schlafzimmer", schlafzimmerMoebel);
        rebenWeg12.zimmerUmbauen(0, "Schlafzimmer", new ArrayList<>());

        rebenWeg12.zimmerUmbauen(1, "Gym", new ArrayList<>());

        ArrayList<Moebel> badezimmerMoebel = new ArrayList<>();
        badezimmerMoebel.add(wc1);
        badezimmerMoebel.add(dusche1);
        badezimmerMoebel.add(lavabo1);
        badezimmerMoebel.add(wc2);
        badezimmerMoebel.add(dusche2);
        badezimmerMoebel.add(lavabo2);
        rebenWeg12.zimmerUmbauen(2, "Badezimmer", badezimmerMoebel);

        ArrayList<Moebel> wohnzimmerMoebel = new ArrayList<>();
        wohnzimmerMoebel.add(sofa);
        wohnzimmerMoebel.add(new Sofa());
        wohnzimmerMoebel.add(couchtisch);
        wohnzimmerMoebel.add(new Couchtisch());
        rebenWeg12.zimmerUmbauen(3, "Wohnzimmer", wohnzimmerMoebel);

        ArrayList<Moebel> bueroMoebel = new ArrayList<>();
        bueroMoebel.add(new Moebel("Schreibtisch"));
        bueroMoebel.add(new Moebel("Bürostuhl"));
        rebenWeg12.zimmerUmbauen(4, "Büro", bueroMoebel);

        rebenWeg13.zimmerUmbauen(-100, "Wohnzimmer", new ArrayList<>());
        // ENDE - Test Wohnung

        // START - Test Badezimmer
        ArrayList<Moebel> alteBueroMoebel = rebenWeg12.zimmerUmbauen(
                4,
                "Badezimmer",
                new ArrayList<>());
        for (Moebel moebel : alteBueroMoebel) System.out.println(moebel.getTyp());
        // ENDE - Test Badezimmer

        // START - Test Couchtisch
        couchtisch.setForm("Quadrat");
        couchtisch.dekorieren();
        couchtisch.dekorieren();
        couchtisch.aufraeumen();
        couchtisch.aufraeumen();
        couchtisch.dekorieren();
        // ENDE - Test Couchtisch

        // START - Test Dusche
        dusche1.setTransparent(true);
        dusche1.setTuerTyp("Schiebetür");
        // ENDE - Test Dusche

        // START - Test Lavabo
        lavabo1.setForm("Rund");
        lavabo1.setAnzahlHaehne(2);
        // ENDE - Test Lavabo

        // START - Test Schlafzimmer
        rebenWeg12.getSchlafzimmerListe().get(0).bettHinzufuegen(bett1);
        rebenWeg12.getSchlafzimmerListe().get(0).bettHinzufuegen(new Bett());
        rebenWeg12.getSchlafzimmerListe().get(0).bettEntfernen(bett1);
        rebenWeg12.getSchlafzimmerListe().get(0).bettEntfernen(bett1);
        rebenWeg12.getSchlafzimmerListe().get(0).bettEntfernen(bett2);
        rebenWeg13.getZimmer(0).moebelHinzufuegen(bett1);
        rebenWeg12.getSchlafzimmerListe().get(0).bettHinzufuegen(bett1);
        // ENDE - Test Schlafzimmer

        // START - Test Sofa
        sofa.setEcksofa(true);
        sofa.setPlaetze(3);
        // ENDE - Test Sofa

        // Start - Test WC
        wc1.benutzen();
        wc1.setElektrisch(true);
        wc2.spuelen();
        wc2.benutzen();
        wc1.benutzen();
        // ENDE - Test WC

        // START - Test Wohnzimmer
        rebenWeg13.zimmerUmbauen(-1, "Wohnzimmer", new ArrayList<>());
        Sofa sofa2 = rebenWeg13.getWohnzimmerListe().get(0).getSofas().get(0);
        Couchtisch couchtisch2 = rebenWeg13.getWohnzimmerListe().get(0).getCouchtische().get(0);

        rebenWeg13.getWohnzimmerListe().get(0).sofaHinzufuegen(sofa2);
        rebenWeg13.getWohnzimmerListe().get(0).sofaHinzufuegen(new Sofa());
        rebenWeg13.getWohnzimmerListe().get(0).sofaEntfernen(sofa);
        rebenWeg13.getWohnzimmerListe().get(0).sofaHinzufuegen(sofa);
        rebenWeg13.getWohnzimmerListe().get(0).sofaEntfernen(sofa2);
        rebenWeg12.getWohnzimmerListe().get(0).sofaEntfernen(sofa);

        rebenWeg13.getWohnzimmerListe().get(0).couchtischHinzufuegen(couchtisch2);
        rebenWeg13.getWohnzimmerListe().get(0).couchtischHinzufuegen(new Couchtisch());
        rebenWeg13.getWohnzimmerListe().get(0).couchtischEntfernen(couchtisch);
        rebenWeg13.getWohnzimmerListe().get(0).couchtischHinzufuegen(couchtisch);
        rebenWeg13.getWohnzimmerListe().get(0).couchtischEntfernen(couchtisch2);
        rebenWeg12.getWohnzimmerListe().get(0).couchtischEntfernen(couchtisch);

        // ENDE - Test Wohnzimmer

        // Ausgabe aller Instanzen
        rebenWeg12.ausgabe();
        for (Zimmer zimmer : rebenWeg12.getZimmerListe()) zimmer.ausgabe();
        rebenWeg13.ausgabe();
        for (Zimmer zimmer : rebenWeg13.getZimmerListe()) zimmer.ausgabe();
        laubStrasse7.ausgabe();
        for (Zimmer zimmer : laubStrasse7.getZimmerListe()) zimmer.ausgabe();
        gasser.ausgabe();
        gritz.ausgabe();
        spiegel.ausgabe();
        bett1.ausgabe();
        bett2.ausgabe();
        wc1.ausgabe();
        wc2.ausgabe();
        dusche1.ausgabe();
        dusche2.ausgabe();
        lavabo1.ausgabe();
        lavabo2.ausgabe();
        couchtisch.ausgabe();
        sofa.ausgabe();
    }
}