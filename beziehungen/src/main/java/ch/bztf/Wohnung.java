package ch.bztf;

import java.util.ArrayList;

/**
 * Eine Wohnung besteht aus mehreren Zimmern.
 * Wird die Wohnung zerstört, werden auch alle Zimmer zerstört.
 * Wohnungen können vermietet werden.
 */
public class Wohnung {
    /**
     * Die Adresse der Wohnung
     */
    private String adresse;
    /**
     * Der Mieter der Wohnung
     */
    private Mieter mieter;
    /**
     * Die Anzahl Stockwerke der Wohnung
     */
    private int anzahlStockwerke = 1;
    /**
     * Die Anzahl Zimmer der Wohnung
     */
    private int anzahlZimmer;
    /**
     * Die Miete der Wohnung
     */
    private double miete;
    /**
     * Ist die Wohnung frei?
     */
    private boolean frei = true;
    /**
     * Die Zimmer der Wohnung
     */
    private final ArrayList<Zimmer> zimmerListe = new ArrayList<>();

    /**
     * Erstellt eine Wohnung mit einer Adresse und deren Zimmer.
     * @param anzahlZimmer Die Anzahl Zimmer der Wohnung
     * @param adresse Die Adresse der Wohnung
     */
    public Wohnung(int anzahlZimmer, String adresse) {
        setAdresse(adresse);
        setAnzahlZimmer(anzahlZimmer);
        for (int iZimmer = 0; iZimmer < getAnzahlZimmer(); iZimmer++) {
            zimmerListe.add(new Zimmer());
        }
    }

    /**
     * Erstellt eine Wohnung mit einer Adresse, deren Zimmer und der Anzahl Stockwerke.
     * @param anzahlZimmer Die Anzahl Zimmer der Wohnung
     * @param adresse Die Adresse der Wohnung
     * @param anzahlStockwerke Die Anzahl Stockwerke der Wohnung
     */
    public Wohnung(int anzahlZimmer, String adresse, int anzahlStockwerke) {
        this(anzahlZimmer, adresse);
        setAnzahlStockwerke(anzahlStockwerke);
    }

    /**
     * Ein Getter für die Adresse der Wohnung.
     * @return Die Adresse der Wohnungh
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Ein Getter für den Mieter der Wohnung.
     * @return Der Mieter der Wohnung
     */
    public Mieter getMieter() {
        return mieter;
    }

    /**
     * Ein Getter für die Anzahl Stockwerke der Wohnung.
     * @return Die Anzahl Stockwerke der Wohnung
     */
    public int getAnzahlStockwerke() {
        return anzahlStockwerke;
    }

    /**
     * Ein Getter für die Anzahl Zimmer der Wohnung.
     * @return Die Anzahl Zimmer der Wohnung
     */
    public int getAnzahlZimmer() {
        return anzahlZimmer;
    }

    /**
     * Ein Getter für die Miete der Wohnung.
     * @return Die Miete der Wohnung
     */
    public double getMiete() {
        return miete;
    }

    /**
     * Ein Getter für das Property, ob die Wohnung frei ist.
     * @return Das Property, ob die Wohnung frei ist
     */
    public boolean isFrei() {
        return frei;
    }

    /**
     * Ein Getter für die Zimmer der Wohnung.
     * @return Die Zimmer der Wohnung
     */
    public ArrayList<Zimmer> getZimmerListe() {
        return zimmerListe;
    }

    /**
     * Ein Getter für ein bestimmtes Zimmer der Wohnung.
     * @param index Der Index des Zimmers
     * @return Das Zimmer der Wohnung
     */
    public Zimmer getZimmer(int index) {
        if (index < 0) index *= -1;
        if (index >= getAnzahlZimmer()) {
            System.out.println("Diese Wohnung hat nicht so viele Zimmer.");
            System.out.println("Das Zimmer mit dem Index 0 wird zurückgegeben.");
            index = 0;
        }
        return getZimmerListe().get(index);
    }

    /**
     * Ein Getter für die Schlafzimmer der Wohnung.
     * @return Die Schlafzimmer der Wohnung
     */
    public ArrayList<Schlafzimmer> getSchlafzimmerListe() {
        ArrayList<Schlafzimmer> schlafzimmerListe = new ArrayList<>();
        for (Zimmer zimmer : zimmerListe) {
            if (zimmer.getClass().equals(Schlafzimmer.class)) schlafzimmerListe.add((Schlafzimmer) zimmer);
        }
        return schlafzimmerListe;
    }

    /**
     * Ein Getter für die Badezimmer der Wohnung.
     * @return Die Badezimmer der Wohnung
     */
    public ArrayList<Badezimmer> getBadezimmerListe() {
        ArrayList<Badezimmer> badezimmerListe = new ArrayList<>();
        for (Zimmer zimmer : zimmerListe) {
            if (zimmer.getClass().equals(Badezimmer.class)) badezimmerListe.add((Badezimmer) zimmer);
        }
        return badezimmerListe;
    }

    /**
     * Ein Getter für die Wohnzimmer der Wohnung.
     * @return Die Wohnzimmer der Wohnung
     */
    public ArrayList<Wohnzimmer> getWohnzimmerListe() {
        ArrayList<Wohnzimmer> wohnzimmerListe = new ArrayList<>();
        for (Zimmer zimmer : zimmerListe) {
            if (zimmer.getClass().equals(Wohnzimmer.class)) wohnzimmerListe.add((Wohnzimmer) zimmer);
        }
        return wohnzimmerListe;
    }

    /**
     * Ein Setter für die Miete der Wohnung.
     * @param miete Die Miete der Wohnung
     */
    public void setMiete(double miete) {
        if (miete < 0) miete *= -1;
        this.miete = miete;
    }

    /**
     * Ein Setter für den Mieter der Wohnung.
     * @param mieter Der Mieter der Wohnung
     */
    public void setMieter(Mieter mieter) {
        this.mieter = mieter;
        frei = mieter == null;
    }

    /**
     * Ein Setter für die Adresse der Wohnung.
     * @param adresse Die Adresse der Wohnung
     */
    private void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Ein Setter für die Anzahl Zimmer der Wohnung.
     * @param anzahlZimmer Die Anzahl Zimmer der Wohnung
     */
    private void setAnzahlZimmer(int anzahlZimmer) {
        if (anzahlZimmer < 1) {
            System.out.println("Eine Wohnung benötigt mindestens ein Zimmer.");
            System.out.println("Die Anzahl Zimmer wird auf eins gesetzt");
            anzahlZimmer = 1;
        }
        this.anzahlZimmer = anzahlZimmer;
    }

    /**
     * Ein Setter für die Anzahl Stockwerke der Wohnung.
     * @param anzahlStockwerke Die Anzahl Stockwerke der Wohnung
     */
    private void setAnzahlStockwerke(int anzahlStockwerke) {
        if (anzahlStockwerke < 1) {
            System.out.println("Eine Wohnung benötigt mindestens ein Stockwerk");
            System.out.println("Die Anzahl Stockwerke wird auf eins gesetzt");
            anzahlStockwerke = 1;
        }
        this.anzahlStockwerke = anzahlStockwerke;
    }

    /**
     * Ändert den Typ eines Zimmers, räumt die alten Möbel aus und fügt neue Möbel hinzu.
     * @param index Der Index des Zimmers
     * @param typ Der neue Typ des Zimmers
     * @param moebelListe Die Liste der Möbel, die in das Zimmer hinzugefügt werden sollen
     * @return Die Möbel, die aus dem Zimmer entfernt wurden
     */
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

    /**
     * Gibt die Informationen der Wohnung in der Konsole aus.
     */
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
