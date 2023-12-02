package ch.bztf;

import java.util.ArrayList;

public class Wohnung {
    private String adresse;
    private Mieter mieter;
    private int anzahlStockwerke = 1;
    private int anzahlZimmer;
    private double miete;
    private boolean frei = true;
    private final ArrayList<Zimmer> zimmerListe = new ArrayList<>();

    public Wohnung(int anzahlZimmer, String adresse) {
        setAdresse(adresse);
        setAnzahlZimmer(anzahlZimmer);
        for (int iZimmer = 0; iZimmer < getAnzahlZimmer(); iZimmer++) {
            zimmerListe.add(new Zimmer());
        }
    }

    public Wohnung(int anzahlZimmer, String adresse, int anzahlStockwerke) {
        this(anzahlZimmer, adresse);
        setAnzahlStockwerke(anzahlStockwerke);
    }


    public String getAdresse() {
        return adresse;
    }

    public Mieter getMieter() {
        return mieter;
    }

    public int getAnzahlStockwerke() {
        return anzahlStockwerke;
    }

    public int getAnzahlZimmer() {
        return anzahlZimmer;
    }

    public double getMiete() {
        return miete;
    }

    public boolean isFrei() {
        return frei;
    }

    public ArrayList<Zimmer> getZimmerListe() {
        return zimmerListe;
    }

    public Zimmer getZimmer(int index) {
        if (index < 0) index *= -1;
        if (index >= getAnzahlZimmer()) {
            System.out.println("Diese Wohnung hat nicht so viele Zimmer.");
            System.out.println("Das Zimmer mit dem Index 0 wird zurückgegeben.");
            index = 0;
        }
        return getZimmerListe().get(index);
    }

    public ArrayList<Schlafzimmer> getSchlafzimmerListe() {
        ArrayList<Schlafzimmer> schlafzimmerListe = new ArrayList<>();
        for (Zimmer zimmer : zimmerListe) {
            if (zimmer.getClass().equals(Schlafzimmer.class)) schlafzimmerListe.add((Schlafzimmer) zimmer);
        }
        return schlafzimmerListe;
    }

    public ArrayList<Badezimmer> getBadezimmerListe() {
        ArrayList<Badezimmer> badezimmerListe = new ArrayList<>();
        for (Zimmer zimmer : zimmerListe) {
            if (zimmer.getClass().equals(Badezimmer.class)) badezimmerListe.add((Badezimmer) zimmer);
        }
        return badezimmerListe;
    }

    public ArrayList<Wohnzimmer> getWohnzimmerListe() {
        ArrayList<Wohnzimmer> wohnzimmerListe = new ArrayList<>();
        for (Zimmer zimmer : zimmerListe) {
            if (zimmer.getClass().equals(Wohnzimmer.class)) wohnzimmerListe.add((Wohnzimmer) zimmer);
        }
        return wohnzimmerListe;
    }

    public void setMiete(double miete) {
        if (miete < 0) miete *= -1;
        this.miete = miete;
    }

    public void setMieter(Mieter mieter) {
        this.mieter = mieter;
        frei = mieter == null;
    }

    private void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    private void setAnzahlZimmer(int anzahlZimmer) {
        if (anzahlZimmer < 1) {
            System.out.println("Eine Wohnung benötigt mindestens ein Zimmer.");
            System.out.println("Die Anzahl Zimmer wird auf eins gesetzt");
            anzahlZimmer = 1;
        }
        this.anzahlZimmer = anzahlZimmer;
    }

    private void setAnzahlStockwerke(int anzahlStockwerke) {
        if (anzahlStockwerke < 1) {
            System.out.println("Eine Wohnung benötigt mindestens ein Stockwerk");
            System.out.println("Die Anzahl Stockwerke wird auf eins gesetzt");
            anzahlStockwerke = 1;
        }
        this.anzahlStockwerke = anzahlStockwerke;
    }

    public ArrayList<Moebel> zimmerUmbauen(int index, String typ, ArrayList<Moebel> moebelListe) {
        if (index < 0) index *= -1;
        if (index > getAnzahlZimmer()) {
            System.out.println("Die Wohnung " + getAdresse() + " hat nur " + getAnzahlZimmer() + " Zimmer.");
            System.out.println("Der angegebene Index " + index + " ist zu hoch.");
            System.out.println("Der Umbau wird nicht durchgeführt.");
            return new ArrayList<>();
        }
        typ = typ.substring(0, 1).toUpperCase() + typ.substring(1);
        Zimmer altesZimmer = zimmerListe.get(index);
        if (altesZimmer.getTyp().equals(typ)) {
            System.out.println("Dieses Zimmer ist bereits ein " + typ);
            return null;
        }

        Zimmer neuesZimmer;
        ArrayList<Moebel> sonstigeMoebel = new ArrayList<>(moebelListe);

        final ArrayList<Moebel> alteMoebel = altesZimmer.leeren();
        switch (typ) {
            case "Schlafzimmer":
                ArrayList<Bett> betten = new ArrayList<>();
                for (Moebel moebel : moebelListe) {
                    if (moebel.getClass().equals(Bett.class)) {
                        betten.add((Bett) moebel);
                        sonstigeMoebel.remove(moebel);
                    }
                }
                neuesZimmer = new Schlafzimmer(betten);
                break;
            case "Badezimmer":
                WC wc = null;
                Lavabo lavabo = null;
                Dusche dusche = null;
                for (Moebel moebel : moebelListe) {
                    if (moebel.getClass().equals(WC.class)) {
                        if (wc == null) {
                            wc = (WC) moebel;
                            sonstigeMoebel.remove(moebel);
                        } else {
                            System.out.println("Ein Badezimmer kann nur ein WC haben.");
                            System.out.println("Alle anderen WCs werden zu den sonstigen Möbeln hinzugefügt");
                        }
                    } else if (moebel.getClass().equals(Lavabo.class)) {
                        if (lavabo == null) {
                            lavabo = (Lavabo) moebel;
                            sonstigeMoebel.remove(moebel);
                        } else {
                            System.out.println("Ein Badezimmer kann nur ein Lavabo haben.");
                            System.out.println("Alle anderen Lavabos werden zu den sonstigen Möbeln hinzugefügt");
                        }
                    } else if (moebel.getClass().equals(Dusche.class)) {
                        if (dusche == null) {
                            dusche = (Dusche) moebel;
                            sonstigeMoebel.remove(moebel);
                        } else {
                            System.out.println("Ein Badezimmer kann nur eine Dusche haben.");
                            System.out.println("Alle anderen Duschen werden zu den sonstigen Möbeln hinzugefügt");
                        }
                    }
                }
                neuesZimmer = new Badezimmer(wc, lavabo, dusche);
                break;
            case "Wohnzimmer":
                ArrayList<Sofa> sofas = new ArrayList<>();
                ArrayList<Couchtisch> couchtische = new ArrayList<>();
                for (Moebel moebel : moebelListe) {
                    if (moebel.getClass().equals(Sofa.class)) {
                        sofas.add((Sofa) moebel);
                        sonstigeMoebel.remove(moebel);
                    }
                    if (moebel.getClass().equals(Couchtisch.class)) {
                        couchtische.add((Couchtisch) moebel);
                        sonstigeMoebel.remove(moebel);
                    }
                }
                neuesZimmer = new Wohnzimmer(couchtische, sofas);
                break;
            default:
                neuesZimmer = new Zimmer();
                neuesZimmer.setTyp(typ);
        }

        for (Moebel moebel : sonstigeMoebel) {
            neuesZimmer.moebelHinzufuegen(moebel);
        }

        neuesZimmer.setAnzahlLampen(altesZimmer.getAnzahlLampen());
        neuesZimmer.setLichtAn(false);
        neuesZimmer.setAnzahlFenster(altesZimmer.getAnzahlFenster());

        zimmerListe.set(index, neuesZimmer);
        return alteMoebel;
    }

    public void ausgabe() {
        System.out.println(getAdresse());
        System.out.println("\tAnzahl Stockwerke: " + getAnzahlStockwerke());
        System.out.println("\tAnzahl Zimmer: " + getAnzahlZimmer());
        for (Zimmer zimmer : getZimmerListe()) {
            System.out.println("\t\t" + zimmer.getTyp());
        }
        System.out.println("\tAnzahl Schlafzimmer: " + getSchlafzimmerListe().size());
        System.out.println("\tAnzahl Wohnzimmer: " + getWohnzimmerListe().size());
        System.out.println("\tAnzahl Badezimmer: " + getBadezimmerListe().size());
        System.out.println("\tMiete: CHF " + getMiete());
        System.out.println("\tFrei: " + (isFrei() ? "Ja" : "Nein"));
        if (!isFrei()) System.out.println("\tMieter: " + getMieter().getName());
        System.out.println();
    }
}
