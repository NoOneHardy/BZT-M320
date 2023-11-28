package ch.bztf;

import java.util.ArrayList;

public class Wohnung {
    private String adresse;
    private Mieter mieter;
    private int anzahlStockwerke = 1;
    private int anzahlZimmer;
    private double miete;
    private boolean frei;
    private final ArrayList<Zimmer> zimmerListe = new ArrayList<>();

    public Wohnung(int anzahlZimmer, String adresse) {
        setAdresse(adresse);
        setAnzahlZimmer(anzahlZimmer);
        for (int iZimmer = 0; iZimmer < anzahlZimmer; iZimmer++) {
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

    public void setMiete(double miete) {
        this.miete = miete;
    }

    public void setMieter(Mieter mieter) {
        this.mieter = mieter;
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
        Zimmer altesZimmer = zimmerListe.get(index);
        if (altesZimmer.getTyp().equals(typ)) {
            System.out.println("Dieses Zimmer ist schon von diesem Typ.");
            return null;
        }

        Zimmer neuesZimmer = new Zimmer();
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
                            System.out.println("Alle anderen WCs werden mit den alten Möbeln zurückgegeben.");
                        }
                    } else if (moebel.getClass().equals(Lavabo.class)) {
                        if (lavabo == null) {
                            lavabo = (Lavabo) moebel;
                            sonstigeMoebel.remove(moebel);
                        } else {
                            System.out.println("Ein Badezimmer kann nur ein Lavabo haben.");
                            System.out.println("Alle anderen Lavabos werden mit den alten Möbeln zurückgegeben.");
                        }
                    } else if (moebel.getClass().equals(Dusche.class)) {
                        if (dusche == null) {
                            dusche = (Dusche) moebel;
                            sonstigeMoebel.remove(moebel);
                        } else {
                            System.out.println("Ein Badezimmer kann nur eine Dusche haben.");
                            System.out.println("Alle anderen Duschen werden mit den alten Möbeln zurückgegeben.");
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
        }

        for (Moebel moebel : sonstigeMoebel) {
            neuesZimmer.moebelHinzufuegen(moebel);
        }

        zimmerListe.set(index, neuesZimmer);
        return alteMoebel;
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
}
